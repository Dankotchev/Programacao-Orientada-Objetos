package academico.controle;

import academico.modelo.Aluno;
import academico.modelo.Pessoa;
import academico.modelo.Professor;
import academico.modelo.TecnicoAdm;
import java.util.ArrayList;

public class Gerenciador {
    ArrayList<Pessoa> universidade = new ArrayList<>();
    
    public void alunoInserir(){
        Aluno a = new Aluno();
        a.ler();
        universidade.add(a);
    }
    
    public void professorInserir(){
        Professor p = new Professor();
        p.ler();
        universidade.add(p);
    }
    
    public void tecnicoAdmInserir(){
        TecnicoAdm t = new TecnicoAdm();
        t.ler();
        universidade.add(t);
    }
    
    public void apresentarUniversidade(){
        for (Pessoa pessoa : universidade) {
            pessoa.apresentar();
        }
    }
}
