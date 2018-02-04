package pl.softus;

import pl.softus.factories.SubSetFactory;
import pl.softus.printers.SetPrinter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
	    Set<String> set = new HashSet(Arrays.asList(args));
	    new SubSetFactory().getSubsets(set).forEach(
	        subSet -> SetPrinter.printSet(subSet)
        );
    }
}
