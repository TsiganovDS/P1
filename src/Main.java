import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(number); i++) { //квадратный корень
            if (number % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(number + " простое число");
        } else {
            System.out.println(number + " составное число");

        }

    }

}




