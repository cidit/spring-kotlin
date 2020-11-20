package cal.fstg.java.model;

//import javax.persistence.Entity;

//@Entity
public class Employer extends User {

    private String company;

    public Employer() {
        role = "employer";
    }

    public Employer(long id, String firstName, String lastName, String username, String email, String password, String phone, String company) {
        super(id, firstName, lastName, username, email, password, phone, "employer");
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
