package controle.excecoes;
public class InsufficientStockException extends Exception {

    /**
     * Creates a new instance of <code>InsufficientStockException</code> without
     * detail message.
     */
    public InsufficientStockException() {
    }

    /**
     * Constructs an instance of <code>InsufficientStockException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InsufficientStockException(String msg) {
        super(msg);
    }
    
        @Override
    public String toString() {
        return "Produto com Estoque Insuficiente para Venda";
    }
}
