package visao;

import controle.ControleOrcamento;
import controle.excecao.NotExistException;
import java.util.Scanner;
import modelo.MateriaPrima;
import modelo.Orcamento;
import modelo.Servico;

public class Principal {

    public static void main(String[] args) {
        ControleOrcamento ctrlO = new ControleOrcamento ();
        Orcamento o = new Orcamento();
                
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo");
        System.out.println("Informe um código de Orçamento :: ");
        int codigoOrcamento;
        codigoOrcamento = scan.nextInt();
        
        try {
            
            o = ctrlO.localizar(codigoOrcamento);
            System.out.println(o.toString());
            System.out.println("Com os itens: ");
            for (MateriaPrima listaItens : o.getListaItens()) {
                System.out.println(listaItens.toString());
            }
            System.out.println("E os serviços: ");
            for (Servico listaServico : o.getListaServicos()) {
                System.out.println(listaServico.toString());
            }
            
            
        } catch (NotExistException ex) {
            System.out.println(ex.toString());
        }
       
        
        
}

}
