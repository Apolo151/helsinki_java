
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (Scanner sc = new Scanner(Paths.get(fileName))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
