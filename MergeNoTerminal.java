public class MergeNoTerminal {

        public static void main(String[] args) {

            int numero1 = 10;
            int numero2 = 5;

            System.out.println("=== Atividade ===");
            System.out.println("Número 1: " + numero1);
            System.out.println("Número 2: " + numero2);

            // ESTA É A LINHA QUE OS DOIS VÃO ALTERAR → GERAR CONFLITO
            int resultado = numero1 * numero2; // Soma dois dois números

            System.out.println("Resultado: " + resultado);
        }
    }


