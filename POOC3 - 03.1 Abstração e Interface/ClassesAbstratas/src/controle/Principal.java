package controle;

import classe.FilhaNormal;
import classe.abstrata.MaeAbstrata;

public class Principal {

    public static void main(String[] args) {
        
        MaeAbstrata classeMae = new FilhaNormal();
        
        classeMae.ler();
        classeMae.apresentar();
        classeMae.calcularValor();
        classeMae.apresentar();
    }
}
