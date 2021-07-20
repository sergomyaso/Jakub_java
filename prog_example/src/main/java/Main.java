import org.sergomyaso.handlers.ArrayHandler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayHandler handler = new ArrayHandler();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(2);
        a1.add(3);
        a1.add(8080);

        a2.add(8080);
        a2.add(123);

        var array = handler.findCompareArray(a1, a2);
        System.out.println(array);
    }
}
