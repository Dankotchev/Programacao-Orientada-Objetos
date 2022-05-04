package modelo;

import java.util.Scanner;
import modelo.interfaces.Movimento;

public class Venda implements Movimento {

    private int nrNota;
    private String data;
    private String formaPagamento;
    private double valor;

    @Override
    public String getMovimento() {
        return "Data: " + this.data + " - Venda: " + this.nrNota + " - Forma Pagamento: "
                + this.formaPagamento + " - Valor: R$ " + this.valor + "\n";
    }

    @Override
    public double getValorMovimento() {
        return this.valor;
    }

    public void ler() {
        Scanner s = new Scanner(System.in);

        System.out.print("Nr Nota Fiscal .....: ");
        this.nrNota = s.nextInt();
        s.nextLine();

        System.out.print("Data ...............: ");
        this.data = s.nextLine();

        System.out.print("Valor ..............: ");
        this.valor = s.nextDouble();
        s.nextLine();

        System.out.print("Forma de Pagamento .: ");
        this.formaPagamento = s.nextLine();
        System.out.println("");
        
        if (this.valor < 0) {
            this.valor *= -1;
        }
    }

}
