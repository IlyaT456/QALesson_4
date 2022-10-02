package QALesson;

import java.util.Scanner;

public class CalculationsJava {

    public static void main(String[] args) {

        // Операции + - * / % с простым и дробным числом.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе дробное число: ");
        double numberTwo = scanner.nextDouble();
        int result;
        System.out.println("Выберите операцию +, -, *, /: ");
        char operations = scanner.next().charAt(0);
        switch (operations) {
            case '+':
                result = numberOne + (int)numberTwo;
                break;
            case '-':
                result = numberOne - (int)numberTwo;
                break;
            case '*':
                result = numberOne * (int)numberTwo;
                break;
            case '/':
                result = numberOne / (int)numberTwo;
                break;
            default:
                System.out.println("Не правельная операция");
                return;
        }
            System.out.println("Результат = " + result);

        // ищем большее число с помощью условия(if, else if, else)
        if(numberOne > numberTwo && result != 0){
            System.out.println("Первое число больше и вычесление двух чисел не равняется 0");
        } else if (numberOne < numberTwo){
            System.out.println("Второе число больше и вычесление двух чисел не равняется 0");
        } else {
            System.out.println("Числа равны и вычесление двух чисел не равняется 0");
        }

        // ищем большее число с помощью тернарной операции
        String moreNumber = (3 > 2)? "Первое число больше чем второе": "Второе число больше чем первое";
        System.out.println(moreNumber);

        // добиваемся перевыплнении
        byte overFulFilmentByte = (byte) Integer.MAX_VALUE + 1;
        short overFulFilmentShort = (short) Integer.MAX_VALUE + 1;
        int overFulFilmentInt = Integer.MAX_VALUE + result;
        long overFulFilmentLong = (long) Integer.MAX_VALUE + 1;
    }
}
