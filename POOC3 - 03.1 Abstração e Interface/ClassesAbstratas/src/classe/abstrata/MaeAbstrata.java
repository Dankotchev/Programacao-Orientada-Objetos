package classe.abstrata;

import java.util.Scanner;

public abstract class MaeAbstrata {

    private String nome;
    protected int valor;

    public String getNome() {
        return this.nome;
    }
    
    public int getValor() {
        return this.valor;
    }

    public void ler() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome");
        this.nome = s.nextLine();

        System.out.println("Digite o valor");
        this.valor = s.nextInt();
    }

    public abstract void apresentar();

    public abstract int calcularValor();

}
