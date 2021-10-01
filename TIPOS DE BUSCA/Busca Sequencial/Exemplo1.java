public class Exemplo1 {
    public static void main(String[] args) {
        int vetor[] = {9, 15, 7, 18, 23, 1, 75, 14, 54, 17, 21};
        int vetor2[] = {1, 7, 9, 14, 15, 17, 18, 21, 23, 54, 75};
        int indice = buscaSequencial(vetor, 21);
        int indice2 = buscaSequencialOrdenada(vetor2, 80);
        System.out.println("Busca Sequencial: " + indice);
        System.out.println("Busca ordenada: " + indice2);
    }

    private static int buscaSequencial(int[] vetor, int elemento) {
        for (int i = 0; i < vetor.length; i++) { //i = 0 uma única vez
            if (vetor[i] == elemento) {//se está na 1 posição entra no if uma única vez
                return i; //entra no return uma única vez
            }
        }
        return -1; //não é executado
    }

    private static int buscaSequencialOrdenada(int[] vetor2, int elemento) {
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] == elemento) {
                return i;
            } else {
                if (vetor2[i] > elemento) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
