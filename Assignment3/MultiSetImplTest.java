
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiSetImplTest  {
    static Multiset<Integer> set = HashMultiset.create();
    static Multiset<Integer> set_2 = HashMultiset.create();
    MultiSetTestImpl multiSetTest = new MultiSetTestImpl();
    @Test
    void e_add() {
        //Adding value to two sets
        multiSetTest.add(set, 1);
        multiSetTest.add(set, 2);
        multiSetTest.add(set, 1);
        multiSetTest.add(set_2, 1);
        multiSetTest.add(set_2, 2);
        multiSetTest.add(set_2, 1);
        Assertions.assertEquals(set_2, set);
    }

    @Test
    void e_member(){
        Assertions.assertTrue(multiSetTest.member(set, 1));
    }

    @Test
    void e_count() {
        Assertions.assertEquals(multiSetTest.count(set, 1), 2);
    }

    @Test
    void e_union() {
        Assertions.assertEquals(multiSetTest.union(set, set_2), Multisets.union(set, set_2));
    }

    @Test
    void e_sum() {
        Assertions.assertEquals(multiSetTest.sum(set, set_2), Multisets.sum(set, set_2));
    }

    @Test
    void e_empty() {
        Assertions.assertEquals(multiSetTest.empty(set).size(), 0);
    }

    @Test
    void e_size() {
        Assertions.assertEquals(multiSetTest.size(set), 3);
    }

    @Test
    void e_toArray() {
        Assertions.assertEquals(multiSetTest.toArray(set).length, 3);
    }

    @Test
    void e_make() {
        Assertions.assertEquals(multiSetTest.make(new Integer[] {1,2,1}).size(), 3);
    }

    @Test
    void testQuestion1() {
        Multiset<Integer> test = HashMultiset.create();
        Multiset<Integer> test_2 = HashMultiset.create();
        Assertions.assertNotSame(multiSetTest.empty(set), multiSetTest.union(test, test_2));
    }
    @Test
    void testQuestion2() {
        Assertions.assertTrue(multiSetTest.sum(set,set_2).size() > multiSetTest.union(set, set_2).size());
    }

    @Test
    void testQuestion3() {
        Assertions.assertEquals(multiSetTest.union(set,set_2), Multisets.union(set, set_2));
    }

    @Test
    void testQuestion4() {
        Assertions.assertEquals(multiSetTest.union(set,set_2).size(), Multisets.union(set, set_2).size());
    }

    @Test
    void testQuestion4A() {
        Assertions.assertFalse(multiSetTest.sum(set,set_2).size() < Multisets.union(set, set_2).size());
    }


    @Test
    void testQuestion5() {
        Multiset<Integer> set = HashMultiset.create();
        multiSetTest.add(set, 5);
        multiSetTest.add(set,6);
        multiSetTest.add(set,6);
        Assertions.assertEquals(multiSetTest.count(set, 6), 2);
    }
}
