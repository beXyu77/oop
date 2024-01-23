package OOP.Lab8;

public class Employee extends Person {
    int office;
    double salary;

    public Employee(String name, String address, int phoneNum, String email, int office, double salary) {
		super(name, address, phoneNum, email);
		this.office = office;
		this.salary = salary;
	}

    public void setOffice(int office) {
		this.office = office;
	}
    public void setSalary(double salary) {
		this.salary = salary;
	}

    public int getOffice() {
		return office;
	}
    public double getSalary() {
		return salary;
	}

    public String toString() {
		return super.toString() + 
                "\nOffice: " + office + 
		         "\nSalary: THB " + getSalary();
	}
}
