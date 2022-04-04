import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int[] troco = {100,25,10,5,1};
        int valor = 100;
        System.out.println(calculaTrocoGuloso(troco,valor));
    }

    public static ArrayList<Integer> calculaTrocoGuloso(int[] t, int valor){
        ArrayList<Integer> troco = new ArrayList<>();
        int tam = troco.size();

        for(int i = tam; i >= 0; i--){
            while(valor >= t[i]){
            valor = valor - t[i];
            troco.add(t[i]);
            }
        }
        return troco;
    }
}