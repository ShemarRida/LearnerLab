import learnerlab.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor();
        Double in = 20.0;
        Learner learner = new Student();
        Double expected = 20.0;
        instructor.teach(learner, in);
        Double actual = learner.getTotalStudyTime();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor();
        Double in = 9.0;
        Learner[] learners = new Student[]{new Student(), new Student(), new Student()};
        Double expected = 3.0;
        instructor.lecture(learners, in);
        Double actual = learners[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }
}

