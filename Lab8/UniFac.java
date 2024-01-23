package OOP.Lab8;

public class UniFac {
    public static void main(String[] args) {
        Person a = new Person("Peter", "Chiang Mai", 12121212, "12@gmail.com");
        Student b = new Student("Susan", "Chiang Rai", 13131313, "13@gmail.com", 1);
        Employee c = new Employee("Eva", "Chiang Dao", 14141414, "14@gmail.com", 512, 60000);
        Faculty d = new Faculty("Frank", "Pai", 15151515, "15@gmail.com", 112, 50000, "09:00-16:00", "High");
        Staff e = new Staff("Shane", "Bangkok", 16161616, "16@gmail.com", 314, 70000, "Lecturer");

        System.out.println(
            a.toString()+
            "\n" + b.toString() +
            "\n" + c.toString() +
            "\n" + d.toString() +
            "\n" + e.toString());
    }
}
