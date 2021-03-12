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
        generateFiveRandomNumbersArray(range);

        System.out.println("----------- ********* ----------- ");
        System.out.println("Now, I am going to generate five random positive numbers in a range (1 to " + range + ") and print them below.");
        System.out.println("But I had previously saved them in an array and then print from the array!");
        System.out.println("Extra level of difficulty: print them in ascending order :O");


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

    public static void generateFiveRandomNumbersArray(int range){
        int[] arrayRandom = new int[5];
        System.out.print("And the numbers are : ");

        for (int i = 0; i < 5; i++) {
           arrayRandom[i] = generateOneRandomNumber(range);
        }

        for (int j = 0; j < arrayRandom.length; j++) {
            if (j == 4) {
                System.out.print(arrayRandom[j] + ". \n");
            } else {
                System.out.print(arrayRandom[j] + ", ");
            }
        }

    }
}
