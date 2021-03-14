import java.util.Arrays;

public class EncuentraDuplicados {
    public static void main (String[] args) {
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9,50 };
        int largo = arr.length;                           //guardar el largo en una variable --> luego pasarlo como parámetro


        System.out.println("El array original es: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nEl array de duplicados es: ");
        System.out.println(Arrays.toString(findDuplicates(arr, largo)));

    }

    public static int[] findDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            //TODO: ver qué hacer en este caso
        }
                                                        // crear un array temp (para guardar los duplicados)
        int[] temp = new int[n];                        // este array debe tener el largo del array original

        for (int i = 0; i < temp.length; i++) {         // llenar el array temporal de -1 ** esto es innecesario :D
            temp[i] = -1;
        }

        int contadorRepetidos = 0;                      //crear un contador de repetidos
                                                        //este contador será luego el largo del array final

                                                        //necesitamos un for anidado para recorrer el arreglo buscando repetidos
        for (int a = 0; a < arr.length - 1; a++) {      //debe buscar hasta el largo del array original -1 xq el de adentro buscará en ese +1

            for (int d = a + 1; d < arr.length; d++) {  //para evitar q busque en el mismo nro el for interno debe partir en +1 q el contador de afuera

                 if (arr[a] == arr[d]) {                //si encuentra una coincidencia--> un REPETIDO!!
                    int contadorEncontrado = 0;         //necesitamos un contadorEncontrados para chequear si ya lo guardamos

                    for (int g = 0; g < temp.length; g++) {
                        if (temp[g] == arr[a]){
                            contadorEncontrado = 1;
                        }
                    }

                    if (contadorEncontrado == 0) {
                        temp[contadorRepetidos] = arr[a];
                        contadorRepetidos++;
                    }
                }
            }
        }

        int[] duplicadosArr = new int[contadorRepetidos];  //Crear un array de largo contadorRepetidos

        for (int i = 0; i < contadorRepetidos; i++) {   //llenar el array con los elementos del temp hasta temp[contadorRepetidos-1]
            duplicadosArr[i] = temp[i];
        }

        return duplicadosArr;


    }
}