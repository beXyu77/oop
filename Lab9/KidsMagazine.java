package OOP.Lab9;

public class KidsMagazine extends Publication{
    private int ageRange;

    public KidsMagazine(int ageRange,String publisher,int pages,double price,String title) {
		super(publisher,pages,price,title);
		this.ageRange = ageRange;
	}

    public void setAgeRange(int ageRange){
        this.ageRange = ageRange;
    }

    public int getAgeRange(){
        return ageRange;
    }

    public String pubPrint() {
		return super.pubPrint() + "\nThe age range is: " + ageRange;
	}
}
