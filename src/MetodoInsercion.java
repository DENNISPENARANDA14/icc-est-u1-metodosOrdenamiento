
public class MetodoInsercion {

    public void OrdenarAsendente(int[] arreglo) {

        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 && aux < arreglo[j]) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
        }

    }

    public void OrdenarAsendentePasos(int[] arreglo) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {

            int aux = arreglo[i];
            int j = i - 1;
            System.err.println("");
            System.out.println("i:" + i + " , j:" + j + ", aux:" + aux);

            while (j >= 0 && aux < arreglo[j]) {
                System.out.println("compara aux:" + aux + " con " + arreglo[j]);
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            System.out.println("");
            for (int a = 0; a < arreglo.length; a++) {
                System.out.print(" | " + arreglo[a]);
            }
            arreglo[j + 1] = aux;

        }

    }

    public void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " |");
        }
    }
}
