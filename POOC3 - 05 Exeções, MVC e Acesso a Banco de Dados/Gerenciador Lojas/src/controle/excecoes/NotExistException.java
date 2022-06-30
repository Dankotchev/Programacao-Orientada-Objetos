package controle.excecoes;
public class NotExistException extends Exception {

    /**
     * Creates a new instance of <code>NotExistException</code> without detail
     * message.
     */
    public NotExistException() {
    }

    /**
     * Constructs an instance of <code>NotExistException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotExistException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "Não Existe no Banco de Dados";
    }
    
   
}
