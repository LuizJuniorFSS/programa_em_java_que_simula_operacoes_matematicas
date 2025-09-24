/**
 * Classe abstrata que define a estrutura básica para operações matemáticas
 */
public abstract class OperacaoMatematica {
    
    /**
     * Método abstrato para realizar cálculos matemáticos
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da operação
     * @throws Exception em caso de erro na operação
     */
    public abstract double calcular(double a, double b) throws Exception;
}