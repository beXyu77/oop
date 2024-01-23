package OOP.Lab7;

public class Dog {
    private String name;
    private int age;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
    }

    public int getAge(){
        return age;
    }

    public int getPersonAge(){
        return age*7;
    }

    public String toString(){
        return "Dog: " + getName() + "\tAge: " + getAge() + "\tPerson-Years: " +getPersonAge();
    }
}
