public class Exemplo1 {
    public static void main(String[] args) {
        int vetor[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int indice = buscaInterpolada(vetor, 80);
        System.out.println(indice);
    }

    private static int buscaInterpolada(int[] vetor, int elemento) {
        int inicio = 0;
        int fim = vetor.length - 1;
        double a = vetor[inicio];
        double b = vetor[fim];
        while (inicio <= fim) {
            int meio = (int) (inicio + (fim - inicio) * ((elemento - a) / (b - a)));
            if (elemento == vetor[meio]) {
                return meio;
            } else {
                if (elemento < vetor[meio]) {
                    fim = meio - 1;
                } else {
                    if (elemento > vetor[meio]) {
                        inicio = meio + 1;
                    }
                }
            }
        }
        return -1;
    }
}
