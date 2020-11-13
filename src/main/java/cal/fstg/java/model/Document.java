package cal.fstg.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {

    @Id
    private long id;

    private String name;

    private Status status;

    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] data;

    public enum Status {
        DENIED, UNREVIEWED, APPROVED
    }
}
