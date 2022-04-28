package principal;

import interfaces.Compra;
import interfaces.Funcionario;
import interfaces.MovimentoCaixa;
import interfaces.Venda;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<MovimentoCaixa> caixa = new ArrayList<>();
        double saldo = 0;
        
        Venda v = new Venda(1000, "Danilo", "5x", "14/04/2022", 365.78);
        caixa.add(v);
        
        Compra c = new Compra("Alagoanas", "04/04/2022", "09/04/2022", "15/05/2022",
                "Material necessário", 1475.98);
        caixa.add(c);

        Funcionario f = new Funcionario("04/05", "Lucas", "19/04/2022", 1000.00);
        caixa.add(f);

        System.out.println(v);
        System.out.println(c);
        System.out.println(f);
        
        for (MovimentoCaixa mc : caixa) {
            saldo += mc.getValorCaixa();
            mc.getDescricao();
        }
        System.out.println("\nSaldo do caixa: R$  " + saldo);

    }
}
