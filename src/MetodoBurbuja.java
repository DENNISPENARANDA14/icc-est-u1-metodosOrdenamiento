public class MetodoBurbuja {
    public void leerArreglo(){

    }
    public void ordenarAcendente(int[] arreglo){
        int aux=0;
        for(int i=0 ; i<arreglo.length; i++){
            for(int j=i+1;j<arreglo.length;j++){
                if (arreglo[i]>arreglo[j]) {
                  aux=arreglo[j];
                  arreglo[j]=arreglo[i];
                  arreglo[i]=aux;  
                }
            }
        }
        System.out.println();
   }

    public void imprimirArreglo(int[] arreglo){
        for(int i=0; i<arreglo.length;i++){
            System.out.print(" | "+arreglo[i]);
        }
    }
    public void ordenar(int[] arreglo, boolean isDes){
        int aux=0;
        for(int i=0 ; i<arreglo.length; i++){
            for(int j=i+1;j<arreglo.length;j++){
                if (isDes) {
                    if (arreglo[i]<arreglo[j]) {
                        aux=arreglo[j];
                        arreglo[j]=arreglo[i];
                        arreglo[i]=aux;  
                    }
                } else {
                    if (arreglo[i]>arreglo[j]) {
                        aux=arreglo[j];
                        arreglo[j]=arreglo[i];
                        arreglo[i]=aux;  
                      }
                }   
            }
        }
        System.out.println();
   }

}
