package empresa;

import java.util.ArrayList;
import modelo.Despesa;
import modelo.Salario;
import modelo.Venda;
import modelo.interfaces.Movimento;

public class ControleFinanceiro {

    ArrayList<Movimento> fluxo = new ArrayList<>();

    public void incluirDespesa() {
        Despesa d = new Despesa();
        System.out.println("\nInforme os dados da Despesa :: ");
        d.ler();
        this.fluxo.add(d);
    }

    public void incluirVendas() {
        Venda v = new Venda();
        System.out.println("\nInforme os dados da Venda :: ");
        v.ler();
        this.fluxo.add(v);
    }

    public void incluirSalarios() {
        Salario s = new Salario();
        System.out.println("\nInforme os dados do Pagamento de Salário :: ");
        s.ler();
        this.fluxo.add(s);
    }

    public void listarDespesas() {
        for (Movimento item : this.fluxo) {
            if (item instanceof Despesa) {
                System.out.println(item.getMovimento());
            }
        }
    }

    public void listarVendas() {
        System.out.println("");
        for (Movimento item : this.fluxo) {
            if (item instanceof Venda) {
                System.out.println(item.getMovimento());
            }
        }
    }

    public void listarSalarios() {
        System.out.println("");
        for (Movimento item : this.fluxo) {
            if (item instanceof Salario) {
                System.out.println(item.getMovimento());
            }
        }
    }

    public void extrato() {
        double total = 0;
        System.out.println("");
        for (Movimento item : this.fluxo) {
            total += item.getValorMovimento();
            System.out.println(item.getMovimento());
        }
        System.out.println("\n\tSaldo Final: R$ " + total);
    }

}
