package OOP.Lab8;

public class Student extends Person{
    int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

    public Student(String name, String address, int phoneNum, String email, int status) {
		super(name, address, phoneNum, email);
		this.status = status;
	}

    public void setStatus(int status) {
		this.status = status; 
	}

    public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

    public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}