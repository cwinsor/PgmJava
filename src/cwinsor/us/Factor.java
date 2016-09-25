import java.util.List;

/**
 * Created by Chris on 9/14/2016.
 */
public class Factor {

    RandomVariableList list; // a list of random variables
    private String name;

    // constructor
    public Factor(String name,
                  RandomVariableList list) {
        this.name = name;
        this.list = list;
    }

    // constructor
    public Factor(String name,
                  List<RandomVariable> arrayList) {
        this.name = name;
        this.list = new RandomVariableList(arrayList);
    }

    public RandomVariable getRv(String name) {
        return list.get(name);
    }

    public String toString() {
        String out = new String("-- Factor ").concat(name).concat(":\n");
        out = out.concat(list.toString());
        return out;
    }

}
