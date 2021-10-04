public class Exemplo1 {
    public static void main(String[] args) {
        int[] vetor = {7, 4, 5, 9, 8, 2, 1};
        System.out.println("Vetor antes do Selection Sort");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" " + vetor[i]);
        }

        selectionSort(vetor);

        System.out.println("Vetor apos o Selection Sort");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(" " + vetor[i]);
        }
    }

    public static void selectionSort(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            //index = 0
            int index = i;
            for (int j = i + 1; j < vetor.length; j++){
                // j = 1
                //se 4 < 7
                if (vetor[j] < vetor[index]){
                    //index = 4
                    index = j;
                }
            }

            //menor numero = 4
            int menorNumero = vetor[index];

            vetor[index] = vetor[i];
            vetor[i] = menorNumero;
        }

    }
}
