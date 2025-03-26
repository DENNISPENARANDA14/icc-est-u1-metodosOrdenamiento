
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //int x = 5;
        int[] listado = {64, 25, 12, 22, 11};
        int[] listado1 = {64, 25, 12, 22, 11};
        int[] listado2 = {64, 25, 12, 22, 11};
        //boolean condicion=false;
        //String nombre="Dennis";
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        MetodoInsercion metodoInsercion = new MetodoInsercion();
        System.out.println("METODO BURBUJA");
        System.out.println("ARREGLO ORIGINAL");
        metodoBurbuja.imprimirArreglo(listado);
        metodoBurbuja.ordenarAcendente(listado);
        System.out.println("ARREGLO ORDENADO ACENDENTE");
        //metodoBurbuja.imprimirArreglo(listado);
        //metodoBurbuja.ordenar(listado, true);
        metodoBurbuja.imprimirArreglo(listado);
        //metodoBurbuja.ordenar(listado, false);
        //metodoBurbuja.imprimirArreglo(listado);

        System.out.println();
        System.err.println("METODO SELECCION");
        System.err.println("ARREGLO ORIGINAL");
        metodoSeleccion.printArray(listado1);
        System.out.println("ARREGLO ORDENADO DESCENDENTEMENTE");
        metodoSeleccion.ordenarDescendente(listado1);
        metodoSeleccion.printArray(listado1);

        System.out.println();
        System.err.println("METODO INSERSION");
        System.err.println("ARREGLO ORIGINAL");
        metodoInsercion.printArray(listado2);
        System.out.println("");
        System.out.println("ARREGLO ORDENADO CON PASOS");
        //metodoInsercion.OrdenarAsendente(listado2);
        metodoInsercion.OrdenarAsendentePasos(listado2);
        System.out.println("");
        System.out.println("ARREGLO ORDENADO");
        metodoInsercion.printArray(listado2);
    }
}
