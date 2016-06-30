package lesson09;

/**
 * Created by lapte on 21.05.2016.
 */
public class Student1 extends Human{
    private String faculty;
    private int course;
    private String group;

    public Student1(int id, String lastName, String firstName,
                    String otchestvo, int dayOfBirth, int monthOfBirth,
                    int yearOfBirth, String address, String telephone,
                    String faculty, int course, String group) {
        super(id, lastName, firstName, otchestvo, dayOfBirth,
                monthOfBirth, yearOfBirth, address, telephone);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student1{" + super.toString() +
                ", faculty= " + faculty +
                ", course= " + course +
                ", group= " + group + "}";
    }
}
