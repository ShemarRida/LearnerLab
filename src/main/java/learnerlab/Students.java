package learnerlab;

public final class Students extends People {
    final static private Students INSTANCE = new Students();

    private Students(){
        add(new Student(1L, "Shemar"));
        add(new Student(2L, "Mike"));
        add(new Student(3L, "Marcus"));
        add(new Student(4L, "Robert"));
        add(new Student(5L, "Jaiden"));

    }
    public static Students getInstance(){
        return INSTANCE;
    }
}
