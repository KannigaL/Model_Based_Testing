import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

import java.util.*;

public class MultiSetTestImpl implements MultiSetInterface {

    @Override
    public boolean member(Multiset m, Integer value) {
        return m.contains(value)? true : false;
    }

    @Override
    public void add(Multiset m, Integer value) {
        m.add(value);
    }

    @Override
    public Integer count(Multiset m, Integer value) {
        return m.count(value);
    }

    @Override
    public Multiset union(Multiset m1, Multiset m2) {
        return Multisets.union(m1, m2);
    }

    @Override
    public Multiset sum(Multiset m1, Multiset m2) {
        return Multisets.sum(m1, m2);
    }

    @Override
    public Multiset empty(Multiset set) {
        //empty set
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        return set;
    }

    @Override
    public Integer size(Multiset m) {
        return m.size();
    }

    @Override
    public Integer[] toArray(Multiset m) {
        return (Integer[])m.toArray();
    }

    @Override
    public Multiset make(Integer[] m) {
        Multiset<Integer> arrayToMultiSet = HashMultiset.create();
        Arrays.stream(m).forEach(a -> arrayToMultiSet.add(a));
        return arrayToMultiSet;
    }
}
