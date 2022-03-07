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
package encargos;

/**
 *
 * @author Danilo Quirino
 */
public class DescontoSalarial {

    public double calculoIR(double salarioBruto) {
        double valorRecolher;
        if (salarioBruto > 4664.68) {
            valorRecolher = salarioBruto * 0.275;
        } else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
            valorRecolher = salarioBruto * 0.225;
        } else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
            valorRecolher = salarioBruto * 0.150;
        } else if (salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
            valorRecolher = salarioBruto * 0.075;
        } else {
            valorRecolher = 0;
        }
        return valorRecolher;
    }
    
    public double calculoINSS(double salarioBruto){
        double contribuicao;
        if (salarioBruto > 2920.00) {
            contribuicao = salarioBruto * 0.11;
        } else if (salarioBruto > 1750.00 && salarioBruto <= 2920.00) {
            contribuicao = salarioBruto * 0.09;
        } else {
            contribuicao = salarioBruto * 0.08;
        }
        return contribuicao;
    }
}
