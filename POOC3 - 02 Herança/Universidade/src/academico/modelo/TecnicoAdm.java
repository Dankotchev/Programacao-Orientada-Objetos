package academico.modelo;

import java.util.Scanner;

public class TecnicoAdm extends Pessoa {

    private String setor;
    private String cargo;
    
    public TecnicoAdm (){
        this.ler();
    }

    @Override
    public void ler() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n:: Técnico Administrativo Selecionado ::");
        super.ler();
        System.out.print("Setor ............: ");
        this.setor = scan.nextLine();
        System.out.print("Cargo ............: ");
        this.cargo = scan.nextLine();
    }

    @Override
    public void apresentar() {
        System.out.println("\nTécnico Administrativo ::");
        super.apresentar();
        System.out.println("Setor ............: " + this.setor);
        System.out.println("Cargo ............: " + this.cargo);
    }
}
