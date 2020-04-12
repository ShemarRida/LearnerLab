import learnerlab.People;
import learnerlab.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        people.add(new Person(1L,"Shemar"));
        people.add(new Person(2L,"Mike"));
        people.add(new Person(3L,"Marcus"));
        Assert.assertEquals(Integer.valueOf(3),people.count());

    }
    @Test
    public void testRemove(){
        ArrayList<Person> q = new ArrayList<>();
        q.add(new Person(1L, "Shemar"));
        q.add(new Person(2L, "Mike"));
        People people = new People();
        Person pop = new Person(3L, "Marcus");
        people.add(pop);
        people.remove(pop);
        Assert.assertFalse(people.contains(pop));
    }
    @Test
    public void testFindById(){
        ArrayList<Person> q = new ArrayList<>();
        q.add(new Person(1L, "Shemar"));
        q.add(new Person(2L, "Mike"));
        People people = new People();
        Person pop = new Person(3L, "Marcus");
        people.add(pop);
        Person finder = people.findById(3L);
        Assert.assertEquals(pop, finder);

    }
}
