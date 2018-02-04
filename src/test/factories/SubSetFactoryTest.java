package test.factories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.softus.factories.SubSetFactory;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class SubSetFactoryTest {

    private SubSetFactory subSetFactory = new SubSetFactory();

    @Before
    public void init() {}

    @Test
    public void getSubSetsOfEmptySet() {
        Collection<Set<String>> subsets = subSetFactory.getSubsets(new HashSet<>());
        assertEquals(1, subsets.size());
        assertTrue(subsets.contains(new HashSet<>()));
    }

    @Test
    public void getSubSetsOfSingleElementSet() {
        Collection<Set<String>> subsets = subSetFactory.getSubsets(new HashSet<>(Arrays.asList("1")));
        assertEquals(2, subsets.size());
        assertTrue(subsets.contains(new HashSet<>()));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1"))));
    }

    @Test
    public void getSubSetsOfTwoElementSet() {
        Collection<Set<String>> subsets = subSetFactory.getSubsets(new HashSet<>(Arrays.asList("1", "2")));
        assertEquals(4, subsets.size());
        assertTrue(subsets.contains(new HashSet<>()));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("2"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1", "2"))));
    }

    @Test
    public void getSubSetsOfMultipleElementSet() {
        Collection<Set<String>> subsets = subSetFactory.getSubsets(new HashSet<>(Arrays.asList("1", "2", "3")));
        assertEquals(8, subsets.size());
        assertTrue(subsets.contains(new HashSet<>()));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("2"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("3"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1", "2"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1", "3"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("2", "3"))));
        assertTrue(subsets.contains(new HashSet(Arrays.asList("1", "2", "3"))));
    }
}