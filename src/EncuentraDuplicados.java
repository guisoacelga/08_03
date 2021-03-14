import java.util.Arrays;

public class EncuentraDuplicados {
    public static void main (String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        //printing array elements
        System.out.println(Arrays.toString(arr));

        findDuplicates(arr, length);



    }

    public static int[] findDuplicates(int arr[], int n)
    {
        if (n==0 || n==1){
            //TODO: ver qué hacer en este caso
        }

        //llenar el array temporal de -1
        int[] temp = new int[n];
        for (int i = 0; i < temp.length; i++) {
            temp[i]= -1;
        }
        System.out.println(Arrays.toString(temp));
        //

        int j=0;
        for (int a=0; a<n-1; a++)
        {
            for (int d=a+1; d<n-1; d++)
            {
                if (arr[d] == arr[a]) {
                    temp[j] = arr[a];
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(temp));
        System.out.println("j es el largo de el próx array: "+ j);

        //Crear un array de largo j
        //llenar el array con los elementos del temp hasta temp[j-1]
        int[] duplicados = new int[j];
        for (int i = 0; i < j; i++) {
            duplicados[i]= temp[i];
        }
        System.out.println(Arrays.toString(duplicados));

        return duplicados;
    }




}
