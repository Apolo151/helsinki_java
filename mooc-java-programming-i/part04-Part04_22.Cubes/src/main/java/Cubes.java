
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String num="";
        int numb;
        while(true){
            num = scanner.nextLine();
            if(num.equals("end")){
                break;
            }
            numb = Integer.valueOf(num);
            System.out.println(numb*numb*numb);
        }

    }
}
