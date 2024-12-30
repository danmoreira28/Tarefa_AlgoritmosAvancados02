import java.util.Arrays;

public class Tarefa02 {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1};
        calcularTroco(quantia, moedas);
    }

    public static void calcularTroco(int quantia, int[] moedas) {
        Arrays.sort(moedas); // ordenar moedas em ordem decrescente
        int[] troco = new int[moedas.length];

        for (int i = 0; i < moedas.length; i++) {
            troco[i] = quantia / moedas[i];
            quantia %= moedas[i];
        }

        System.out.println("Troco:");
        for (int i = 0; i < moedas.length; i++) {
            if (troco[i] > 0) {
                System.out.println(troco[i] + " moedas de " + moedas[i]);
            }
        }
    }
}
