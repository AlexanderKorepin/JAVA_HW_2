import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class zadacha_2{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    File bubble = new File("Log_2.txt");
    int[] numArr = new int[] { 10, 3, 7, 6, 2 };
    int temp = 0;
    for (int k = 0; k < numArr.length; k++) {
         for (int i = 1; i < numArr.length - k; i++) {
            if (numArr[i] < numArr[i - 1]) {
                temp = numArr[i];
                numArr[i] = numArr[i - 1];
                numArr[i - 1] = temp;
            }
            try {
                FileWriter writer = new FileWriter(bubble, true);
                 for (int p = 0; p < numArr.length; p++) {
                    writer.write(numArr[p] + " ");
                }
                writer.write("\n");
                writer.close();
            } catch (Exception e) {
                System.out.println("Что-то не так");
            }
        }
    }
    for (int j = 0; j < numArr.length; j++) {
        System.out.print(numArr[j] + " ");
        }
    }

}