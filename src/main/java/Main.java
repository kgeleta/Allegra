import wrappers.Class;

public class Main {

    public static void main(String[] args) {


        MyVisitor visitor = new MyVisitor();
        Class test = visitor.parse("class SomeClass is\n" +
                "String aaaa12;" +
                "Integer bbbb32;" +
                "function Name(Integer : aaa, String : dupa) return String is\n" +
                "begin\n" +
                "instrukcja;" +
                "instrukcja2;" +
                "zmienna := 12 + 87 * 7 + aaa;" +
                "str := \"hello world\";" +
                "funVal := hello();" +
                "end\n" +
                " begin\n" +
                "end");
        System.out.println(test);
    }
}
