import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Juan");
        nameList.add("Pedro");
        nameList.add("Sebastian");

        nameList.removeLast();

        for (String name: nameList) {
            System.out.println(name);
        }

        HashMap<String, String> nameMap = new HashMap<>();
        nameMap.put("Uno", "Numero");
        nameMap.put("Vaso", "Palabra");

    }
}