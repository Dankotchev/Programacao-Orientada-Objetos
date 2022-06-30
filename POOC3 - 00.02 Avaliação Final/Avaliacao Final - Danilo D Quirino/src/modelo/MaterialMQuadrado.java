package modelo;

public class MaterialMQuadrado extends MateriaPrima{

    public MaterialMQuadrado(String descricao, int codigoMP, int estoque, double custo) {
        super(descricao, codigoMP, estoque, custo);
    }

    public MaterialMQuadrado () {
    }

    @Override
    public double getCusto() {
        return super.getCusto() * 1.60;
    }   
}
