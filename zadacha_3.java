import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
// К калькулятору из предыдущего ДЗ добавить логирование.
// 4+2=6
// 6-1=5
public class zadacha_3{
    public static void main(String[] args) {
        File calculator = new File("calculator.txt");
        Scanner symbol = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = symbol.nextDouble();
        System.out.print("Выберите действие (+, -, /, * ): ");
        String action = symbol.next();
        System.out.print("Введите второе число  ");
        double num2 = symbol.nextDouble();
        double result = 0;
        String a = "+";
        String b = "-";
        String c = "*";
        String d = "/";
        try {
            FileWriter writer = new FileWriter(calculator, true);
            if (action.equals(a)) {
                result = num1 + num2;
                System.out.println(result);
            }
            if (action.equals(b)) {
                result = num1 - num2;
                System.out.print(result);
            }
            if (action.equals(c)) {
                result = num1 * num2;
                System.out.print(result);
            }
            if (action.equals(d)) {
                result = num1 / num2;
                System.out.print(result);
            }
            writer.write(num1 + action + num2 + "=" + result + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("\n" + "Что-то не так");
        }
        symbol.close();
    }
}