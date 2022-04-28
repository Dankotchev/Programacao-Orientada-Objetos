package empresa;

import java.util.ArrayList;
import modelo.funcionarios.*;

public class FolhaPagamento {

    ArrayList<FuncionarioBase> funcionarios = new ArrayList<>();

    public void cadFuncComum() {
        FuncionarioComum fComum = new FuncionarioComum();
        fComum.cad();
        this.funcionarios.add(fComum);
    }

    public void cadFuncComissionado() {
        FuncionarioComissionado fComissionado = new FuncionarioComissionado();
        fComissionado.cad();
        this.funcionarios.add(fComissionado);
    }

    public void cadFuncDiarista() {
        FuncionarioDiarista fDiarista = new FuncionarioDiarista();
        fDiarista.cad();
        this.funcionarios.add(fDiarista);
    }

    public void apresentar() {
        for (FuncionarioBase funcionario : this.funcionarios) {
            if (funcionario instanceof FuncionarioComum) {
                System.out.println("\nFuncionário Comum ::");
                funcionario.apresentar();
            }
            else if (funcionario instanceof FuncionarioComissionado) {
                System.out.println("\nFuncionário Comissionado ::");
                funcionario.apresentar();
            }
            else {
                System.out.println("\nFuncionário Diarista ::");
                funcionario.apresentar();                
            }
        }
    }
    
    public String totalIR (){
        float totalIR = 0;
        for (FuncionarioBase funcionario : this.funcionarios) {
            totalIR += funcionario.getIR();
        }
        String sTotal = String.format("%.2f", totalIR);
        return sTotal;
    }
    
    public String totalINSS (){
        float totalINSS = 0;
        for (FuncionarioBase funcionario : this.funcionarios) {
            totalINSS += funcionario.getINSS();
        }
        String sTotal = String.format("%.2f", totalINSS);
        return sTotal;
    }
    
    public String totalSalLiq (){
        float totalSalLiq = 0;
        for (FuncionarioBase funcionario : this.funcionarios) {
            totalSalLiq += funcionario.getSalarioLiquido();
        }
        String sTotal = String.format("%.2f", totalSalLiq);
        return sTotal;
    }

}
