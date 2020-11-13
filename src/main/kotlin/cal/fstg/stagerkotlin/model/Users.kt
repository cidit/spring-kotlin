package cal.fstg.stagerkotlin.model

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
open class User(
        open var firstName: String = "",
        open var lastName: String = "",
        open var username: String = "",
        open var email: String = "",
        open var password: String = "",
        open var phone: String = "",
        open var role: String,
        @Id @GeneratedValue
        open var id: Long = 0)

@Entity
data class Student(
        override var firstName: String = "",
        override var lastName: String = "",
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        override var id: Long = 0,
        var registration: String = "",
        @OneToMany var resumes: Set<Resume> = setOf()
) : User(role = "student")

@Entity
data class Employer(
        override var firstName: String = "",
        override var lastName: String = "",
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        override var id: Long = 0,
        var company: String = "",
) : User(role = "employer")

@Entity
data class Admin(
        override var firstName: String = "",
        override var lastName: String = "",
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        override var id: Long = 0,
) : User(role = "admin")