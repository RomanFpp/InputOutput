import java.io.*;
import java.util.Scanner;

public class Main {
    public static  void main (String[] args) {

 Scanner scanner  = new Scanner(System.in);
String path = scanner.nextLine();
try(FileInputStream littleFils = new FileInputStream(path);

    InputStreamReader isr = new InputStreamReader(littleFils);

    BufferedReader bufferedReader = new BufferedReader(isr)){

    bufferedReader.lines()
            .map(Integer:: parseInt)
            .filter(x -> x % 2 == 0)
            .sorted()
            .forEach(System.out::println);
} catch (FileNotFoundException e) {

} catch (IOException e) {

    throw new RuntimeException(e);
}



    }

}