import java.util.Random;

    public class LottoNumberGeneratorDemo {

        public static void main(String[] args) {

            System.out.println("Unser Quicktipps");

            // Verschachtelung von Schleifen
            for (int tipps = 0; tipps < 5; tipps++) {
                System.out.print("Nr. " + tipps + ": ");
                int[] arr = createOneTipp();

                for (int i=0; i< arr.length; i++){
                    System.out.println(arr[i] + ", ");
                }
                // TODO 2:
                // wir speichern uns den int[]
                // wir gegen den Tipp aus
            }
        }

        // rewrite this method
    /*  TODO 1:
        - no print inside method
        - erzeugt einen Array mit den Länge von 6 / creates an array with length of 6
        - befüllt den Array mit 6 Zufallszahlen / fills the array with 6 random numbers (immer noch nicht eindeutig)
        - retourniert den Array an den Aufrufer
     */
        public static int[] createOneTipp(){
            //  for(startwert; bedingung;inkrement)

            int[] oneTipp = new int[6]; //1.

            for (int i = 0; i < 6; i++) {
                oneTipp[i] = generateOneNumber(45);

                //System.out.print(generateOneNumber(45) + ", ");
            }
            return oneTipp;
        }

        public static int generateOneNumber(int range){
            Random random = new Random();
            int randValue = random.nextInt();
            if (randValue < 0) {
                randValue = randValue * -1;
            }

            int value = (randValue % range) + 1;

            return value;
        }
    }
