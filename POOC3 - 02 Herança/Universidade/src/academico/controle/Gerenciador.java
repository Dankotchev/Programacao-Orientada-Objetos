package academico.controle;

import academico.modelo.Aluno;
import academico.modelo.Pessoa;
import academico.modelo.Professor;
import academico.modelo.TecnicoAdm;
import java.util.ArrayList;

public class Gerenciador {

    ArrayList<Pessoa> universidade = new ArrayList<>();

    public void alunoInserir() {
        Aluno a = new Aluno();
        this.universidade.add(a);
    }

    public void professorInserir() {
        Professor p = new Professor();
        this.universidade.add(p);
    }

    public void tecnicoAdmInserir() {
        TecnicoAdm t = new TecnicoAdm();
        this.universidade.add(t);
    }

    public void apresentarUniversidade() {
        for (Pessoa pessoa : this.universidade) {
            pessoa.apresentar();
        }
    }

    public void apresentarAluno() {
        for (Pessoa pessoa : this.universidade) {
            if (pessoa instanceof Aluno) {
                pessoa.apresentar();
            }
        }
    }

}
