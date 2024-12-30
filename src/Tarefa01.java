import java.util.*;

public class Tarefa01 {
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subconjuntos = gerarSubconjuntos(S, n);
        System.out.println(subconjuntos);
    }

    public static List<List<Integer>> gerarSubconjuntos(int[] S, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        Arrays.sort(S); // ordenar o conjunto
        gerarSubconjuntosRecursivo(S, 0, new ArrayList<>(), n, subconjuntos);
        return subconjuntos;
    }

    private static void gerarSubconjuntosRecursivo(int[] S, int indice, List<Integer> subconjunto, int n, List<List<Integer>> subconjuntos) {
        if (subconjunto.size() == n) {
            subconjuntos.add(new ArrayList<>(subconjunto));
            return;
        }

        for (int i = indice; i < S.length; i++) {
            subconjunto.add(S[i]);
            gerarSubconjuntosRecursivo(S, i + 1, subconjunto, n, subconjuntos);
            subconjunto.remove(subconjunto.size() - 1);
        }
    }
}