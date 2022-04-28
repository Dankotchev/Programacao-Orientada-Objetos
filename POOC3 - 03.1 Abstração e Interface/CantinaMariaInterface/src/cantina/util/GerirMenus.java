package cantina.util;

import java.util.Scanner;

public class GerirMenus {
    
    protected int opCad(){
        int op;
        Scanner s = new Scanner(System.in);        
        
        do {
            System.out.println("Digite o tipo do produto a ser cadastrado:");
            System.out.println("1\t - Pratos e Porções");
            System.out.println("2\t - Bebidas");
            System.out.println("3\t - Industrializados");
            System.out.println("4\t - Serviços");
            System.out.println("0\t - Sair");
            
            op = s.nextInt();
    }while (op != 0);
}
