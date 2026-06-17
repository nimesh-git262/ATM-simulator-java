import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("===Library Managment System===");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. EXIT");
            
            System.out.println("Enter Choice");
            int Choice = sc.nextInt();

            if(Choice==1){
                System.out.println("Enter Book ID");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Tittle");
                String tittle = sc.nextLine();

                System.out.println("Enter Author");
                String author = sc.nextLine();

                library.addBook(new Book(id, tittle, author, false));
            }else if(Choice==2){
                library.viewBooks();
            }else if(Choice==3){
                System.out.println("Enter Book ID");
                    int id = sc.nextInt();

                    Book book = library.searchBook(id);
                if(book==null){
                    System.out.println(book);
                }else{
                    System.out.println("Book not found");
                }    
            }else if(Choice==4){
                System.out.println("Enter Book ID");
                int id = sc.nextInt();

                library.issueBook(id);
            }else if(Choice==5){
                System.out.println("Enter Book ID");
                int id = sc.nextInt();

                library.returnBook(id);
            }else{
                System.out.println("Invalid Choice");
            }
        }
    }
    
}