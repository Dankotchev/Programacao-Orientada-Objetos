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
public class Bebida extends ItemCardapio{
    private String marca;
    private int quantidademl;
    
    @Override
    public void ler()
    {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        
        System.out.println("Cadastrando bebidas - código 2000 a 2999");
        System.out.println("Digite o codigo");
        do {
            codigo = teclado.nextInt();        
        } while (codigo < 2000 || codigo >= 3000);
 
        super.setCodigo(codigo);
        
        super.ler();

        System.out.println("Digite a marca");
        this.marca = teclado.nextLine();        
        System.out.println("Quantidade ml");
        this.quantidademl = teclado.nextInt();
    }   

    @Override
    public void apresentar()
    {
        super.apresentar();
        System.out.println("Marca - " + this.marca);
        System.out.println("Quantidade de ml - " + this.quantidademl);
    }
    
    @Override
    public String getDescricaoCompleta()
    {
        return super.getNome() + " – " + this.marca + 
                    " – " + this.quantidademl;
    }      
     
}
