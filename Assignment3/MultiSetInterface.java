package com.adventurebox.core.features;

import com.google.common.collect.Multiset;

public interface MultiSetInterface {

    public boolean member(Multiset m, Integer value);

    public void add(Multiset m, Integer value);

    public Integer count(Multiset m, Integer value);

    public Multiset union(Multiset m1, Multiset m2);

    public Multiset sum(Multiset m1, Multiset m2);

    public Multiset empty(Multiset m1);

    public Integer size(Multiset m);

    public Integer[] toArray(Multiset m);

    public Multiset make(Integer[] m);
}
