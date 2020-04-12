package learnerlab;

public final class Instructors extends People {
    final static private Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(1L, "John"));
        add(new Instructor(2L, "Ash"));
        add(new Instructor(3L, "Thomas"));
        add(new Instructor(4L, "Perry"));
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }


}
