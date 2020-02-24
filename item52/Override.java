package item52;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

class Wine {
    String name( ) { return "포도주"; }
}

class SparklingWine extends Wine {
    @java.lang.Override
    String name( ) {return "발포성 포도주";}
}

class Champagne extends SparklingWine {
    @java.lang.Override
    String name() { return "샴페인";}
}

public class Override {
    public static void main(String args[ ]) {
        List<Wine> wineList = new ArrayList<>();
        wineList.add(new Wine());
        wineList.add(new SparklingWine());
        wineList.add(new Champagne());

        for(Wine wine : wineList) {
            System.out.println(wine.name());
        }
    }
}
