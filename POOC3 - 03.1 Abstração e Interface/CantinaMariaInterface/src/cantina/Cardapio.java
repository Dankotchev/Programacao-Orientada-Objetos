package cantina;

import cantina.util.GerirMenus;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Bebida;
import modelo.PratoPorcao;
import modelo.Industrializado;
import modelo.interfaces.ItemCardapio;

public class Cardapio {

    ArrayList<ItemCardapio> itens = new ArrayList<>();

    private void cadPP() {
        PratoPorcao p = new PratoPorcao();
        p.ler();
        this.itens.add(p);
    }

    private void cadB() {
        Bebida b = new Bebida();
        b.ler();
        this.itens.add(b);
    }

    private void cadI() {
        Industrializado i = new Industrializado();
        i.ler();
        this.itens.add(i);
    }

    public void cadastrarProduto() {
        GerirMenus gmu = new GerirMenus();
        int tipo;
        Scanner s = new Scanner(System.in);

        do {
            tipo = gmu.opCad();
            switch (tipo) {
                case 1:
                    this.cadPP();
                    break;

                case 2:
                    this.cadB();
                    break;

                case 3:
                    this.cadI();
                    break;
            }
        } while (tipo != 0);
    }

    public void apresentarReceitas() {
        for (ItemCardapio item : this.itens) {
            if (item instanceof PratoPorcao) {
                ((PratoPorcao) item).apresentarReceita();
            }
        }
    }

    public int qtdBebidas() {
        int quantidade = 0;
        for (int item = 0; item < this.itens.size(); item++) {
            ItemCardapio get = this.itens.get(item);
            if (get instanceof Object) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public void apresentarCardapio() {
        for (ItemCardapio item : this.itens) {
            System.out.println("Código: " + item.getCodigo() + "\t"
                    + item.getDescricao() + "\tR$ " + item.getValor());
        }
    }

    public void apresentarEstoque() {
        int estoque = 0;
        for (ItemCardapio item : this.itens) {
            if ((item instanceof Industrializado) || (item instanceof Bebida)) {
                System.out.println("Código: " + item.getCodigo() + "\t"
                        + item.getDescricao());
                estoque++;
            }
        }
        System.out.println("\nO estoque é de " + estoque + " produtos diferentes.");
    }

    private int localizar(int codigo) {
        int posicao = -1;
        int i = 0;
        for (ItemCardapio proc : itens) {
            if (proc.getCodigo() == codigo) {
                posicao = i;
            }
            i++;
        }
        return posicao;
    }

    public void venda() {
        int codigo, quantidade;
        ItemCardapio item; // é nulo
        double total = 0;
        int posicao;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Informe o código do pedido, ou 0 para finalizar: ");
            codigo = s.nextInt();
            
            if (codigo != 0) {
                posicao = this.localizar(codigo);
                
                if (posicao == -1) {
                    System.out.println("Não existe produto com esse código");
                } 
                else {
                    item = itens.get(posicao);
                    System.out.println(item.getDescricao()
                            + " - R$ " + item.getValor());
                    System.out.println("Quantidade no pedido: ");
                    quantidade = s.nextInt();
                    total += (quantidade * item.getValor());
                }
            }
        } while (codigo != 0);

        System.out.println("Total da venda: R$ " + total);
    }
}
