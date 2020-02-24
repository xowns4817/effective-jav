package item52;

import java.util.ArrayList;
import java.util.List;

public class Auto_Un_Boxing {

    public static void main(String args[ ]) {

        //자바 1.5부터  primitive <-> wrapper
        List<Integer> list = new ArrayList<>();
        list.add(10); // 오토박싱
        list.add(20); // 오토박싱

        int num = list.get(0); // 언박싱
        System.out.println(num);
    }
}
