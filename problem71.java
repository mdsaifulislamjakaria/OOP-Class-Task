// problem 7(a);
import java.util.*;

class Student {
    private int id; 
    private String name,program; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}

class Instructor {
    private int id; 
    private String name,department,title; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Course {
    private int id; 
    private String syllabus,title,credits,prerequisite; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
}

class CourseOffering {
    private int studentId,instructorId,courseId,sectionNo,roomId;
    private String time,semester,year; 

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(int sectionNo) {
        this.sectionNo = sectionNo;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}

public class problem71 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            Student student1 = new Student();
            student1.setId(1001);
            student1.setName("Abdullah");
            student1.setProgram("Software Engineering");
            
            System.out.println("Student Name : " + student1.getName());
            
            Instructor instructor1 = new Instructor();
            instructor1.setId(2001);
            instructor1.setName("Dr. Rahman");
            instructor1.setDepartment("Math");
            instructor1.setTitle("Professor");
            
            System.out.println("Instructor Name: " + instructor1.getName());
            
            Course course1 = new Course();
            course1.setId(3001);
            course1.setTitle("Object Oriented Programming");
            course1.setCredits("3");
            
            System.out.println("Course Name : " + course1.getTitle());
            
            CourseOffering offering1 = new CourseOffering();
            offering1.setStudentId(student1.getId());
            offering1.setInstructorId(instructor1.getId());
            offering1.setCourseId(course1.getId());
            offering1.setYear("2nd");
            offering1.setSemester("1");
            
            System.out.println("Course Offering - Semester : " + offering1.getSemester() + ", Year : " + offering1.getYear());
        }
    }
}
