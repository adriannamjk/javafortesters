package staticFinal;

public class TestStstic {

    public static String a = "111";

    public String b = "bbb";

    public static void print(){
        TestStstic testNonStatic = new TestStstic();

        System.out.println(testNonStatic.b);
    }
}
