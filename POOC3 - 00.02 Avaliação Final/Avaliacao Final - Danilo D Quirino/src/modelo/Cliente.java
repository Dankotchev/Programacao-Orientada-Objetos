package modelo;
public class Cliente {
    private int codigoCliente;
    private String nome;
    private String contato;

    public Cliente(int codigoCliente, String nome, String contato) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.contato = contato;
    }

    public Cliente() {
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
}
