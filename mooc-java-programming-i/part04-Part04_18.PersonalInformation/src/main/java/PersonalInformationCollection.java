
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "-", Lname, id;
        
        while(true){
            System.out.print("First name: ");
            name = scanner.nextLine();
            if(name.equals("")){
                System.out.println("");
                break;
            }
            //
            System.out.print("Last name: ");
            Lname = scanner.nextLine();
            System.out.print("Identification number: ");
            id = scanner.nextLine();
            //
            infoCollection.add(new PersonalInformation(name, Lname, id)); 
        }
        //
        for(int i = 0; i < infoCollection.size(); i++){
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }

    }
}
