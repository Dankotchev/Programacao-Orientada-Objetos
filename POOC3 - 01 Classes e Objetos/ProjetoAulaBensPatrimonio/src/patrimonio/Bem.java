package patrimonio;

import java.util.Scanner;

public class Bem {

    // Definição dos atributos da classe Bem
    private int numeroPatrimonio;
    private String tipo;
    private String descricao;
    private double valorCompra;
    private String dataCompra;
    private String local;
    private String responsavel;
    private String situacao;

    public void preencherDados() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nCadastro de Bem Patrimoniado");

        System.out.print("Número ..........: ");
        numeroPatrimonio = scan.nextInt();

        System.out.print("Tipo ............: ");
        tipo = scan.nextLine();
        tipo = scan.nextLine();

        System.out.print("Descrição .......: ");
        descricao = scan.nextLine();

        System.out.print("Valor da Compra .: ");
        valorCompra = scan.nextDouble();

        System.out.print("Data da Compra ..: ");
        dataCompra = scan.nextLine();
        dataCompra = scan.nextLine();

        System.out.print("Local ...........: ");
        local = scan.nextLine();

        System.out.print("Responsável .....: ");
        responsavel = scan.nextLine();

        situacao = "Em uso";
    }

    public void apresentarDados() {
        System.out.println("\nApresentando informações sobre o Bem Patrimoniado");
        System.out.println("Número ..........: " + numeroPatrimonio);
        System.out.println("Tipo ............: " + tipo);
        System.out.println("Descrição .......: " + descricao);
        System.out.println("Valor da Compra .: " + valorCompra);
        System.out.println("Data da Compra ..: " + dataCompra);
        System.out.println("Local ...........: " + local);
        System.out.println("Responsável .....: " + responsavel);
        System.out.println("Situação ........: " + situacao);

    }

    public void enviarManutencao() {
        situacao = "Em manutenção";
    }

    public void retornarManutencao() {
        situacao = "Em uso";
    }

    public void depreciarBem(double percentual) {
        valorCompra = valorCompra - valorCompra * percentual;
    }
    
    public double determinarValorAtual (double percentual)
    {
        return  valorCompra = valorCompra - valorCompra * percentual;
    }

    public int getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public String getLocal() {
        return local;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getSituacao() {
        return situacao;
    }
    

    
    
    
    
    
}
