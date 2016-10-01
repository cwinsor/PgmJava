package us.cwinsor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Chris on 9/14/2016.
 */
public class Factor {

    private String name;
    private HashMap<StateHash, Double> result;
    private Double total;

    // get the hash
    public HashMap<StateHash, Double> hashMap() {
        return this.result;
    }

    // constructor
    public Factor(String name) {
        this.name = name;
        this.result = new HashMap<StateHash, Double>();
    }

    // constructor
    public Factor(String name,
            List<Rv> rvList) {

        this.name = name;
        this.result = new HashMap<StateHash, Double>();

        List<StateHash> out = rvListToStateHashList(rvList);
        for (StateHash sh : out) {
            result.put(sh, 0.0);
        }
        total = 0.0;
    }

    // scope
    // this method returns the scope of the factor where the
    // scope is a list of random variables  upon which there is
    // some dependence.  Note that if a random variable is represented
    // with just one state then it is not considered a factor.  Also
    // note that a random variable may be represented by a subset of
    // its overall states - in this case it is a factor, but only on
    // the states listed.
    // The method returns:
    //   ?? a list of RvHashrandom variables(?) and their values (a RvHash)
    //   ?? a list of States <------
    
    // given a list of Rv - returns a list of StateHash
    public List<StateHash> rvListToStateHashList(List<Rv> rvList) {
        List<State> stateList = new ArrayList<State>();
        List<State> accum = new ArrayList<State>();
        List<StateHash> out = new ArrayList<StateHash>();
        recurseOn(rvList, stateList, accum, out);
        return out;
    }

    public void recurseOn(
            List<Rv> rvList,
            List<State> stateList,
            List<State> accum,
            List<StateHash> out) {

        //System.out.println();
        //System.out.format("    entering with rv list = %s\n", rvList);
        //System.out.format("                    accum = %s\n", accum);
        //System.out.format("                      out = %s\n", out);
        // pick the first random variable in the list
        // this recurse will focus on that RV
        Iterator it = rvList.iterator();

        if (it.hasNext()) {
            Rv rv = (Rv) it.next();
            // create a new source removing this random variable
            // new source will go into recurse
            List<Rv> localRvList = new ArrayList<Rv>(rvList);
            localRvList.remove(rv);

            // iterate through the states of this rv
            StateHash sh = rv.getStateHash();
            Iterator it2 = sh.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry pair2 = (Map.Entry) it2.next();
                String name2 = (String) pair2.getKey();
                State state2 = (State) pair2.getValue();

                List<State> localStateList = new ArrayList<State>(stateList);
                localStateList.remove(state2);

                List<State> newAccum = new ArrayList<State>(accum);
                newAccum.add(state2);

                //System.out.printf("about to recurse - my context is:\n");
                //System.out.printf("rv = %s\n", rv.getName());
                //System.out.printf("state = %s\n", name2);
                recurseOn(localRvList,
                        localStateList,
                        newAccum,
                        out);
            }
            // if this call is the leaf
        } else {
            StateHash sh = new StateHash();
            for (State s : accum) {
                sh.put(s.getName(), s);
            }
            out.add(sh);
        }
    }

//    public Rv getRv(String name) {
//        rvHash.put(name, name);
//        rvHash.get(name);
//
//        Map.Entry<String, Rv> rv = (Map.Entry) rvHash.get(name);
//
//        return rv.getValue();
//    }
//    public RvHash getRvList() {
//        return this.rvHash;
//    }
    public void takeSample(StateHash rvSS, Double reslt) {
        this.result.put(rvSS, reslt);
    }

    public void addResult(StateHash rvStateList, Double reslt) {
        this.result.put(rvStateList, reslt);
    }

    public Double getResult(StateHash rvStateList) {
        return result.get(rvStateList);
    }

    @Override
    public String toString() {
        String out = new String("-- Factor ").concat(name).concat(":\n");
        for (StateHash key : result.keySet()) {
           out = out.concat(key.toString()).concat(" ").concat(result.get(key).toString()).concat("\n");
        }
        return out;
    }

    public Factor product(Factor other) {
        return null;
    }

    public Factor marginalizeOut(Rv rv) {
        return null;
    }

    /* conditionOn is a method which reduces a factor to
    include only cases where the conditioned variable has the value
    specified.
   conditioningOn is a specific case of the more general reduceKeeping method.
    */
    public Factor conditionOn(State state) {
        return reduceKeeping(new ArrayList(Arrays.asList(state)));
            }
    /*
    given an include list of RandomVariableState
    want to return a new Factor which is a subset
    of this where RandomVariableStateSet has an include state.

    iterate through this Factor's result entries
    and if any of the includes are in the entry then
    then add the entry
     */
    public Factor reduceKeeping(List<State> includeStateList) {
        Factor newFactor = new Factor("unnamed");

        // the haystack
        Set set = this.result.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            StateHash haystackRvss = (StateHash) pair.getKey();
            Double haystackResult = (Double) pair.getValue();

            // the needle
            Iterator it2 = includeStateList.iterator();
            while (it2.hasNext()) {
                State rvs = (State) it2.next();
                if (haystackRvss.containsKey(rvs)) {
                    newFactor.addResult(haystackRvss, haystackResult);
                }
            }
        }
        return newFactor;
    }

}
