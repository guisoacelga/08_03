public class PrimValidationDemo1 {
    public static void main(String[] args) {
        System.out.println("isPrim(31) = " + isPrim(31));
        System.out.println("isPrim(42) = " + isPrim(42));
        System.out.println("isPrim(99961) = " + isPrim(99961));
        System.out.println("isPrim(906847) = " + isPrim(906847));
        System.out.println("isPrim(999983) = " + isPrim(999983));
        System.out.println("isPrim(1991999993) = " + isPrim(1991999993));
        System.out.println("isPrim(500) = " + isPrim(500));

        System.out.println("start");
        System.out.println("isPrim(1991999992) = " + isPrim(1991999992));
        System.out.println("isPrim(1991999993) = " + isPrim(1991999993));
    }

   // =============== VARIANTE 1 ===============

   public static boolean isPrim(int number) {       //se pasa como parámetro el nro q vamos a chequear si es o no primo

        int counter = 2;                            //counter funciona como CONTADOR
        boolean checkIsPrim = true;                 //se setea el return a true

        while(counter < number) {                   //Mientras el contador sea menor que el número (el número
                                                    //      no se chequea xq no cuenta como divisor)
            if(number % counter == 0) {             //aquí chequeamos si es primo. Si hay divisores no es primo
                checkIsPrim = false;                //aquí seteamos el return a false xq encontramos un divisor
            }
            counter ++;                             //aquí aumentamos el contador para revisar el sgte nro.
        }                                           // el contador se aumenta también para poder cerrar el loop

        return checkIsPrim;                         //si no entró al loop retorna este boolean q arriba se seteó a true
   }


    /*public static boolean isPrim(int number) {
        for(int checkValue = 2; checkValue < number / 2; checkValue++) {
            if (number % checkValue == 0){
                return false;
            }
        }
        return true;
    }*/
}
