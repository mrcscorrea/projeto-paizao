package br.com.fiap.project;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Produto extends Categoria {
    protected String nome;
    protected Long id;
    protected BigDecimal preco;
    protected LocalDateTime dataCadastro;
    protected String descricao;
    protected Categoria categoria;

    public Produto() {}
    public Produto(String nome, Long id, BigDecimal preco, LocalDateTime dataCadastro, String descricao, Categoria categoria) {
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.setDataCadastro(dataCadastro);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
    }

    public Produto(String nome, BigDecimal preco, LocalDateTime dataCadastro, String descricao, Categoria categoria) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDataCadastro(dataCadastro);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome; return this;
    }


    public Long getId() {
        return id;
    }
    public Produto setId(Long id) {
        this.id = id; return this;
    }


    public BigDecimal getPreco() {
        return preco;
    }
    public Produto setPreco(BigDecimal preco) {
        this.preco = preco; return this;
    }


    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public Produto setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro; return this;
    }


    public String getDescricao() {
        return descricao;
    }
    public Produto setDescricao(String descricao) {
        this.descricao = descricao; return this;
    }


    public Categoria getCategoria() {
        return categoria;
    }
    public Produto setCategoria(Categoria categoria) {
        this.categoria = categoria; return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return nome.equals(produto.nome) && categoria.equals(produto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, categoria);
    }
}
