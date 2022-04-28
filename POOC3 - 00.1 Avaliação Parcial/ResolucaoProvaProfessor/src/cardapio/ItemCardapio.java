/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ItemCardapio {
    private int codigo;
    private String nome;
    private double valor;
    
    public void ler()
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        this.nome = teclado.nextLine();
        System.out.println("Digite o valor");
        this.valor = teclado.nextDouble();
    }
    
    public void apresentar()
    {
        System.out.println("Codigo - " + this.codigo);
        System.out.println("Nome - " + this.nome);
        System.out.println("Valor - " + this.valor);        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }
      
    public String getDescricaoCompleta()
    {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }
    
}
