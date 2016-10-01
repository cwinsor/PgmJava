package us.cwinsor;

/**
 * Created by Chris on 9/15/2016.
 */
public class State implements Comparable {

    private String name;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        String out = new String("state: ").concat(name);
//        return out;
        return getName();
    }

    public int compareTo(Object o) {
        State that = (State) o;
        return this.toString().compareTo(that.toString());
    }
}
