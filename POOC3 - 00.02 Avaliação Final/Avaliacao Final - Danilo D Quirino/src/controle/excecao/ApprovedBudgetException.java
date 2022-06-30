/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.excecao;

/**
 *
 * @author Aluno
 */
public class ApprovedBudgetException extends Exception {

    /**
     * Creates a new instance of <code>ApprovedBudgetException</code> without
     * detail message.
     */
    public ApprovedBudgetException() {
    }

    /**
     * Constructs an instance of <code>ApprovedBudgetException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ApprovedBudgetException(String msg) {
        super(msg);
    }
    
        @Override
    public String toString() {
        return "Orçamento já aprovado. Não é possivel alterações";
    }
}
