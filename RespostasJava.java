public class Main {
    // 1) Ao final do processamento, qual será o valor da variável SOMA?
    public static int valorDaVariavelSoma(int indice) {
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        return soma;
    }

    public static void main(String[] args) {
        System.out.println("1) O valor da variável SOMA será: " + valorDaVariavelSoma(13));

        // 2)
        System.out.println("2) " + verificaFibonacci(21));
        System.out.println("2) " + verificaFibonacci(22));

        // 3) Descubra a lógica e complete o próximo elemento:
        System.out.println("3)");
        // a) 1, 3, 5, 7, ___
        System.out.println("- a) 9");

        // b) 2, 4, 8, 16, 32, 64, ____
        System.out.println("- b) 128");

        // c) 0, 1, 4, 9, 16, 25, 36, ____
        System.out.println("- c) 49");

        // d) 4, 16, 36, 64, ____
        System.out.println("- d) 100");

        // e) 1, 1, 2, 3, 5, 8, ____
        System.out.println("- e) 13");

        // f) 2,10, 12, 16, 17, 18, 19, ____
        System.out.println("- f) 20");

        // 4)
        System.out.println("4)");
        System.out.println("- 1 Primeira ida:");
        System.out.println("-- Ligue o primeiro interruptor e aguarde alguns minutos.");
        System.out.println("-- Desligue o primeiro interruptor e ligue o segundo interruptor.");
        System.out.println("-- Entre na sala onde estão as lâmpadas.");
        System.out.println("- 2 Segunda ida:");
        System.out.println("-- Observe as lâmpadas.");
        System.out.println("-- A lâmpada que estiver acesa pertencerá ao interruptor que foi ligado inicialmente.");
        System.out.println("-- Toque na lâmpada para verificar se ela ainda está quente. Se estiver, pertencerá ao segundo interruptor que foi ligado temporariamente. Se estiver fria, pertencerá ao último interruptor.");

        // 5) Escreva um programa que inverta os caracteres de um string.
        String stringOriginal = "Estágio Ribeirão Preto - 2024";
        String stringInvertida = inverterString(stringOriginal);
        System.out.println("5)");
        System.out.println("- String original: " + stringOriginal);
        System.out.println("- String invertida: " + stringInvertida);
    }

    // 2)
    public static String verificaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int c;

        while (a <= numero) {
            if (a == numero) {
                return "O número " + numero + " pertence à sequência de Fibonacci.";
            }
            c = a + b;
            a = b;
            b = c;
        }

        return "O número " + numero + " não pertence à sequência de Fibonacci.";
    }

    // 5)
    public static String inverterString(String str) {
        StringBuilder invertedString = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            invertedString.append(str.charAt(i));
        }

        return invertedString.toString();
    }
}
//