package OOP.Lab9;

public class Book extends Publication{
    private String author;

    public Book(String author,String publisher,int pages,double price,String title) {
		super(publisher,pages,price,title);
		this.author = author;
	}

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public String pubPrint() {
		return super.pubPrint() + "\nThe book has written by  " + getAuthor();
	}
}
