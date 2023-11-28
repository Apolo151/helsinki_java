import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        String name = "-";
        int pages, pubYear;
        
        while(true){
            System.out.print("Title: ");
            name = sc.nextLine();
            if(name.equals("")){
                System.out.println("");
                break;
            }
            System.out.print("Pages: ");
            pages = Integer.valueOf(sc.nextLine());
            System.out.print("Publication Year: ");
            pubYear = Integer.valueOf(sc.nextLine());
            //
            books.add(new Book(name, pages, pubYear));
        }
        //
        System.out.print("What information will be printed?");
        String what = sc.nextLine();
        System.out.println("");
        if(what.equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }
        else{
            for(Book book:books){
                System.out.println(book.getTitle());
            }
        }
        
        

    }
}
