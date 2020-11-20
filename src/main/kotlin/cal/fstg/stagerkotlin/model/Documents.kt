package cal.fstg.stagerkotlin.model

import org.springframework.data.annotation.Id

@org.springframework.data.mongodb.core.mapping.Document
open class Document(
        @Id open var id: String = "",
        open var name: String = "",
        open var status: Status = Status.UNREVIEWED,
//        @Lob @Column(columnDefinition = "BLOB") open var data: ByteArray? = null,
) {
    enum class Status { DENIED, UNREVIEWED, APPROVED }
}

@org.springframework.data.mongodb.core.mapping.Document
data class Resume(
        override var id: String = "",
        override var name: String = "",
        override var status: Status = Status.UNREVIEWED,
//        override var data: ByteArray? = null,
//        @ManyToOne var student: Student
) : Document()
