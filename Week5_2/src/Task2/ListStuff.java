package Task2;

import java.util.ArrayList;

public class ListStuff {
    private static final ArrayList<String> strings = new ArrayList<>();

    public static synchronized boolean addElement(String s) {
        strings.add(s);
        System.out.println("List size now after adding: " + strings.size());
        return true;
    }

    public static synchronized boolean removeElement(String s) {
        for (String str : strings) {
            if (str.equalsIgnoreCase(s)) {
                strings.remove(str);
                System.out.println("List size now after removing: " + strings.size());
                return true;
            }
        } return false;
    }

    public static boolean hasString(String s) {
        return strings.contains(s);
    }

    public static int listSize() {
            return strings.size();
    }
}
