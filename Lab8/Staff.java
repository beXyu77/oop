package OOP.Lab8;

public class Staff extends Person{
    String title;

    public Staff(String name, String address, int phoneNum, String email, int office, double salary, String title) {
		super(name, address, phoneNum, email);
		this.title = title;
	}

    public String getTitle() {
		return title;
	}

    public void setTitle(String title) {
		this.title = title;
	}

    public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
