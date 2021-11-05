import java.util.Arrays;

public class TestInheritance {

    public void testMainClass() {
        System.out.println("In main class");
    }


}

class TestInheritanceChild extends TestInheritance {

    public void testMainClass() {
        System.out.println("In child class class");
    }


}

class TestCaller {
    public static void main(String[] args) {

        String name = "Praveen";
        System.out.println("name" +
                " = " + name);

        name += "Swamy";
        System.out.println("name" +
                " = " + name);

        System.out.println("intern = " + name.intern());
        TestInheritance parent = new TestInheritance();
        TestInheritanceChild child = new TestInheritanceChild();
        TestInheritance a = new TestInheritanceChild();
        parent.testMainClass();
        child.testMainClass();
        a.testMainClass();

    }
}



