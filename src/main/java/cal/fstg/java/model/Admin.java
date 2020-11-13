package cal.fstg.java.model;

import javax.persistence.Entity;

@Entity
public class Admin extends User {
    public Admin() {
        role = "admin";
    }

    public Admin(long id, String firstName, String lastName, String username, String email, String password, String phone) {
        super(id, firstName, lastName, username, email, password, phone, "admin");
    }
}
