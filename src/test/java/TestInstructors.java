import learnerlab.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
        Instructors instructors = Instructors.getInstance();
        Assert.assertEquals("John",instructors.getInstance().findById(1L).getName());
        Assert.assertEquals("Ash",instructors.getInstance().findById(2L).getName());
        Assert.assertEquals("Thomas",instructors.getInstance().findById(3L).getName());
        Assert.assertEquals("Perry",instructors.getInstance().findById(4L).getName());

    }
}
