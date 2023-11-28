
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        // define output
        int games=0, wins=0, losses=0;
        // read from file
        try (Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                String[] vals = row.split(",");
                if(!vals[0].equals(team) && !vals[1].equals(team)){
                    continue;
                }
                //
                games++;
                int hPnts = Integer.valueOf(vals[2]), aPnts = Integer.valueOf(vals[3]);
                if(vals[0].equals(team)){
                    if(hPnts > aPnts){
                        wins++;
                    } else{
                        losses++;
                    }
                } else if(vals[1].equals(team)){
                    if(hPnts > aPnts){
                        losses++;
                    } else{
                        wins++;
                    }
                }
                
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        // printing output
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
