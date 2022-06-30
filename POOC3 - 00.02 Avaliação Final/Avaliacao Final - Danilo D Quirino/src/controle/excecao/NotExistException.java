package controle.excecao;

public class NotExistException extends Exception{

    /**
     * Creates a new instance of <code>NotExistsException</code> without detail
     * message.
     */
    public NotExistException() {
    }

    /**
     * Constructs an instance of <code>NotExistsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotExistException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "Orçamento não Existe";
    }
}
