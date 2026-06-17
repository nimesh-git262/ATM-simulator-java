import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Books added successfully");
    }
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No book available");
            return;
        }
        for(Book book : books){
            System.out.println(book);
        }
    }
    public Book searchBook(int id){
        for (Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }
    public void issueBook(int id){
        Book book = searchBook(id);

        if(book == null){
            System.out.println("Book not found");
        }else if(book.isIssued()){
            System.out.println("Book already issued");
        }else{
            book.isIssued();
            System.out.println("Book issued successfully");
        }
    }
    public void returnBook(int id){
        Book book = searchBook(id);

        if(book == null){
            System.out.println("Book not found");
        }else if(!book.isIssued()){
            System.out.println("Book is already available");
        }else{
            book.returnBook();
            System.out.println("Book returned successfully");
        }
    }
}