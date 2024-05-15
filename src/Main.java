import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Результаты задания № 1: ");
        funAandBInt();
        System.out.println("Результаты задания № 2: ");
        compareString();
        System.out.println("Результаты задания №3: ");
        arrayInt();
    }
    public static void compareString(){
        Scanner consoleStr = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = consoleStr.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = consoleStr.nextLine();
        if (str1.equals(str2)){
            System.out.println("Строки идентичны: " + str1 + " и " + str2);
        } else {
            System.out.println("Строки неидентичны: " + str1 + " != " + str2);
        }
    }
    public static void funAandBInt() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = console.nextInt();
        System.out.println("Введите B: ");
        int b = console.nextInt();
        System.out.println("a = " + a + ", b = " + b);
        if (a > b) {
            System.out.println("a > b");
        } else if (b > a) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.print("Результат a + b, от перемены мест слогаемых сумма не менятся: ");
        System.out.println(a + b);
        System.out.print("Результат a - b: ");
        System.out.println(a - b);
        System.out.print("Результат b - a: ");
        System.out.println(b - a);
        System.out.print("Результат a * b, от перемены мест множителей произмедение не меняется:  ");
        System.out.println(a * b);
        System.out.print("Результат a / b: ");
        System.out.println(Double.valueOf(a) / Double.valueOf(b));
        System.out.print("Результат b / a: ");
        System.out.println(Double.valueOf(b) / Double.valueOf(a));
    }
    public static void arrayInt(){
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа из массива " + Arrays.toString(numbers) + ":");
        for (var value : numbers ) {
            if (value % 2 == 0){
                System.out.println(value);
            }
        }
    }
}