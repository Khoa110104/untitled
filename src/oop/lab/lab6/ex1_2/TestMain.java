package oop.lab.lab6.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        //Test constructor and toString()
        Person person = new Person("Lam", "Ha Noi");
        System.out.println(person);

        //Test getter and setter
        person.setAddress("Ha Nam");
        System.out.println("address is:" + person.getAddress());

        //Test constructor and toString()
        Student student1 = new Student("Khoa", "Ha Noi", "CLC", 2010, 1000000);
        System.out.println(student1);

        //Test getter and setter
        student1.setFee(1234);
        student1.setYear(2020);
        student1.setProgram("CLT");
        student1.setAddress("Ha Tinh");
        System.out.println("program is: " + student1.getProgram());
        System.out.println("fee is: " + student1.getFee());
        System.out.println("year is:" + student1.getYear());
        System.out.println("address is: " + student1.getAddress());

        //Test constructor and toString()
        Staff staff1 = new Staff("Hao", "Quang Nam", "Hus", 100);
        System.out.println(staff1);

        //Test getter and setter
        staff1.setSchool("Neu");
        staff1.setPay(1999);
        System.out.println("school is: " + staff1.getSchool());
        System.out.println("pay is: " + staff1.getPay());
        System.out.println(staff1);
    }
}
