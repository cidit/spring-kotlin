package cal.fstg.stagerkotlin.model

import org.springframework.data.annotation.Id


open class Document(
        var id: String = "",
        var name: String = "",
        var status: Status = Status.UNREVIEWED,
//        @Lob @Column(columnDefinition = "BLOB") open var data: ByteArray? = null,
) {
    enum class Status { DENIED, UNREVIEWED, APPROVED }
}


open class Resume(
        id: String = "",
        name: String = "",
        status: Status = Status.UNREVIEWED,
//        override var data: ByteArray? = null,
//        @ManyToOne var student: Student
) : Document(
        id, name, status
)
