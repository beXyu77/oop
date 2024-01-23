package OOP.Lab9;

public class Magazine extends Publication {
    private String pubUnit;

    public Magazine(String publisher,int pages,double price,String title, String pubUnit) {
		super(publisher,pages,price,title);
		this.pubUnit = pubUnit;
	}

    public void setPubUnit(String pubUnit){
        this.pubUnit = pubUnit;
    }

    public String getPubUnit(){
        return pubUnit;
    }

    public String pubPrint() {
		return super.pubPrint() + "\nThis magazine is " + getPubUnit() + " print.";
	}
}