import java.util.Arrays;
import java.util.Random;                                        //Necesitamos esto para Random

    public class LottoNumberGeneratorDemo1 {

        public static void main(String[] args) {                // Main: de acá empieza a correr

            System.out.println("*** Hello! I will give you lotto numbers suggestions!! ***");
            for (int counterA = 0; counterA < 5; counterA++) {  //Este FOR es un loop de 5 para q me de 5 sugerencias -->
                                                                //de números a los que apostar.

                System.out.print("Suggestion nr. " + (counterA+1) + ": "); //+1 para que no empiece en 0 el ciclo de sugerencias (solo para printear)
                                                                //por alguna razón necesita el paréntesis

                int[] arr = createOneTipp();                    //aquí llamamos al método createOneTipp que retorna un array
                                                                //el array retornado lo guardamos en otro array llamado "arr"
                Arrays.sort(arr);                               //aquí ordenamos el array de manera ascendente
                for (int i = 0; i < arr.length; i++) {          //este for recorre arr e imprime su contenido -->
                    if (i == arr.length - 1) {                  //el contenido de arr son las sugerencias!! :)
                        System.out.print(arr[i] + ".\n");
                    } else {
                        System.out.print(arr[i] + ", ");
                    }
                }
            }
            System.out.println("*** Good Luck!! Don't forget my share if you win :) ***");
        }

        public static int[] createOneTipp(){                    //aquí creamos un array (oneTipp) con nrs random

            int[] oneTipp = new int[6];                         //aquí declaro oneTipp con 6 espacios

            for (int i = 0; i < 6; i++) {                       //en este loop lleno el contenido del array
                oneTipp[i] = generateOneNumber(45);       //el array se va a llenar con nrs random generados por el otro método
            }
            return oneTipp;                                     //retorna el array
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

