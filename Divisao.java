/**
 * Classe que implementa a operação de divisão
 */
public class Divisao extends OperacaoMatematica {
    
    /**
     * Implementa o método calcular para realizar a divisão de dois números
     * Verifica se o divisor é zero antes de realizar a operação
     * @param a dividendo (primeiro número)
     * @param b divisor (segundo número)
     * @return resultado da divisão a / b
     * @throws DivisaoPorZeroException quando o divisor for zero
     */
    @Override
    public double calcular(double a, double b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException();
        }
        return a / b;
    }
}