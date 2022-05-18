package modelo;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe é uma agregação de clientes, portanto os clientes já existem e 
 * continuarão a existir mesmo que o grupo não exista mais.
 * @author Aluno
 */
public class GrupoClientes {

    private String nome;
    private double desconto;
    
    // Criação de uma lista com os clientes que participam deste grupo
    private List<Cliente> listaCliente = new ArrayList<>();
    
    public GrupoClientes() {
    }
    
    public GrupoClientes(String nome, double desconto) {
        this.nome = nome;
        this.desconto = desconto;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void addCliente (Cliente c){
        this.listaCliente.add(c);
    }
    
    // Retorna a lista de clientes pertencente a um grupo

    public List<Cliente> getListaCliente() {
        return this.listaCliente;
    }
        
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getPercentInstance();
        return "Nome do Grupo: " + this.nome + " - Desconto: " + nf.format(this.desconto);
    }
    
}
