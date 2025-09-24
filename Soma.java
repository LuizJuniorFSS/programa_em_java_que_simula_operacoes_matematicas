/**
 * Classe que implementa a operação de soma
 */
public class Soma extends OperacaoMatematica {
    
    /**
     * Implementa o método calcular para realizar a soma de dois números
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma a + b
     * @throws Exception em caso de erro na operação
     */
    @Override
    public double calcular(double a, double b) throws Exception {
        return a + b;
    }
}