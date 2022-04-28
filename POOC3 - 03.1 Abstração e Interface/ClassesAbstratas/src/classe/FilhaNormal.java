package classe;

import classe.abstrata.MaeAbstrata;

public class FilhaNormal extends MaeAbstrata{

    @Override
    public void apresentar() {
        System.out.println("Essa é a classe filha");
        System.out.println("Nome : " +this.getNome());
        System.out.println("Valor: " + this.getValor());
    }

    @Override
    public int calcularValor() {
       return this.valor * 5;
    }
    
}
