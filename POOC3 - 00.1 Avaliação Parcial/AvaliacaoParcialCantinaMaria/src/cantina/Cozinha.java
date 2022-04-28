/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantina;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.cardapio.*;

/**
 *
 * @author Aluno
 */
public class Cozinha {

    ArrayList<Alimentos> cardapio = new ArrayList<>();

    public void cadPP() {
        PratosPorcoes pp = new PratosPorcoes();
        pp.cad();
        this.cardapio.add(pp);
    }

    public void cadBebidas() {
        Bebidas b = new Bebidas();
        b.cad();
        this.cardapio.add(b);
    }

    public void cadIndustrializado() {
        Industrializados i = new Industrializados();
        i.cad();
        this.cardapio.add(i);
    }

    public void apresentarLivroReceitas() {
        for (Alimentos alimentos : this.cardapio) {
            if (alimentos instanceof PratosPorcoes) {
                ((PratosPorcoes) alimentos).apresentarReceita();

            }
        }
    }

    public int qntBebidas() {
        int q = 0;
        for (Alimentos alimentos : this.cardapio) {
            if (alimentos instanceof Bebidas) {
                q++;
            }
        }
        return q;
    }

    public void apresentarCardapio() {
        for (Alimentos alimentos : this.cardapio) {
            System.out.println("----");
            alimentos.apresentar();
        }
    }

    private double localizar(int codigo) {
        for (Alimentos alimentos : this.cardapio) {
            if (alimentos.getCodigo() == codigo) {
                alimentos.apresentar();
                return alimentos.getValor();
            }
        }
        return 0.0;
    }

    public void realizarVenda() {
        Scanner s = new Scanner(System.in);

        int codigo, continuar, pedido, quantidade;
        double totalVenda = 0.0, valorItem;

        do {
            System.out.print("Informe o código do item desejado: ");
            codigo = s.nextInt();
            
            valorItem = this.localizar(codigo);

            if (valorItem != 0.0) {
                System.out.print("Deseja solicitar o item?\n\t1 - SIM\n\t0 - NÂO\n\t:: ");
                pedido = s.nextInt();
                if (pedido == 1) {
                    System.out.print("informe a quantidade desejada: ");
                    quantidade = s.nextInt();
                    totalVenda += quantidade * valorItem;
                }
            } else {
                System.out.println("Código não corresponte há um item do Cardápio.");
            }
            
            System.out.println("Deseja adicionar um outro item ao pedido\n\t1 - SIM\n\t0 - NÂO\n\t:: ");
            continuar = s.nextInt();
            
            if (continuar == 0) {
                System.out.println("O Total do pedido foi de R$ " + totalVenda);
            }
            
            
        } while (continuar != 0);
    }

}
