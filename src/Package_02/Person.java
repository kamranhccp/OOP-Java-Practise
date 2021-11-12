package Package_02;

// Class Person
public class Person{
    // Behaviour
    static String subject;
    String name;
    int age;
    String uni;

    static int num;
    static String line01;

    // Class Property not object
    static int count;

    // Default Constructor
    public Person(){
        count++;
        System.out.println("Default Constructor Object!");
    }

    public Person(int newAge, String newName){
        this.name = newName;
        this.age = newAge;
    }
    // Properties
    void hasName(){
        System.out.println(name + " is my Name.");
    }
    void walk(){
        System.out.println(name + " can walk easily!");
    }
    void study(){
        System.out.println(name + " with Age " + age + " is studying at " + uni + " University!");
    }

    // static Block
    static{
        System.out.println("THIS IS STATIC BLOCK!");
        num = 212;
        line01 = "My name is Kamran";
    }

    // Access Modifier Checking
    public static void mySubjects(String aPublic){
        System.out.println(aPublic + "Learning Data Science from AlNafi.com");
    }

    private static void mySubjects02(){
        System.out.println("Learning Data Science from AlNafi.com");
    }

    protected static void mySubjects03(String bPublic){
        System.out.println(bPublic + "Learning Data Science from AlNafi.com");
    }

    static void mySubjects04(String cPublic){
        System.out.println(cPublic + "Learning Data Science from AlNafi.com");
    }

    // Increment
    static int iIncrement;
    static String sIncrement;
}
