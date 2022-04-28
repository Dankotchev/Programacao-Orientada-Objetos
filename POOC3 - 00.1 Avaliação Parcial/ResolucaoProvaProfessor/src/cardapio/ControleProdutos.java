/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapio;

/**
 *
 * @author Aluno
 */
public class ControleProdutos {
    
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        
        cardapio.cadastrarProduto();
        cardapio.apresentarCardapio();
        cardapio.apresentarPratos();
        System.out.println("Quantidade de bebidas = " + 
                            cardapio.contarBebidas());
        cardapio.venda();
        
        
    }
}
