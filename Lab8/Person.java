package OOP.Lab8;

public class Person {
    String name;
    String address;
    int phoneNum;
    String email;

    public Person(String name, String address, int phoneNum, String email) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}

    public void setName(String name) {
		this.name = name;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
    public void setEmail(String email) {
		this.email = email;
	}

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhoneNum(){
        return phoneNum;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return 
        "\nname: " + name + 
        "\naddress: " + getAddress() + 
        "\nphone number: " + getPhoneNum() +
        "\nemail: " + getEmail();
    }
}
