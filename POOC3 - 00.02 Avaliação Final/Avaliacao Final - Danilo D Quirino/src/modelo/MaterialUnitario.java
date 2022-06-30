package modelo;

public class MaterialUnitario extends MateriaPrima{

    public MaterialUnitario(String descricao, int codigoMP, int estoque, double custo) {
        super(descricao, codigoMP, estoque, custo);
    }

    public MaterialUnitario() {
    }

    @Override
    public double getCusto() {
        return super.getCusto() * 1.30;
    }   
}
