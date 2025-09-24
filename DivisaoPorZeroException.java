/**
 * Exceção personalizada para casos de divisão por zero
 */
public class DivisaoPorZeroException extends Exception {
    
    /**
     * Construtor da exceção com mensagem personalizada
     */
    public DivisaoPorZeroException() {
        super("Não é possível dividir por zero.");
    }
    
    /**
     * Construtor da exceção com mensagem customizada
     * @param mensagem mensagem personalizada para a exceção
     */
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}