package cal.fstg.stagerkotlin.model

import com.sun.xml.bind.v2.TODO
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
open class Document(
        open var name: String = "",
        open var status: Status = Status.UNREVIEWED,
        @Lob @Column(columnDefinition = "BLOB") open var data: ByteArray? = null,
        @Id open var id: Long = 0L
) {
    enum class Status { DENIED, UNREVIEWED, APPROVED }
}

@Entity
data class Resume(
        override var name: String = "",
        override var status: Status = Status.UNREVIEWED,
        override var data: ByteArray? = null,
        override var id: Long = 0L,
        @ManyToOne var student: Student
) : Document()

//@Entity
//data class Contract(
//        var todo: TODO // TODO: 2020-11-13
//) : Document()