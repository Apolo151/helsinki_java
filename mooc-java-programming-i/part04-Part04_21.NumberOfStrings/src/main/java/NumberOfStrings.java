
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word="";
        int cnt=0;
        while(true){
            word = scanner.nextLine();
            if(word.equals("end")){
                break;
            }
            //
            ++cnt;
            
        }
        //
        System.out.println(cnt);

    }
}
