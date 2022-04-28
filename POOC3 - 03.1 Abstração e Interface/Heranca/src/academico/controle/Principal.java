package academico.controle;

import academico.modelo.*;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        //Aluno a = new Aluno();
        
        //a.lerDados();
        //System.out.println("");
        //a.imprimirDados();
        
        ArrayList<Pessoa> todoMundo = new ArrayList<>();
        
        Pessoa p = new Pessoa();
        todoMundo.add(p);
        
        p = new Aluno();
        todoMundo.add(p);
        
        for (Pessoa pessoa : todoMundo) {
            pessoa.lerDados();
        }
        
        for (Pessoa pessoa : todoMundo) {
            pessoa.imprimirDados();
        }
    }
}
