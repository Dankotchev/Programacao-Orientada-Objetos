package universidade;

public class Gerenciador {

    private Disciplina[] dis;
    private final int tamanho;

    public Gerenciador() {
        this.tamanho = 7;
        dis = new Disciplina[tamanho];
        for (int i = 0; i < tamanho; i++) {
            dis[i] = new Disciplina();
        }

    }

    private boolean verificarInclusao() {
        if (dis[0].getNome() == null) {
            System.out.println("\nErro, disciplinas não cadastradas.");
            return true;
        }
        else {
            return false;
        }
    }

    public void inserirInformacoes() {
        System.out.println("\nInserir informações das Disciplinas");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Disciplina #" + (i + 1));
            dis[i].lerDados();
        }
    }

    public void inserirNotas() {
        if (verificarInclusao()) {
        }
        else {
            System.out.println("\nInserir Nota nas Disciplinas");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Disciplina " + dis[i].getNome());
                dis[i].digitarNotas();
            }
        }
    }

    public void inserirFrequencia() {
        if (verificarInclusao()) {
        }
        else {
            System.out.println("\nInserir Frequência nas Disciplinas");
            for (int i = 0; i < 7; i++) {
                System.out.println("Disciplina " + dis[i].getNome());
                dis[i].entrarFrequencia();
            }
        }
    }

    public void apresentarDados() {
        if (verificarInclusao()) {
        }
        else {
            System.out.println("\nApresentar Informações das Disciplinas");
            for (int i = 0; i < tamanho; i++) {
                System.out.println();
                dis[i].apresentarDados();
            }
        }
    }

    public void apresentarSituacao() {
        if (verificarInclusao()) {
        }
        else {
            System.out.println("\nApresentar Situação nas Disciplinas");
            System.out.println();
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Disciplina " + dis[i].getNome() + ": " + dis[i].apresentarSituacao());
            }
        }
    }

    public void apresentarMedias() {
        if (verificarInclusao()) {
        }
        else {
            System.out.println("\nApresentar Médias nas Disciplinas");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Disciplina " + dis[i].getNome() + ": " + "Sua média foi de "
                        + dis[i].retonarMedia());
            }
        }
    }
}
