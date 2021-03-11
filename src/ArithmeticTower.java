public class ArithmeticTower {
    public static void main(String[] args) {

        long dateValue = 202103;       //seteamos el valor inicial CUIDADO DEBE SER LONG!!!

        System.out.println("ARITHMETIC TOWER : " + dateValue);

        for (int i = 2; i <= 9 ; i++) {

            System.out.println( dateValue + " * " + i + " = " + dateValue * i);

            dateValue = dateValue * i;

        }

        for (int i = 2; i <= 9; i++) {

            System.out.println( dateValue + " / " + i + " = " + dateValue / i );

            dateValue = dateValue / i;

        }

        System.out.println("ARITHMETIC TOWER : " + dateValue);
    }
}
