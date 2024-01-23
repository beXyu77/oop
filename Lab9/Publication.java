package OOP.Lab9;

public class Publication {
    private String publisher;
    private int pages;
    private double price;
    private String title;

    public Publication(String publisher,int pages,double price,String title){
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
        this.title = title;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher; 
    }
    public void setPages(int pages){
        this.pages = pages; 
    }
    public void setPrice(double price){
        this.price = price; 
    }
    public void setTitle(String title){
        this.title = title; 
    }

    public String getPublisher(){
        return publisher;
    }
    public int getPages(){
        return pages;
    }
    public double getPrice(){
        return price;
    }
    public String getTitle(){
        return title;
    }

    public String pubPrint(){
        return "The " + getPublisher() + " publishes " + 
        getTitle() + " , " + 
        getPages() + " pages " +
        getPrice() + " Bahts. ";
    }
}
