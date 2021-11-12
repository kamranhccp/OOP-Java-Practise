package Package_02;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Kamran";
        p1.age = 17;
        p1.uni = "COMSATS";

        Person p2 = new Person();
        p2.name = "Mubeen";
        p2.age = 18;
        p2.uni = "AIR";

        p1.hasName();
        p2.study();
        p2.walk();

        Person p3 = new Person(); // Checking Default Constructor Object


        // Use of static
        // you can access even without object
        // but by using class
        Person.subject = "OOP";
        System.out.println("Subject: "+ Person.subject);

        System.out.println("Num: " + Person.num);
        System.out.println("INFO: " + Person.line01);


        // This Keyword and Constructor
        Person p4 = new Person(13, "Khalid");


        // How many times a Person has been created
        System.out.println("How many Times: " + Person.count);


        // Access Modifier
        Person.mySubjects("Public: "); // public
        Person.mySubjects03("Protected: "); // protected
        Person.mySubjects04("Static: "); // static
        System.out.println("Private: | Person.mySubjects02() | " +
                ">>> is not accessible outside" +
                "the Class!"); // private


        // Increment Testing
        Person.iIncrement = 12;
        Person.sIncrement = "BeginnersBook";
        System.out.println("i: " + Person.iIncrement);
        System.out.println("s: " + Person.sIncrement);

        int x = 0;
        for (x = 0; x < 5; ++x){
            System.out.println(x);
            System.out.println("<== Incrementing Value of iIncrement ==>");
            System.out.println(Person.iIncrement);
        }
    }
}
