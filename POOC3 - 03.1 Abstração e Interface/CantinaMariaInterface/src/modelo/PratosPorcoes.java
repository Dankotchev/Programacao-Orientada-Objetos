package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.interfaces.ItemCardapio;

public class PratosPorcoes implements ItemCardapio {

    private int codigo;
    private String nome;
    private double valor;
    private int quantPessoas;
    private String descricao;
    private ArrayList<String> ingredientes = new ArrayList<>();

    public void ler() {
        Scanner s = new Scanner(System.in);
        String temIngredientes;
        int codigo;

        System.out.println("Cadastrando Pratos e Porções - código 1000>");
        System.out.println("Digite o codigo");
        do {
            codigo = s.nextInt();
        } while (codigo < 1000 || codigo > 2000);

        this.codigo = codigo;

        System.out.println("Digite o nome");
        this.nome = s.nextLine();

        System.out.println("Digite o valor");
        this.valor = s.nextDouble();

        System.out.println("Serve quantas pessoas");
        this.quantPessoas = s.nextInt();

        System.out.println("Digite a descrição");
        s.nextLine();
        this.descricao = s.nextLine();

        do {
            System.out.println("Digite um ingrediente");
            String ingrediente = s.nextLine();
            this.ingredientes.add(ingrediente);
            // this.ingredientes.add(teclado.nextLine());
            System.out.println("Tem mais ingredientes <S/N>");
            temIngredientes = s.nextLine();
        } while (temIngredientes.equals("S"));
    }

    public void apresentar() {
        System.out.println("Codigo - " + this.codigo);
        this.getDescricao();
        System.out.println("Valor - " + this.valor);

//        System.out.println("Ingredientes");          
//        
//        for(int i=0; i< this.ingredientes.size(); i++)
//        {
//            System.out.println(i + " - " + this.ingredientes.get(i));
//        }
//        
//        int i = 1;
//        for(String ingrediente : ingredientes)
//        {
//            System.out.println(i+" - "+ ingrediente);
//            i++;
//        }   
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public String getDescricao() {
        return "Nome: " + this.nome + " - Descrição: " + this.descricao
                + " - Serve  " + this.quantPessoas + " pessoas.";
    }

    @Override
    public double getValor() {
        return this.valor;
    }

}
