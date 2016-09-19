import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Chris on 9/14/2016.
 * A list of RandomVariable
 */

public class RandomVariableList extends ArrayList<RandomVariable> {

    // constructor given a list of RandomVariable
    RandomVariableList (List<RandomVariable> arrayList) {
        this.addAll(arrayList);
    }

    public RandomVariable named(String in) {
        return null;
    /*
        // see if there is more than one...
        if (this.stream().count())>1){
            error(" there are more than one of these");
        }
        return this.stream().get(in);
  */
    }
}
