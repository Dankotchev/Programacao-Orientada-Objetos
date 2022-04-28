package modelo;

import java.util.Scanner;
import modelo.abstratos.Produto;

public class Indrustrializados extends Produto{

    private String sabor;

    @Override
    public void ler() {
        Scanner s = new Scanner(System.in);
        int codigo;
        
        System.out.println("Cadastrando Industrializados - código 3000 a 3999");
        System.out.println("Digite o codigo");
        do {
            codigo = s.nextInt();        
        } while (codigo < 3000 || codigo >= 4000);
 
        super.setCodigo(codigo);
        
        super.ler();
      
        System.out.println("Sabor");
        this.sabor = s.nextLine();
    }

    @Override
    public String getDescricao() {
        return "Nome: " + super.nome + " - Marca: " + super.marca +
                " - Sabor: " + this.sabor;
    }


}
