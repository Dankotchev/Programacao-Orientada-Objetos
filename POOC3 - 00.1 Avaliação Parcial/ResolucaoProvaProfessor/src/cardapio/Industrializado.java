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
public class Industrializado extends ItemCardapio{
    private String marca;
    private String sabor;
    
    @Override
    public void ler()
    {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        
        System.out.println("Cadastrando Industrializados - código 3000 a 3999");
        System.out.println("Digite o codigo");
        do {
            codigo = teclado.nextInt();        
        } while (codigo < 3000 || codigo >= 4000);
 
        super.setCodigo(codigo);
        
        super.ler();

        System.out.println("Digite a marca");
        this.marca = teclado.nextLine();        
        System.out.println("Sabor");
        this.sabor = teclado.nextLine();
    }   

    @Override
    public void apresentar()
    {
        super.apresentar();
        System.out.println("Marca - " + this.marca);
        System.out.println("Sabor - " + this.sabor);
    }    
    
    
    @Override
    public String getDescricaoCompleta()
    {
        return super.getNome() + " – " + this.marca + 
                    " – " + this.sabor;
    }     
}
