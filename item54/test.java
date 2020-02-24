package item54;

import javax.swing.text.Style;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test {

    public static void main(String[ ] args) {

        Cheese cheese = new Cheese();

        //test Case - case 1
        List<String> list = cheese.getCheese();
        if(list != null) {
            for(int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("Empty!!");
        }

        //test Case - case 2
        System.out.println("=================");
        List<String> list2 = cheese.getCheese2();
        for(int i=0; i<list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        //test Case - case 3 최적화
        System.out.println("=================");
        List<String> list3 = cheese.getCheese2();
        for(int i=0; i<list3.size(); i++) {
            System.out.println(list3.get(i));
        }


        //test Case - case 4 return array
        System.out.println("=================");
        String arr[ ] = cheese.getCheese4();
        System.out.println("size of array : " + arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
