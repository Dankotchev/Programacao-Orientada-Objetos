/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Prato extends ItemCardapio {
    
    private int quantPessoas;
    private String descricao;
    private ArrayList<String> ingredientes = new ArrayList<>();
    
    @Override
    public void ler()
    {
        Scanner teclado = new Scanner(System.in);
        String temIngredientes;
        int codigo;
        
        System.out.println("Cadastrando Pratos e Porções - código 1000>");
        System.out.println("Digite o codigo");
        do {
            codigo = teclado.nextInt();        
        } while (codigo < 1000 || codigo > 2000);
 
        super.setCodigo(codigo);
        
        super.ler();
        
        System.out.println("Serve quantas pessoas");
        this.quantPessoas = teclado.nextInt();
        System.out.println("Digite a descrição");
        teclado.nextLine();
        this.descricao = teclado.nextLine();
        
        do {
            System.out.println("Digite um ingrediente");
            String ingrediente = teclado.nextLine();
            this.ingredientes.add(ingrediente);
            // this.ingredientes.add(teclado.nextLine());
            System.out.println("Tem mais ingredientes <S/N>");
            temIngredientes = teclado.nextLine();
        } while (temIngredientes.equals("S"));
        
    }
    
    public void apresentar()
    {
        super.apresentar();
        System.out.println("Serve - " + this.quantPessoas);
        System.out.println("Descrição - " + this.descricao);
        System.out.println("Ingredientes");          
        
        for(int i=0; i< this.ingredientes.size(); i++)
        {
            System.out.println(i + " - " + this.ingredientes.get(i));
        }
        
        int i = 1;
        for(String ingrediente : ingredientes)
        {
            System.out.println(i+" - "+ ingrediente);
            i++;
        }   
    }
    
    @Override
    public String getDescricaoCompleta()
    {
        return super.getNome() + " – " + this.descricao + 
                    " – serve " + this.quantPessoas + " pessoas";
    }    
    
}
