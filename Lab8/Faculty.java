package OOP.Lab8;

public class Faculty extends Person{
    String officeHours;
	String rank;

    public Faculty(String name, String address, int phoneNum, String email, int office, double salary, String officeHours, String rank) {
		super(name, address, phoneNum, email);
		this.officeHours = officeHours;
		this.rank = rank;
	}

    public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
    public void setRank(String rank) {
		this.rank = rank;
	}

    public String getOfficeHours() {
		return officeHours;
	}
    public String getRank() {
		return rank;
	}

    public String toString() {
		return super.toString() + 
        "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}
