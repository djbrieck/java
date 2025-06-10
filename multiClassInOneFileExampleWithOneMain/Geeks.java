// A Java program to demonstrate working
// of a Class type object created by JVM
// to represent .class file in memory
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Java code to demonstrate use
// of Class object created by JVM
public class Geeks
{
    public static void main(String[] args)
    {
        Student s1 = new Student();

        // Getting hold of Class
        // object created by JVM.
        Class c1 = s1.getClass();

        // Printing type of object using c1.
        System.out.println("Calling get name on c1");   
	    System.out.println(c1.getName());

        System.err.println("Printing s1 get name");
        System.err.println(s1.getName());

        System.err.println("---------------------------------");

        // getting all methods in an array
        System.err.println("Printing C1's declared methods...");
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());

        System.err.println("---------------------------------");
        
        // getting all fields in an array
        System.err.println("Printing c1 declared fields...");
        Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());
    }
}

// A sample class whose information
// is fetched above using its Class object.
class Student {
    private String name;
    private int roll_No;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRoll_no() { return roll_No; }
    public void setRoll_no(int roll_no)
    {
        this.roll_No = roll_no;
    }
}

class bob {
    public static void main(String[] args) {
        System.out.println("This is a class named bob.");
    }
}

class alice {
    public static void main(String[] args) {
        System.out.println("This is a class named alice.");
    }
}
class charlie {
    public static void main(String[] args) {
        System.out.println("This is a class named charlie.");
    }
}
class dave {
    public static void main(String[] args) {
        System.out.println("This is a class named dave.");
    }
}

class geek {
    public static void main(String[] args) {
        System.out.println("This is a class named geek.");
    }
}