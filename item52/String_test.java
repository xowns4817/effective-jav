package item52;

public class String_test {

    public static void main(String args[ ]) {

        // charsequence ( Interface ) -> string, stringBuffer, stringBuilder ( Class )
        String str = "hello";
        if(str.contentEquals("hello")){
            System.out.println("Same!");
        } else {
            System.out.println("Different!");
        };

        StringBuffer stringBuffer = new StringBuffer("hello");
        if(str.contentEquals(stringBuffer)) {
            System.out.println("Same!");
        } else {
            System.out.println("Different !");
        };

        // valueOf(Object) vs valueOf( char [ ] )
        char ch[] = {'a', 'b', 'c'};
        String ch2 = String.valueOf(ch);
       // System.out.println(String.valueOf(ch));
        System.out.println(String.valueOf("hello"));

        // toString vs valueOf
        Object obj = null;
        System.out.println(String.valueOf(obj));
        System.out.println(obj.toString());

    }
}
