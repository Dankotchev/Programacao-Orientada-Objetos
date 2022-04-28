package rotativo;

import java.util.Scanner;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private String nomeProprietario;
    private int vagaOcupada;
    private int estacionado;
    
    public Veiculo(){
        this.estacionado = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public int getVagaOcupada() {
        return vagaOcupada;
    }

    public int getEstacionado() {
        return estacionado;
    }

    public void estacionarVeiculo(int vaga){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nInforme a placa do Veículo: ");
        placa = scan.nextLine();
        System.out.print("Informe a Marca do Veículo: ");
        marca = scan.nextLine();
        System.out.print("Informe o Modelo do Veículo: ");
        modelo = scan.nextLine();
        System.out.print("Informe a Cor do Veículo: ");
        cor = scan.nextLine();
        System.out.print("Informe o nome do proprietário do Veículo: ");
        nomeProprietario = scan.nextLine();
        estacionado = 1;
        vagaOcupada = vaga;
    }
    
    public void liberarVaga(){
        this.estacionado = 0;
    }
}
