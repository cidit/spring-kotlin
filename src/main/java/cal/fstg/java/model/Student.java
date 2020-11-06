package cal.fstg.java.model;

import javax.persistence.Entity;

@Entity
public class Student extends User {

    private String registration;

    public Student() {
    }

    public Student(long id, String username, String email, String password, String phone, String role, String registration) {
        super(id, username, email, password, phone, role);
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return registration != null ? registration.equals(student.registration) : student.registration == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (registration != null ? registration.hashCode() : 0);
        return result;
    }
}
