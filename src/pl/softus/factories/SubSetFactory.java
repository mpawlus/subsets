package pl.softus.factories;

import java.util.*;


public class SubSetFactory {

    public Collection<Set<String>> getSubsets(Set<String> set) {
        Collection<Set<String>> subsets = set.isEmpty() ? new LinkedList() : getSubsetsRecursively(set);
        subsets.add(new HashSet());
        return subsets;
    }

    private Collection<Set<String>> getSubsetsRecursively(Set<String> set) {
        Collection<Set<String>> subsets = new LinkedList();

        if (set.isEmpty()) {
            return subsets;
        }

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Object currentElement = iterator.next();
            subsets.add(new HashSet(Arrays.asList(currentElement.toString())));
            iterator.remove();

            getSubsetsRecursively(new HashSet(set)).forEach(subsetWithoutCurrentElement -> {
                final Set subset = new HashSet((Set)subsetWithoutCurrentElement);
                subset.add(currentElement);
                subsets.add(subset);
            });
        }


        return subsets;
    }
}
