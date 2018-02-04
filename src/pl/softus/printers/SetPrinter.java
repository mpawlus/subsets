package pl.softus.printers;

import java.util.Set;


public class SetPrinter {
    public static void printSet(Set set) {
        set.forEach(item -> {
            print("\"");
            print(item.toString());
            print("\"");
            print(", ");
        });
        print("\n");
    }

    private static void print (String string) {
        System.out.print(string);
    }
}
