import learnerlab.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test(){
        Students students = Students.getInstance();
        Assert.assertEquals("Shemar",students.getInstance().findById(1L).getName());
        Assert.assertEquals("Mike",students.getInstance().findById(2L).getName());
        Assert.assertEquals("Marcus",students.getInstance().findById(3L).getName());
        Assert.assertEquals("Robert",students.getInstance().findById(4L).getName());
        Assert.assertEquals("Jaiden",students.getInstance().findById(5L).getName());



    }
}
