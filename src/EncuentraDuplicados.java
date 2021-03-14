import java.util.Arrays;

public class EncuentraDuplicados {
    public static void main (String[] args) {
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9,50 };
        int length = arr.length;
        //printing array elements
        System.out.println("El array original es: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nEl array de duplicados es: ");
        System.out.println(Arrays.toString(findDuplicates(arr, length)));




    }

    // Write a method, which returns an array with duplicated numbers (81, 51)
    public static int[] findDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1) {
            //TODO: ver qué hacer en este caso
        }

        // crear un array temp (para guardar los duplicados)
        int[] temp = new int[n];                        // este array debe tener el largo del array original
        for (int i = 0; i < temp.length; i++) {         // llenar el array temporal de -1
            temp[i] = -1;
        }

        //crear un contador para contar el nro de veces que encuentra un repetido
        //este contador será luego el largo del array final
        int j = 0;
        //necesitamos un for anidado para recorrer el arreglo buscando repetidos
        //debe buscar hasta el largo del array original -1 xq el de adentro buscará en ese +1
        for (int a = 0; a < n - 1; a++) {
            //en el for interno debemos partir en +1 q el contador de afuera
            //así evitamos q busque en el mismo nro
            for (int d = a + 1; d < n; d++) {
                if (arr[d] == arr[a]) {
                    int encontrado = 0;
                    int g = 0;

                    for (g = 0; g < temp.length; g++) {
                        if (temp[g] == arr[a])
                            encontrado = 1;
                    }

                    if (encontrado == 0) {
                        temp[j] = arr[a];
                        j++;
                    }

                }
            }
        }

            //Crear un array de largo j
            //llenar el array con los elementos del temp hasta temp[j-1]
            int[] duplicados = new int[j];
            for (int i = 0; i < j; i++)
            {
                duplicados[i] = temp[i];
            }

            //TODO: qué hacer si un nro se repite más de dos veces?
            return duplicados;
        }

    }