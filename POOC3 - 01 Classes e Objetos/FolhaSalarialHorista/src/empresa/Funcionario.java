package empresa;

import java.util.Scanner;

public class Funcionario {

    private String nome;
    private String departamento;
    private int registro;
    private int horaTrabalhada;
    private double valorHora;
    private int horaNormalTrabalhada;
    private int horaExtraTrabalhada;
    private double valorTotalHoraExtra;
    private double salarioBruto;
    private double recolherIR;
    private double contribuicaoINSS;
    private double salarioLiquido;

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getRegistro() {
        return registro;
    }

    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHoraExtraTrabalhada() {
        return horaExtraTrabalhada;
    }

    public double getValorHoraExtra() {
        return valorTotalHoraExtra;
    }

    public int getHoraNormalTrabalhada() {
        return horaNormalTrabalhada;
    }

    public double getValorTotalHoraExtra() {
        return valorTotalHoraExtra;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getRecolherIR() {
        return recolherIR;
    }

    public double getContribuicaoINSS() {
        return contribuicaoINSS;
    }

    private void divisaoHorasTrabalhadas() {
        int ch = 220;
        if (horaTrabalhada <= ch) {
            this.horaNormalTrabalhada = horaTrabalhada;
            this.horaExtraTrabalhada = 0;
        }
        else {
            this.horaNormalTrabalhada = ch;
            this.horaExtraTrabalhada = horaTrabalhada - ch;
        }
    }

    private void valorHoraExtras() {
        this.valorTotalHoraExtra = horaExtraTrabalhada * (valorHora * 1.5);
    }

    private void valorSalarioBruto() {
        this.salarioBruto = (valorHora * horaNormalTrabalhada)
                + valorTotalHoraExtra;
    }

    public void obterInformacoes() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o nome do Funcionário: ");
        nome = scan.nextLine();
        System.out.print("Informe o Departamento do Funcionário: ");
        departamento = scan.nextLine();
        System.out.print("Informe o número de Registro: ");
        registro = scan.nextInt();
        System.out.print("Informe a Quantidade de Horas trabalhada: ");
        horaTrabalhada = scan.nextInt();
        System.out.print("Informe o Valor da Hora trabalhada: ");
        valorHora = scan.nextDouble();
        System.out.println();
        
        divisaoHorasTrabalhadas();
        valorHoraExtras();
        valorSalarioBruto();
        recolherIR = calculoIR();
        contribuicaoINSS = calculoINSS();
        salarioLiquido = salarioBruto - recolherIR - contribuicaoINSS;
    }

    public void apresentarDados() {
        String valSB = String.format("%.2f", salarioBruto);
        String valINSS = String.format("%.2f", contribuicaoINSS);
        String valIR = String.format("%.2f", recolherIR);
        String valSL = String.format("%.2f", salarioLiquido);

        System.out.println("Número de Registro: " + registro + "\tNome do Funcionário: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas Trabalhadas: " + horaTrabalhada + "(Horas Extras: " + horaExtraTrabalhada + ")");
        System.out.println("Salário Bruto: \t\t\tR$ " + valSB);
        System.out.println("Contribuiçao INSS: \t\tR$ - " + valINSS);
        System.out.println("Imposto de Renda Recolhido: \tR$ - " + valIR);
        System.out.println("Salário Líquido: \tR$ " + valSL);
        System.out.println("");
    }

    public void apresentarHoraExtras() {
        String valHRX = String.format("%.2f", valorTotalHoraExtra);
        
        System.out.println("Número de Registro: " + registro + "\tNome do Funcionário: " + nome);
        System.out.println("Horas Extras Trabalhadas: " + horaExtraTrabalhada);
        System.out.println("Valor recebido em Horas Extras: " + valHRX);
        System.out.println("");
    }

    public void apresentarDepartamento() {
        String valSL = String.format("%.2f", salarioLiquido);
        
        System.out.println("Número de Registro: " + registro + "\tNome do Funcionário: " + nome);
        System.out.println("Horas Trabalhadas: " + horaTrabalhada + "\t\tSalário Líquido: R$ " + valSL);
    }

    private double calculoIR() {
        double valorRecolher;
        if (this.salarioBruto > 4664.68) {
            valorRecolher = this.salarioBruto * 0.275;
        }
        else if (this.salarioBruto > 3751.05 && this.salarioBruto <= 4664.68) {
            valorRecolher = this.salarioBruto * 0.225;
        }
        else if (this.salarioBruto > 2826.65 && this.salarioBruto <= 3751.05) {
            valorRecolher = this.salarioBruto * 0.150;
        }
        else if (this.salarioBruto > 1903.98 && this.salarioBruto <= 2826.65) {
            valorRecolher = this.salarioBruto * 0.075;
        }
        else {
            valorRecolher = 0;
        }
        return valorRecolher;
    }

    private double calculoINSS() {
        double contribuicao;
        if (this.salarioBruto > 2920.00) {
            contribuicao = this.salarioBruto * 0.11;
        }
        else if (this.salarioBruto > 1750.00 && this.salarioBruto <= 2920.00) {
            contribuicao = this.salarioBruto * 0.09;
        }
        else {
            contribuicao = this.salarioBruto * 0.08;
        }
        return contribuicao;
    }
}
