import java.util.Arrays;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        //criando um vetor de numeros aleatorios
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("VETOR");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        //a soma comeca em zero e a posicao tambem
        //armazena o valor da soma anterior para realizar a soma
        System.out.println("SOMA");
        System.out.println(somar(0, 0, vetor));

    }

    public static int somar(int soma, int posicao, int[] vetor){
        if (posicao < vetor.length){
            soma = soma + vetor[posicao];
            //metodo que chama ele mesmo
            return somar(soma, posicao + 1, vetor);
        }else{
            return soma;
        }
    }
}