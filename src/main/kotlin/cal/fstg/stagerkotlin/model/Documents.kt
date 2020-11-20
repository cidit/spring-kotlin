package cal.fstg.stagerkotlin.model

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@Entity
open class Document(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: String = "",
        var name: String = "",
        var status: Status = Status.UNREVIEWED,
//        @Lob @Column(columnDefinition = "BLOB") open var data: ByteArray? = null,
) {
    enum class Status { DENIED, UNREVIEWED, APPROVED }
}

@Entity
open class Resume(
        id: String = "",
        name: String = "",
        status: Status = Status.UNREVIEWED,
//        override var data: ByteArray? = null,
//        @ManyToOne var student: Student
) : Document(
        id, name, status
)
