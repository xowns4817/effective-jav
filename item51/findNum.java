package item51;

import java.util.ArrayList;
import java.util.List;

public class findNum {

    public static void main(String args[ ]){

        // 리스트에서 특정 부분 리스트를 골라 특정 값의 idx 구하기
        List<Integer> list = new ArrayList<>();
        list.add(2223);
        list.add(254);
        list.add(222);
        list.add(20);
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(54);
        list.add(32);
        list.add(21);

        List<Integer> list2 = list.subList(2, 8);
        System.out.println(list2.indexOf(4));


    }
}
