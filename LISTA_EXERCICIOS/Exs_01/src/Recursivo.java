public class Recursivo {
    public static void main(String[] args) {
        System.out.println(Combinacao(4, 3));
    }

    public static int Combinacao (int n, int k){
        if (k == 1){
            return n;
        }else if (k == n){
            return 1;
        }else{
            return Combinacao(n-1, k-1) + Combinacao(n-1, k);
        }
    }
}
