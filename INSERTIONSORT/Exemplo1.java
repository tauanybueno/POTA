public class Exemplo1 {
    public static void main(String[] args) {
        int vetor[] = {9, 8, 6, 12, 4, 3, 7};
        insertionSort(vetor);

    }

    public static void insertionSort (int[] vetor){
        int j;
        int key;
        int i;

        /*metodo Inseetion sort = ira percorrer todo o vetor comecando do segundo
         elemento e atribuindo o mesmo a uma variavel chamada key*/

        /*O algoritmo comeca fazendo uma iteracao em todos os elementos do vetor, a partir do segundo elemento
        * por isso j = 1 e nao j = 0*/

        /*a variavel key armazena incialmente o primeiro valor lido pelo laco for, que nesse caso sera o
        * segundo elemento do vetor
        * */

        for (j = 1; j < vetor.length; j++){
            key = vetor[j];
            for (i = j - 1; (i >= 0) && vetor[i] > key; i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }

    }
}
