/**
 * Classe principal que demonstra o uso das operações matemáticas
 */
public class Principal {
    
    public static void main(String[] args) {
        // Criando objetos das operações matemáticas
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        
        System.out.println("=== PROGRAMA DE OPERAÇÕES MATEMÁTICAS ===\n");
        
        // Testando operação de soma
        try {
            double resultadoSoma = soma.calcular(10, 5);
            System.out.println("Soma: 10 + 5 = " + resultadoSoma);
        } catch (Exception e) {
            System.out.println("Erro na soma: " + e.getMessage());
        }
        
        // Testando divisão normal
        try {
            double resultadoDivisao = divisao.calcular(10, 2);
            System.out.println("Divisão: 10 / 2 = " + resultadoDivisao);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro na divisão: " + e.getMessage());
        }
        
        // Testando divisão por zero (deve lançar exceção)
        try {
            double resultadoDivisaoZero = divisao.calcular(10, 0);
            System.out.println("Divisão: 10 / 0 = " + resultadoDivisaoZero);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
        
        // Testando mais operações
        try {
            System.out.println("\n=== MAIS TESTES ===");
            System.out.println("Soma: 7.5 + 2.3 = " + soma.calcular(7.5, 2.3));
            System.out.println("Divisão: 15 / 3 = " + divisao.calcular(15, 3));
            System.out.println("Divisão: 20 / 4 = " + divisao.calcular(20, 4));
            
            // Tentativa de divisão por zero novamente
            System.out.println("Tentando dividir 5 por 0...");
            divisao.calcular(5, 0);
            
        } catch (DivisaoPorZeroException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro geral: " + e.getMessage());
        }
        
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}