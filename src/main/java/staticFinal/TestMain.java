package staticFinal;

public class TestMain {

    public static  final Person mariusz = new Person("mariusz");

    public static void main(String[] arg){

        TestStstic.print(); // 111

        TestStstic testStstic1 = new TestStstic();
        testStstic1.a = "2222";
        testStstic1.b = "asdasd";


        (new TestStstic()).print(); // 2222


        TestStstic.a = "333";

        TestStstic.print(); // 222

        (new TestStstic()).print();
    }
}
