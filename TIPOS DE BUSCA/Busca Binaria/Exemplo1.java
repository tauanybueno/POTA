public class Exemplo1 {
    public static void main(String[] args) {
        int vetor[] = {0, 3, 23, 34, 47, 55, 65, 82, 87, 99};
        int vetor2[] = {1, 5, 8, 18, 25, 29, 35, 37, 55, 89};
        int indice = buscaBinaria(vetor, 55);
        int indice2 = buscaBinariaRecursiva(vetor2, 37, 0, vetor2.length - 1);
        System.out.println(indice);
        System.out.println(indice2);
    }

    private static int buscaBinaria(int[] vetor, int elemento) {
        int inico = 0;
        int fim = vetor.length - 1;
        while (inico <= fim) {
            int meio = (inico + fim) / 2;
            if (elemento == vetor[meio]) {
                return meio;
            } else {
                if (elemento < vetor[meio]) {
                    fim = meio - 1;
                } else {
                    inico = meio + 1;
                }
            }

        }
        return -1;
    }

    private static int buscaBinariaRecursiva(int[] vetor2, int elemento, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        } else {
            int meio = (inicio + fim) / 2;
            if (elemento == vetor2[meio]) {
                return meio;
            } else {
                if (elemento < vetor2[meio]) {
                    return buscaBinariaRecursiva(vetor2, elemento, inicio, meio - 1);
                } else {
                    return buscaBinariaRecursiva(vetor2, elemento, meio + 1, fim);
                }
            }
        }
    }
}

