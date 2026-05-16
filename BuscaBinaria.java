public class BuscaBinaria {
    // Eficiencia: O(log n) - Tempo Logarítmico
    public static int buscar(int[] array, int alvo) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = baixo + (alto - baixo) / 2;

            if (array[meio] == alvo) {
                return meio;
            }
            if (array[meio] > alvo) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }
}