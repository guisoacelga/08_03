import java.util.Random;

    public class LottoNumberGeneratorDemo1 {

        public static void main(String[] args) {

            System.out.println("*** Hello! I will give you lotto numbers suggestions!! ***");

            for (int counterA = 0; counterA < 5; counterA++) {

                System.out.print("Nr. " + counterA + ": ");

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
        - creates an array with length of 6
        - fills the array with 6 random numbers (still not clear)
        - return the array to the caller
     */
        public static int[] createOneTipp(){
            //

            int[] oneTipp = new int[6]; //1.

            for (int i = 0; i < 6; i++) {
                oneTipp[i] = generateOneNumber(45);

                //System.out.print(generateOneNumber(45) + ", ");
            }
            return oneTipp;
        }

        public static int generateOneNumber(int range){
        // ***** Este método genera un int POSITIVO aleatorio --> EN UN RANGO DADO!

            Random random = new Random();      //crea un objeto de tipo Random llamado "random"
            int randValue = random.nextInt();  //nextInt() genera un integer aleatorio, lo guarda en randValue

            //**** ALERTA: el int puede ser negativo!! ****
                if (randValue < 0) {           //este if se ejecuta solo si randValue es un  nr negativo
                    randValue = randValue * -1; //si es negativo se multiplica por -1 para hacerlo positivo
                }

            //**** Aquí nos aseguramos de que el nro esté en el rango(parámetro)
            int value = (randValue % range) + 1;//randValue (int aleatorio positivo) módulo RANGO
                                                //módulo xq nunca será mayor q el nro al q se le saca
                                                //se suma 1 para incluir el último nro del rango


            return value;                       //retorna el int aleatorio (positivo y en un rango)
        }
    }
