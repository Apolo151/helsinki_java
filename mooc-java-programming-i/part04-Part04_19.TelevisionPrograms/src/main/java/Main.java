import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "-";
        int duration;
        //
        while(true){
            System.out.print("Name: ");
            name = scanner.nextLine();
            if(name.equals("")){
                System.out.println("");
                break;
            }
            System.out.print("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());
            //
            programs.add(new TelevisionProgram(name, duration));
        }
        //
        System.out.print("Program's maximum duration? ");
        int maxDuration;
        maxDuration = scanner.nextInt();
        System.out.println("");
        //
        for(TelevisionProgram program : programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }

    }
}
