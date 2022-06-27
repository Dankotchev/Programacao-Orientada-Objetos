package controle;

import controle.dao.ControleCompraBanco;
import controle.dao.ControleItemVendidoBanco;
import controle.dao.ControleProdutoBanco;
import controle.dao.ControleVendaBanco;
import controle.excecoes.NotExistException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Compra;
import modelo.ItemVendido;
import modelo.Produto;

public class Estoque {

    private final ControleCompraBanco bancoCompra = new ControleCompraBanco();
    private final ControleVendaBanco bancovenda = new ControleVendaBanco();
    private final ControleProdutoBanco bancoProduto = new ControleProdutoBanco();
    private final ControleItemVendidoBanco bancoIV = new ControleItemVendidoBanco();

    // Busca uma lista de Item Vendido a partir de uma nota fiscal
    public void retornarVenda(int notaFiscal) throws SQLException, NotExistException {
        List<ItemVendido> listaIV = new ArrayList<>();
        // Buscar todos os Item vendido de uma Venda
        listaIV = this.bancoIV.retonarItemVendido(notaFiscal);
        Produto prod;
        for (ItemVendido iv : listaIV) {
            // Para cada Item Vendido: buscar o Produto correspondente e retornar estoque
            prod = this.bancoProduto.pesquisar(iv.getCodProduto());
            prod.setQuantidade(prod.getQuantidade() + iv.getQuantidadeVendida());
            this.bancoProduto.alterarVC(prod);
        }
    }

    // Já recebe como parametro uma lista de Item Vendido
    public void retornarVenda(List<ItemVendido> listaIV) throws SQLException, NotExistException {
        Produto prod;
        for (ItemVendido iv : listaIV) {
            // Para cada Item Vendido: buscar o Produto correspondente e retornar estoque
            prod = this.bancoProduto.pesquisar(iv.getCodProduto());
            prod.setQuantidade(prod.getQuantidade() + iv.getQuantidadeVendida());
            this.bancoProduto.alterarVC(prod);
        }
    }

    // Recebe como parametro um codigo de Produto
    public void retornarCompra(int codProduto, int quantidadeComprada) throws SQLException, NotExistException {
        Produto prod = this.bancoProduto.pesquisar(codProduto);
        prod.setQuantidade(prod.getQuantidade() - quantidadeComprada);
        this.bancoProduto.alterarVC(prod);
    }
}
