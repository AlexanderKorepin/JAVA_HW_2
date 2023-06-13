// 1Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
// Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class zadacha_1 {
    public static void main(String[] args) {
    File myFile = new File("log_1.txt");
    try (BufferedReader myBufferedFile = new BufferedReader(new FileReader(myFile))) {
        String line;
        while ((line = myBufferedFile.readLine()) != null) {
            String newLine[] = line.split("\"");
            StringBuilder result = new StringBuilder(
                "Students " + newLine[3] + " country " + newLine[7] + " city " + newLine[11]);
            System.out.println(result);
        }
    } catch (Exception e) {
        System.out.println("Что-то пошло не так");

    }
}
}