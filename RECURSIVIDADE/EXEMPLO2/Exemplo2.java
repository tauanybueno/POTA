import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero inteiro positivo: ");
        n = entrada.nextInt();
        System.out.println("Soma: " + soma(n));
    }

    public static int soma (int n){
        if (n == 1){
            return 1;
        }else{
            //retorna a soma de todos os numeros ate parar no numero 1
            return (n + soma(n - 1));
        }
    }

}


