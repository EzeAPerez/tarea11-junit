public class Estadisticas {

    public int mayorNumero(int lista[]){
        int resultado =0;

        for(int i=1; i<lista.length; i++){
            if(resultado<lista[i]){
                resultado=lista[i];
            }
        }

        return resultado;
    }

    public int promedio(int lista[]){
        int resultado = 0;

        for(int i=0; i<lista.length; i++){
            resultado+=lista[i];
        }

        if(lista.length!=0){
            resultado/=lista.length;
        }

        return resultado;
    }

    public int[] ordenar(int lista[]){
        int tam = lista.length;
        quickSort(lista, 0, tam-1);
        return lista;
    }

    public static void quickSort(int[] lista, int ini, int fin) {
        if (ini < fin) {
            int pivotIndex = partition(lista, ini, fin);
            quickSort(lista, ini, pivotIndex - 1);
            quickSort(lista, pivotIndex + 1, fin);
        }
    }

    public static int partition(int[] lista, int ini, int fin) {
        int pivot = lista[fin];
        int i = ini - 1;
        for (int j = ini; j < fin; j++) {
            if (lista[j] < pivot) {
                i++;
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }
        int temp = lista[i + 1];
        lista[i + 1] = lista[fin];
        lista[fin] = temp;
        return i + 1;
    }
}
