package cal.fstg.java.model;

import javax.persistence.Entity;

@Entity
public class Employer extends User {

    private String company;

    public Employer() {
    }

    public Employer(long id, String username, String email, String password, String phone, String role, String company) {
        super(id, username, email, password, phone, role);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        if (!super.equals(o)) return false;

        Employer employer = (Employer) o;

        return company != null ? company.equals(employer.company) : employer.company == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }
}
