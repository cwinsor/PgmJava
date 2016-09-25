/**
 * Created by Chris on 9/15/2016.
 */
public class RandomVariableState {

    private String name;

    public RandomVariableState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String out = new String("state: ").concat(name);
        return out;
    }
}
