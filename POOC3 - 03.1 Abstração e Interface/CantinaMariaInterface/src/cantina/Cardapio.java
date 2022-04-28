package cantina;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Bebidas;
import modelo.PratosPorcoes;
import modelo.Indrustrializados;
import modelo.interfaces.ItemCardapio;

public class Cardapio {
    ArrayList<ItemCardapio> itens = new ArrayList<>();
    
    public void cadastrarProduto()
    {
        ItemCardapio item; // é nulo
        int tipo;
        Scanner s = new Scanner(System.in);        
        
        do {
            System.out.println("Digite o tipo do produto 1-prato 2-Bebidas 3-Demais 0-Sair");
            tipo = s.nextInt();
            
            switch(tipo)
            {
                case 1: item = new PratosPorcoes();
                        item.ler();
                        this.itens.add(item);
                        break;
                case 2: item = new Bebidas();
                        item.ler();
                        this.itens.add(item);
                        break;
                case 3: item = new Industrializados();
                        item.ler();
                        this.itens.add(item);
                        break;                        
            }
        
        } while(tipo != 0);
        
    }
}
