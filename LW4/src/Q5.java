class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public Lecturer() {
        this.lecturerName = "Unknown";
        this.courseTeaching = "Unknown";
    }

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return this.lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return this.courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course() {
        this.courseName = "Unknown";
        this.courseCode = "Unknown";
        this.lecturer = new Lecturer();
    }

    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public Student() {
        this.studentName = "Unknown";
        this.degreeName = "Unknown";
        this.courseFollowing = "Unknown";
    }

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return this.degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return this.courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "Introduction to Java");

        Course course1 = new Course("Introduction to Java", "CS101", lecturer1);

        Student student1 = new Student("Alice Johnson", "Computer Science", "Introduction to Java");

        System.out.println("--- Course Details ---");
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Course Code: " + course1.getCourseCode());
        System.out.println("Lecturer Name: " + course1.getLecturer().getLecturerName());

        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Degree Name: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollowing());
    }
}
