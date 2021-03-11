public class PrimValidationDemoFor {

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

    // =============== VARIANTE FOR ===============

    public static boolean isPrim(int number) {          //se pasa como parámetro el nro q vamos a chequear si es o no primo

        for (int counter = 2; counter < number / 2; counter++) {
                                                        //El CONTADOR va en el for
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }
}
