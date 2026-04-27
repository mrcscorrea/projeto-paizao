package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

import java.util.ArrayList;
import java.util.List;

public class PixMain {
    public static void main(String[] args) {

        Pagamento c1 = new CartaoCredito(2000);
        c1.pagar(200);

        Pagamento p1 = new Pix(1000);
        p1.pagar(100);

        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito(2000));
        pagamentos.add(new Pix(2000));

        for (Pagamento p : pagamentos) {
            p.pagar(150);
        }

        System.out.println(pagamentos.size());
        pagamentos.get(0).pagar(150);
    }
}
