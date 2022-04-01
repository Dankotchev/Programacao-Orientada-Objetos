package modelo.funcionarios;

import java.util.Scanner;

public class FuncionarioBase {

    private String nome;
    private String cargo;
    private int nRegistro;

    
    public void cad(){
        Scanner s = new Scanner(System.in);
        System.out.print("\tNome do Funcionário .: ");
        this.nome = s.nextLine();
        
        System.out.print("\tCargo do Funcionário : ");
        this.cargo = s.nextLine();
        
        System.out.print("\tNúmero de Registro ..: ");
        this.nRegistro = s.nextInt();
    }
    
    public void apresentar(){
        String salBruto = String.format("%.2f", this.getSalarioBruto());
        String inss = String.format("%.2f", this.getINSS());
        String ir = String.format("%.2f", this.getIR());
        String salLiq = String.format("%.2f", this.getSalarioLiquido());
        
        System.out.println("Nome do Funcionário .......: " + this.nome);
        System.out.println("Salario Bruto .............: R$ " + salBruto);
        System.out.println("Contribuição INSS .........: R$ " + inss);
        System.out.println("Imposto de Renda recolhido : R$ " + ir);
        System.out.println("Salário Liquido ...........: R$ " + salLiq);
    }
    
    public float getSalarioBruto() {
        return (float) 0.0;
    }

    public float getINSS() {
        float valorINSS, salBruto = this.getSalarioBruto();
        if (salBruto > 2000.00) {
            valorINSS = (float) (salBruto * 0.11);
        }
        else {
            valorINSS = (float) (salBruto * 0.08);
        }
        return valorINSS;
    }
    
    public float getIR (){
        float valorIR, salBruto = this.getSalarioBruto();
         if (salBruto > 4000.00) {
            valorIR = (float) (salBruto * 0.25);
        }
        else if (salBruto > 2000.00 && salBruto <= 4000.00) {
            valorIR = (float) (salBruto * 0.15);
        }
        else {
            valorIR = 0;
        }
       return valorIR;
    }
    
    public float getSalarioLiquido (){
        return this.getSalarioBruto() - this.getINSS() - this.getIR();
    }
}
