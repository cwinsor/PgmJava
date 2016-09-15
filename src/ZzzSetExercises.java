import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Chris on 9/15/2016.
 */
public class ZzzSetExercises implements Set {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        Set<Integer> lowSet1 = new HashSet<Integer>();
        lowSet1.add(5);
        lowSet1.add(7);
        lowSet1.add(8);

        Set<Integer> lowSet2 = new HashSet<Integer>();
        lowSet2.add(12);
        lowSet2.add(15);
        lowSet2.add(16);

        System.out.println("lowSet1.size() = " + lowSet1.size());
        System.out.println("isEmpty " + lowSet2.isEmpty());

    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
