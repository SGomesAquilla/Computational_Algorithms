public class BuscaSimples {
    //Eficiencia: O(n) - Tempo Linear
    public static int buscar(int[] array, int alvo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) {
                return i;
            }
        }
        return -1;
    }
}