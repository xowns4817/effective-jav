package item54;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Cheese {
    private final List<String> cheeseName;

    public Cheese( ) {
        cheeseName = new ArrayList<>();
        cheeseName.add("1");
        cheeseName.add("2");
    }

    // case 1 : bad case
    public List<String> getCheese( ) {
        return cheeseName.isEmpty() ? null : new ArrayList<>(cheeseName);
    }

    // case 2 : not bad
    public List<String> getCheese2( ) {
        return new ArrayList<>(cheeseName);
    }

    // case 3 : 최적화 ( 객체 재사용 - singleton )
    public List<String> getCheese3( ) {
        return cheeseName.isEmpty() ? Collections.emptyList()
                : new ArrayList<>(cheeseName);
    }

    // case 4 : return Array
    public String[ ] getCheese4( ) {
    //    String array[ ] = new String[2];
    //     array[0] = "hello";
     //    array[1] = "world!";

     //    return cheeseName.toArray(array);
        return cheeseName.toArray(new String[10]);// 새로 만들어지나? 어떻게 확인?

        /**
         *  toArray
         * 1. List를 toArray 메서드에 파라메터로 넘어가는 배열 객체의 size만큼의 배열로 전환한다.
         *  단, 해당 List size가 인자로 넘어가는 배열 객체의 size보다 클때, 해당 List의 size로 배열이 만들어진다.
         *  반대로 해당 List size가 인자로 넘어가는 배열객체의 size보다 작을때는, 인자로 넘어가는 배열객체의 size로 배열이 만들어진다.
         */
    }
}