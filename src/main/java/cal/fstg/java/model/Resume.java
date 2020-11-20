package cal.fstg.java.model;

//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;

//@Entity
public class Resume extends Document {

//    @ManyToOne
    private Student student;

    public Resume() {
    }

    public Resume(long id, String name, Status status, byte[] data, Student student) {
        super(id, name, status, data);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resume)) return false;
        if (!super.equals(o)) return false;

        Resume resume = (Resume) o;

        return student != null ? student.equals(resume.student) : resume.student == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (student != null ? student.hashCode() : 0);
        return result;
    }
}
