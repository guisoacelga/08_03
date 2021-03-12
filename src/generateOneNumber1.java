import java.util.Random;

public class generateOneNumber1 {
    public static void main(String[] args) {
        int range = 36;
        System.out.println("----------- ********* ----------- ");
        System.out.println("I am going to generate one random positive number in a range (1 to " + range + ").");
        System.out.println("And the number is : " + generateOneRandomNumber(range));

        System.out.println("----------- ********* ----------- ");
        System.out.println("Now, I am going to generate five random positive numbers in a range (1 to " + range + ") and print them below.");
        generateFiveRandomNumbers(range);

        System.out.println("----------- ********* ----------- ");
        System.out.println("Now, I am going to generate five random positive numbers in a range (1 to " + range + ") and print them below.");
        System.out.println("But I had previously saved them in an array and then print from the array!");
        generateFiveRandomNumbersArrayPrint(range);

        System.out.println("----------- ********* ----------- ");
        System.out.println("Now, I am going to generate five random positive numbers in a range (1 to " + range + ") and print them below.");
        System.out.println("But I had previously saved them in an array and then print from the array!");
        System.out.println("Extra level of difficulty: print them in ascending order :O");
        sortArrayAscending(generateFiveRandomNumbersArrayReturn(range));

    }

    private static int generateOneRandomNumber(int range) {
        Random random = new Random();
        int randNr = random.nextInt();

        if (randNr < 0) {
            randNr = randNr * -1;
        }

        int finalRandNr = (randNr % range) + 1;

        return finalRandNr;
    }

    public static void generateFiveRandomNumbers(int range) {
        System.out.print("And the numbers are : ");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(generateOneRandomNumber(range) + ". \n");
            } else {
                System.out.print(generateOneRandomNumber(range) + ", ");
            }
        }
    }

    public static void generateFiveRandomNumbersArrayPrint(int range){
        int[] arrayRandom = new int[5];
        System.out.print("And the numbers are : ");

        for (int i = 0; i < 5; i++) {
           arrayRandom[i] = generateOneRandomNumber(range);
        }

        for (int j = 0; j < arrayRandom.length; j++) {
            if (j == arrayRandom.length -1) {
                System.out.print(arrayRandom[j] + ". \n");
            } else {
                System.out.print(arrayRandom[j] + ", ");
            }
        }

    }

    public static int[] generateFiveRandomNumbersArrayReturn(int range){
        int[] arrayRandomReturn = new int[5];

        for (int i = 0; i < 5; i++) {
            arrayRandomReturn[i] = generateOneRandomNumber(range);
        }

        return arrayRandomReturn;
    }

    public static void sortArrayAscending(int[] arrayToSort) {
        System.out.print("First let's print the original array: ");
        for (int j = 0; j < arrayToSort.length; j++) {
            if (j == arrayToSort.length -1) {
                System.out.print(arrayToSort[j] + ". \n");
            } else {
                System.out.print(arrayToSort[j] + ", ");
            }
        }


        for (int i = 0; i < arrayToSort.length; i++)            //for anidado necesitamos dos contadores i y j
        {
            for (int j = i + 1; j < arrayToSort.length; j++)    //es importante setear j a i+1 xq empieza a chequear en el segundo
            {
                int tmp = 0;
                if (arrayToSort[i] > arrayToSort[j])
                {
                    tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = tmp;
                }
            }
        }

        //TODO: ver que no se repitan los números
        System.out.print("And now the magic happens!! Here is the sorted array: ");
        for (int j = 0; j < arrayToSort.length; j++) {
            if (j == arrayToSort.length -1) {                   //imprimir hasta uno antes del largo del array
                System.out.print(arrayToSort[j] + ". \n");
            } else {
                System.out.print(arrayToSort[j] + ", ");
            }
        }

    }
}
