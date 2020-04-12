import learnerlab.Learner;
import learnerlab.Person;
import learnerlab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student test = new Student();
        Assert.assertTrue(test instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student test = new Student();
        Assert.assertTrue(test instanceof Person);
    }
    @Test
    public void testLearn(){
        Student test = new Student();
        Double in = 20.0;
        Double expected = 20.0;
        test.learn(in);
        Double actual = test.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }


}
