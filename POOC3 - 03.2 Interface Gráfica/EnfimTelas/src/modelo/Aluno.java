package modelo;
public class Aluno {
    private String prontuario;
    private String nome;
    private String curso;

    public Aluno(String prontuario, String nome, String curso) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.curso = curso;
    }
    
    public Aluno () {
        
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
