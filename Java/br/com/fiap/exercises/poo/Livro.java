package br.com.fiap.exercises.poo;

public class Livro {
    private String titulo;
    private String autor;
    private float preco;

    Livro(String titulo, String autor, float preco) {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    String getTitulo() {
        return titulo;
    }
    String getAutor() {
        return autor;
    }
    float getPreco() {
        return preco;
    }

    void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Você não pode tentar inserir um título vazio.");
        }
    }

    void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Você não pode tentar inserir um autorr vazio.");
        }
    }

    void setPreco(float valor) {
        if (valor < 0) {
            System.out.println("Você não pode inserir um valor negativo");
        } else {
            this.preco = valor;
        }
    }

    void exibirLivro() {
        System.out.println("Livro: "+titulo+" | Autor: "+autor+" | Preço: R$"+preco);
    }

    void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            double desconto = preco * (percentual/100);
            preco -= desconto;
            setPreco(preco);
        }
    }
}

