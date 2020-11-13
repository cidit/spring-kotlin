package cal.fstg.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Arrays;

@Entity
public class Document {

    @Id
    protected long id;

    protected String name;

    protected Status status;

    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] data;

    public enum Status {
        DENIED, UNREVIEWED, APPROVED
    }

    public Document() {
    }

    public Document(long id, String name, Status status, byte[] data) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (id != document.id) return false;
        if (name != null ? !name.equals(document.name) : document.name != null) return false;
        if (status != document.status) return false;
        return Arrays.equals(data, document.data);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}
