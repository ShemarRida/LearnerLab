import learnerlab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        // Given
        String name = "Shemar";
        Long id = Long.valueOf(324L);
        Person testPerson = new Person(id, name);
        String expected = "Shemar";
        String actual = testPerson.getName();
        //Long expected2 = 324L;
        //Long actual2 = testPerson.getId();

        Assert.assertEquals(expected,actual);
        //Assert.assertEquals(expected2, actual2);

    }
}
