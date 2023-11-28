
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        //
        try (Scanner sc = new Scanner(Paths.get(file))){
            String name;
            int age;
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                String[] vals = row.split(",");
                name = vals[0];
                age = Integer.valueOf(vals[1]);
                //
                System.out.print(name + ", age: ");
                System.out.println(age + " years");
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
