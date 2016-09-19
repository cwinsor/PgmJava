import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Chris on 9/14/2016.
 * RandomVariable has a space and a state.
 * Space is the definition of the set of values the RandomVariable can take.
 * State is a subset of this - the values the random variable currently can take.
 * The space is identified upon construction (passed in as parameter) and immutable.
 * That state can be modified by calls to setter.
 */
public class RandomVariable {

    private RandomVariableStateSet space;
    //private RandomVariableStateSet state;
    private String name;

    // constructor
    public RandomVariable(String name,
                          RandomVariableStateSet space) {
        this.name = name;
        this.space = space;
    }

    // constructor
    public RandomVariable(String name,
                          List<RandomVariableState> arrayList) {
        this.name = name;
        this.space = new RandomVariableStateSet(arrayList);
    }

    // copy constructor
    public RandomVariable copy(String name) {
        RandomVariable out = new RandomVariable(name, this.space);
        out.name = name;
        return out;
    }

    public RandomVariableStateSet getSpace() {
        return this.space;
    }


    //    public void setState(RandomVariableStateSet s) {
    //        state = s;
    //    }

    //   public RandomVariableStateSet getSpace() {
    //        return space;
    //    }

    //  public RandomVariableStateSet getState() {
    //      return state;
    //  }

    public String toString() {
        String out = new String("---- Random Variable ");
        out = out.concat(name);
        //    out = out.concat(" state=");
        //    if (this.state != null) {
        //        out = out.concat(this.state.toString());
        //    } else {
        //        out = out.concat("null");
        //    }

        out = out.concat(" space=");
        if (this.space != null) {
            out = out.concat(this.space.toString());
        } else {
            out = out.concat("null");
        }
        return out;
    }
}
