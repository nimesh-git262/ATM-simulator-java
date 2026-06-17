public class Book{
    private int id;
    private String tittle;
    private String author;
    private boolean issued;

    public Book(int id, String tittle, String author, boolean issued){
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.issued = false;
    }
    public int getId(){
        return id;
    }
    public String getTittle(){
        return tittle;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isIssued(){
        return issued;
    }
    public void issueBook(){
        issued = true;
    }
    public void returnBook(){
        issued = false;
    }

    public String toString(){
        return "ID: " + id + ", Tittle: " + tittle + ", Author: " + author + ", Status: " + (issued ? "Issued" : "Available");
    }
}