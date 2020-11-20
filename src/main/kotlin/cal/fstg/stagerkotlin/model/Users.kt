package cal.fstg.stagerkotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

//@Document
open class User(
        @Id open var id: String = "",
        open var firstName: String = "",
        open var lastName: String = "",
        open var username: String = "",
        open var email: String = "",
        open var password: String = "",
        open var phone: String = "",
        open var role: String,
)

@Document
data class Student(
        override var id: String = "",
        override var firstName: String = "",
        override var lastName: String = "",
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        var registration: String = "",
//        @OneToMany var resumes: Set<Resume> = setOf()
) : User(role = "student")

@Document
data class Employer(
        override var id: String = "",
        override var firstName: String = "",
        override var lastName: String = "",
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        var company: String = "",
) : User(role = "employer")

@Document
data class Admin(
        override var id: String = "",
        override var firstName: String = "",
        override var lastName: String = "",
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
) : User(role = "admin")