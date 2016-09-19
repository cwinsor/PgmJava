import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

    public RandomVariable rvNamed(String name) {
        return list.named(name);
    }

    public String toString() {
        String out = new String("-- Factor ");
        out = out.concat(name).concat(" --");

        for (RandomVariable v : list) {
            out = out.concat("\n");
            out = out.concat(v.toString());
        }

        out = out.concat("\n");
        return out;
    }

}
