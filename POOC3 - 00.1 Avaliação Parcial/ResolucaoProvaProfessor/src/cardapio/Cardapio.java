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
public class Cardapio {

    private ArrayList<ItemCardapio> listaItens = new ArrayList<>();
    
    // Apresentar uma relação contendo todos os pratos produzidos pela Maria, 
    // com seus respectivos ingredientes enumerados ;
    public void apresentarPratos()
    {
        for (ItemCardapio item : listaItens )
        {
            if(item instanceof Prato)
                item.apresentar();
        }
    }
    
    // Apresentar a quantidade de diferentes tipos de bebidas;
    public int contarBebidas()
    {
        int quantidade = 0;
        for (ItemCardapio item : listaItens )
        {
            if(item instanceof Bebida)
                quantidade ++;
        }
        return quantidade;
    }   
    
    public void apresentarCardapio()
    {
        for (ItemCardapio item : listaItens )
        {
            System.out.println(item.getCodigo() + " - " +
                              item.getDescricaoCompleta() + " - " +
                              item.getValor());
        }
    }    
    
    public int localizar(int codigo)
    {
        int posicao = -1;
        int i = 0;
        for(ItemCardapio ic : listaItens)
        {
            if (ic.getCodigo() == codigo)
                posicao = i;
            i++;
        }
        return posicao;
    }
    
    
    // pedido de vários produtos e suas respectivas quantidades
    public void venda()
    {
        int codigo, quantidade;
        ItemCardapio item; // é nulo
        double total = 0;
        int pos;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("digite o codigo do item ou 0 -> finalizar");
            codigo = teclado.nextInt();
            if (codigo != 0)
            {
                pos = localizar(codigo);
                if (pos == -1)
                {
                    System.out.println("Não existe produto com esse código");
                }
                else
                {
                    item = listaItens.get(pos);
                    System.out.println(item.getDescricaoCompleta() + 
                                       " - R$ " + item.getValor());
                    System.out.println("Quantidade");
                    quantidade = teclado.nextInt();                
                    total = quantidade * item.getValor();
                }
            }
        } while (codigo != 0);
       
        System.out.println("Total da venda....: "+ total);
    }
    
    public void cadastrarProduto()
    {
        ItemCardapio item; // é nulo
        int tipo;
        Scanner teclado = new Scanner(System.in);        
        
        do {
            System.out.println("Digite o tipo do produto 1-prato 2-Bebidas 3-Demais 0-Sair");
            tipo = teclado.nextInt();
            
            switch(tipo)
            {
                case 1: item = new Prato();
                        item.ler();
                        this.listaItens.add(item);
                        break;
                case 2: item = new Bebida();
                        item.ler();
                        this.listaItens.add(item);
                        break;
                case 3: item = new Industrializado();
                        item.ler();
                        this.listaItens.add(item);
                        break;                        
            }
        
        } while(tipo != 0);
        
    }
    
}
