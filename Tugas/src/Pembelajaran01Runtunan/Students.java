package Pembelajaran01Runtunan;


public class Students {

    // Atribut / Class Variable
    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    // Method untuk mengisi dan mengembalikan nilai
    public Integer getNPM(Integer value) {
        this.NPM = value;
        return NPM;
    }

    public String getFullname(String value) {
        this.Fullname = value;
        return Fullname;
    }

    public String getClassName(String value) {
        this.ClassName = value;
        return ClassName;
    }

    public Integer getSemester(Integer value) {
        this.Semester = value;
        return Semester;
    }

    public Float getGPA(Float value) {
        this.GPA = value;
        return GPA;
    }
}

