import java.util.LinkedHashSet;

/**
 * Created by Chris on 9/15/2016.
 * CartesianProduct is the cross of two sets
 *
 * More specifically -
 * given an Set composed of Sets whose States are unique
 * Cartesian Product produces a result which is
 * a Set composed of Sets, each of which is a unique combination of the States
*
 * For example -
 * Given    { {a,b,c}, {x,y} }    ( an unique set with 2 states, with those sets having 3 and 2 states respectively)
 * a Cartesian product of these will result in
 * { {a,x} {a,y} {b,x} {b,y} {c,x} {c,y} }   ( Set composed of Sets, each of which is a unique combination of the States)
 */
public class Zz01_CartesianProductOnSet extends LinkedHashSet {

    //Set<Zz02TreeTraverseUsingSet> set;
    private String result;

    // constructor - default
//    public Zz01_CartesianProductOnSet()
// {
    //     super();
    //}

    // constructor
    public Zz01_CartesianProductOnSet(String in) {
        super();
        this.result = new String(in);
    }

    // getter
    public String getResult() {
        return result;
    }

    public String toString() {
        String foo = new String(" ");
        foo = foo.concat(result);
        if (this.size() > 0)
            foo = foo.concat(" {");
        for (Object existingObj : this) {
            Zz01_CartesianProductOnSet existingOset = (Zz01_CartesianProductOnSet) existingObj; // cast
            foo = foo.concat(existingOset.toString());
        }
        if (this.size() > 0)
            foo = foo.concat(" }");
        return foo;
    }

    @Override
    public boolean equals(Object o) {
        Zz01_CartesianProductOnSet z = (Zz01_CartesianProductOnSet) o; // cast
        return super.equals(o) &&
                z.getResult().equals(this.getResult());
    }

    // extend - adds the specified item as a new state
    public void extend(Zz01_CartesianProductOnSet in) {
        this.add(in);
    }

    // cartesianProduct - adds states of the specified item as new states to the existing states
    public void cartesianProduct(Zz01_CartesianProductOnSet in) {

        Zz01_CartesianProductOnSet freshSet = new Zz01_CartesianProductOnSet("temporary");

        for (Object existingObj : this) {
            Zz01_CartesianProductOnSet existingOset = (Zz01_CartesianProductOnSet) existingObj; // cast
            for (Object newObj : in) {
                Zz01_CartesianProductOnSet newOset = (Zz01_CartesianProductOnSet) newObj; // cast

                // create a new one, extend with new, and add it to this
                Zz01_CartesianProductOnSet newSingle = new Zz01_CartesianProductOnSet("blah");
                newSingle.add(existingOset);
                newSingle.add(newOset);
                freshSet.add(newSingle);
            }
        }
        this.clear();
        this.addAll(freshSet);
    }
}