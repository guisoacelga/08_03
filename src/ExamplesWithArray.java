import java.util.Arrays;

public class ExamplesWithArray {
        public static void main(String[] args) {

            int[] arr = {
                    98, 97, 87, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                    51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                    12, 29, 2, 17, 8 };

            int[] arr1 = {
                    98, 97, 0, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                    51, 52, 148, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                    12, 29, 2, 17, 8, 1 };

            int[] arr2 = { 5, 0, 5, 27, 156, 0, 1, 118, 234, 7, 2, 12 };

            System.out.println("\n----------- ********* ----------- ");
            System.out.println("Aquí con arr *-* el q nos dio el profe");
            printArray(arr);
            System.out.println("arr.length = " + arr.length);
            System.out.println("Y el menor es (arr): " + findTheLowest(arr));
            System.out.println("Y el mayor es (arr): " + findTheBiggest(arr));
            System.out.println("Y si sumamos todos los nros de este array nos da (arr): " + sumOfAllNrs(arr));
            System.out.println("Y el promedio es (arr): " + avrgOfAllNrs(arr));
            System.out.println("Y ahora los duplicados del array (arr): " + Arrays.toString(findDuplicates(arr, arr.length))); ;

            System.out.println("\n----------- ********* ----------- ");
            System.out.println("Aquí con arr1 *-* le agregué algunos nros al q nos dio el profe");
            printArray(arr1);
            System.out.println("arr1.length = " + arr1.length);
            System.out.println("Y el menor es (arr1): " + findTheLowest(arr1));
            System.out.println("Y el mayor es (arr1): " + findTheBiggest(arr1));
            System.out.println("Y si sumamos todos los nros de este array nos da (arr1): " + sumOfAllNrs(arr1));
            System.out.println("Y el promedio es (arr1): " + avrgOfAllNrs(arr1));
            System.out.println("Y ahora los duplicados del array (arr1): " + Arrays.toString(findDuplicates(arr1, arr1.length))); ;

            System.out.println("\n----------- ********* ----------- ");
            System.out.println("Aquí con arr2 *-* este es cortito, solo para testear");
            printArray(arr2);
            System.out.println("arr2.length = " + arr2.length);
            System.out.println("Y el menor es (arr2): " + findTheLowest(arr2));
            System.out.println("Y el mayor es (arr2): " + findTheBiggest(arr2));
            System.out.println("Y si sumamos todos los nros de este array nos da (arr2): " + sumOfAllNrs(arr2));
            System.out.println("Y el promedio es (arr2): " + avrgOfAllNrs(arr2));
            System.out.println("Y ahora los duplicados del array (arr2): " + Arrays.toString(findDuplicates(arr2, arr2.length))); ;

        }

        // Write a method, finding and returning the smallest number
        public static int findTheLowest(int[] arr){
            int lowest = arr[0];

            for (int i = 1; i < arr.length ; i++) {

                if (arr[i] < lowest){
                 lowest = arr[i];
                }
            }

            return lowest;
        }

        //Este método imprime el array
        public static void printArray(int [] array){
            for (int j = 0; j < array.length; j++) {
                if (j == array.length -1) {
                    System.out.print(array[j] + ". \n");
                } else {
                    System.out.print(array[j] + ", ");
                }
            }
        }


        // Write a method, finding and returning the biggest number
        public static int findTheBiggest(int[] arr){
            int biggest = arr[0];

            for (int i = 1; i < arr.length ; i++) {

                if (arr[i] > biggest){
                    biggest = arr[i];
                }
            }

            return biggest;
        }

        // Write a method, calculating and returning the sum of all numbers
        public static int sumOfAllNrs(int[] array){
            int suma = array[0];
            for (int j = 1; j < array.length; j++) {
                suma = suma + array[j];
            }
            return suma;
        }

        // Write a method, calculating and returning the average over all numbers
        public static float avrgOfAllNrs(int[] array){
            int suma = sumOfAllNrs(array);
            float promedio = suma / array.length;

            return promedio;
        }


        // Write a method, which returns an array with duplicated numbers (81, 51)
        public static int[] findDuplicates(int arr[], int n)
        {
            if (n==0 || n==1){
                //TODO: ver qué hacer en este caso
            }

            // crear un array temp (para guardar los duplicados)
            // este array debe tener el largo del array original
            // llenar el array temporal de -1
            int[] temp = new int[n];
            for (int i = 0; i < temp.length; i++) {
                temp[i]= -1;
            }

            //crear un contador para contar el nro de veces que encuentra un repetido
            //este contador será luego el largo del array final
            int j=0;
            //necesitamos un for anidado para recorrer el arreglo buscando repetidos
            //debe buscar hasta el largo del array original -1 xq el de adentro buscará en ese +1
            for (int a=0; a<n-1; a++)
            {
                //en el for interno debemos partir en uno más q el contador de afuera
                //así evitamos q busque en el mismo nro
                for (int d=a+1; d<n-1; d++)
                {
                    if (arr[d] == arr[a]) {
                        temp[j] = arr[a];
                        j++;
                    }
                }
            }

            //Crear un array de largo j
            //llenar el array con los elementos del temp hasta temp[j-1]
            int[] duplicados = new int[j];
            for (int i = 0; i < j; i++) {
                duplicados[i]= temp[i];
            }

            //TODO: qué hacer si un nro se repite más de dos veces?
            return duplicados;
        }
    }

