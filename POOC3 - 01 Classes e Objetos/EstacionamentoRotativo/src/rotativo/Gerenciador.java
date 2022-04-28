package rotativo;

public class Gerenciador {

    private Veiculo[] estacionamento;
    private final int totalVagas = 25;

    public Gerenciador() {
        estacionamento = new Veiculo[totalVagas];
        for (int i = 0; i < totalVagas; i++) {
            estacionamento[i] = new Veiculo();
        }
    }

    public void estacionarVeiculo() {
        int i = 0, veiculoEstacionado = 0;

        do {
            if (estacionamento[i].getEstacionado() == 0) {
                estacionamento[i].estacionarVeiculo(i);
                veiculoEstacionado = 1;
            }
            i++;
        } while (veiculoEstacionado == 0 && i < totalVagas);
        i--;

        if (veiculoEstacionado == 1) {
            System.out.println("O veículo foi estacionado na vaga #" + (estacionamento[i].getVagaOcupada() + 1));
        }
        else {
            System.out.println("Estacionamento cheio.");
        }
    }

    public void liberarVaga(int vaga) {
        if (estacionamento[vaga].getEstacionado() == 1) {
            estacionamento[vaga].liberarVaga();
            System.out.println("Veiculo retirado da vaga.");
        }
        else {
            System.out.println("Vaga atualmente vazia.");
        }
    }

    public void apresentarInformacoes(Veiculo v) {
        System.out.println("");
        System.out.println("Vaga N# " + (v.getVagaOcupada() + 1) + "\tPlaca: " + v.getPlaca());
        System.out.println("Marca: " + v.getMarca() + "\tModelo: " + v.getModelo()
                + "\tCor: " + v.getCor());
        System.out.println("Nome do Proprietário: " + v.getNomeProprietario());

    }

    public void relatorioSituacaoAtual() {
        for (int i = 0; i < totalVagas; i++) {
            if (estacionamento[i].getEstacionado() == 1) {
                apresentarInformacoes(estacionamento[i]);
            }
        }
    }

    public void situacaoVaga(int vaga) {
        if (estacionamento[vaga].getEstacionado() == 0) {
            System.out.println("Vaga Vazia no momento.");
        }
        else {
            System.out.println("Vaga Ocupada no momento.");
        }
    }

    public void localizarPlaca(String placa) {
        for (int i = 0; i < totalVagas; i++) {
            if ((estacionamento[i].getEstacionado() == 1)
                    && (estacionamento[i].getPlaca().equals(placa))) {
                System.out.println("O veículo está localizado na vaga "
                        + (estacionamento[i].getVagaOcupada() + 1));
            }
        }
    }

    public void localizarMarca(String marca) {
        for (int i = 0; i < totalVagas; i++) {
            if ((estacionamento[i].getEstacionado() == 1)
                    && (estacionamento[i].getMarca().equals(marca))) {
                apresentarInformacoes(estacionamento[i]);
            }
        }
    }

    public int qntVagasOcupadas() {
        int s = 0;
        for (int i = 0; i < totalVagas; i++) {
            if (estacionamento[i].getEstacionado() == 1) {
                s++;
            }
        }
        return s;
    }

    public int qntVagasDisponiveis() {
        int s = 0;
        for (int i = 0; i < totalVagas; i++) {
            if (estacionamento[i].getEstacionado() == 0) {
                s++;
            }
        }
        return s;
    }

}
