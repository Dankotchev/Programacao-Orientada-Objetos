package modelo;

public class MaterialMLinear extends MateriaPrima{

    public MaterialMLinear(String descricao, int codigoMP, int estoque, double custo) {
        super(descricao, codigoMP, estoque, custo);
    }

    public MaterialMLinear () {
    }

    @Override
    public double getCusto() {
        return super.getCusto() * 1.45;
    }   
}
