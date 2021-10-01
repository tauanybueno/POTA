import java.util.Scanner;

public class Exericio3 {
    public static void main(String[] args) {
        System.out.println("Digite um numero positivo: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        long inicioRecursivo = System.currentTimeMillis();
        System.out.println(FibonnaciRecursivo(numero));
        long finalRecursivo = System.currentTimeMillis();
        System.out.println("Tempo em Milisegundos do Fibonnaci Recursivo = " + (finalRecursivo - inicioRecursivo));


    }
    public static int FibonnaciRecursivo (int numero){
        if (numero < 2){
            return numero;
        }else{
            return FibonnaciRecursivo(numero - 1) + FibonnaciRecursivo(numero - 2);
        }
    }
}
