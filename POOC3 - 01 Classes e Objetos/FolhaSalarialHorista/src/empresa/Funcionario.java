/*
 * The MIT License
 *
 * Copyright 2022 Danilo Quirino.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package empresa;

import java.util.Scanner;
import encargos.DescontoSalarial;

/**
 *
 * @author Danilo Quirino
 */
public class Funcionario {

    private String nome;
    private String departamento;
    private int registro;
    private int horaTrabalhada;
    private double valorHora;
    private int horaNormalTrabalhada;
    private double horaExtraTrabalhada;
    private double valorTotalHoraExtra;
    private double salarioBruto;
    private double recolherIR;
    private double contribuicaoINSS;

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
    
    
    /*
    public Funcionario(String nome, String departamento, int registro, int horaTrabalhada, double valorHora) {
        this.nome = nome;
        this.departamento = departamento;
        this.registro = registro;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }
*/

    private void divisaoHorasTrabalhadas(){
        if (horaTrabalhada <= 220) {
            this.horaNormalTrabalhada = horaTrabalhada;
            this.horaExtraTrabalhada = 0;
        } else {
            this.horaNormalTrabalhada = 220;
            this.horaExtraTrabalhada = horaTrabalhada - 220;
        }
    }
    
    private void valorHoraExtras(){
        this.valorTotalHoraExtra = horaExtraTrabalhada * (valorHora * 1.5);
    }
    
    private void valorSalarioBruto(){
        this.salarioBruto = (valorHora * horaNormalTrabalhada) + 
                valorTotalHoraExtra;
    }
    
    public void obterInformacoes(){
        DescontoSalarial encargos = new DescontoSalarial();
        
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
        recolherIR = encargos.calculoIR(salarioBruto);
        contribuicaoINSS = encargos.calculoINSS(salarioBruto);
    }
    
    public void apresentarInformacoes (){
        
    }

}
