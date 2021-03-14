import java.util.Arrays;

public class SortDemoApp {

    public static void main(String[] args) {
        System.out.println("\nHola! voy a ordenar un array de ints en order descendiente (mayor a menor).");
        System.out.println("Este es el array que he creado. Se llama \"arr\". How cute and creative, ugh? :)");
        System.out.println("Well, this is a programming course, here we get creative with algorithms, not with array names XD");
        System.out.println("Besides, names should be descriptive!");
        System.out.println("Talking about names: variable names and method names should start with lower case --> Camel Case");
        System.out.println("Class names start with upper case letters...");
        System.out.println("Why so much talk? Wasn't I supposed to sort something? ");
        System.out.println("Am I procrastinating with text?");
        System.out.println("OK. Let's get to it!! As I was saying, this is \"arr\". My newly created array:");

        int[] arr = {17, 30, 24, 7, 9, 4, 10, 27, 8, 12};
        System.out.println("\n" + Arrays.toString(arr) + "\n");
        System.out.println("Estoy orgullosa de mí, xq lo creé en una línea así: " +
                "\nint[] arr = {17, 30, 24, 7, 9, 4, 12, 27, 8, 12};");
        System.out.println("\ny lo imprimí en una línea también, así: " +
                "\nSystem.out.println(\"\\n\" + Arrays.toString(arr) + \"\\n\");");
        System.out.println("Ahora voy a llamar al método q he creado para que lo ordene. " +
                "\nle pasaré \"arr\" como parámetro y me lo dejará ordenado de mayor a menor (descendiente)");


        System.out.println("Si todo sale bien aquí verás su nuevo orden: ");
        System.out.println(Arrays.toString(arrangeOrder(arr)));
    }

    public static int[] arrangeOrder (int[] numbers){

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i-1] < numbers[i]){
                    int temp = 0;
                    temp = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        return numbers;

    }
}
