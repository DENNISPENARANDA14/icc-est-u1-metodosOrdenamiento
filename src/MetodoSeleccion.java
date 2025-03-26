
public class MetodoSeleccion {

    public void ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iM = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[iM]) { // Buscar el menor elemento
                    iM = j;
                }
            }
            // Intercambio de elementos
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    // Orden descendente
    public void ordenarDescendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iM = i; // Índice del máximo
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[iM]) { // Buscar el mayor elemento
                    iM = j;
                }
            }

            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }

    public void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " | ");
        }
        System.out.println();
    }
}
