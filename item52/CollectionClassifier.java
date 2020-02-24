package item52;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionClassifier {

    public static String classify(Set<?> s) {
        return "집합";
    };

    public static String classify(List<?> lst) {
        return "리스트";
    };

    public static String classify(Collection<?> lst) {
        return "그 외";
    };

    public static void main(String[ ] args) {

            Collection<?>[] collections = {
                    new HashSet<String>(),
                    new ArrayList<BigInteger>(),
                    new HashMap<String, String>().values()
            };

            for(Collection<?> c : collections) {
                System.out.println(classify(c));
            }
    }
}
