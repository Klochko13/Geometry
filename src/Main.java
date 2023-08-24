import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Введите количество фигур");
        int n = key.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = n; j>i; j--) {
                System.out.print("* ");


            }

            System.out.println();
        }
        System.out.println("__________________________________________");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j>n; j++)

            {

                for (int k = 0; k<=j; k++) {
                    System.out.print("*");

                }

                System.out.print("  ");

            }

            System.out.println();
        }
    }
}