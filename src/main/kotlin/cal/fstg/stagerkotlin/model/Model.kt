package cal.fstg.stagerkotlin.model

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
open class User(
        open var username: String = "",
        open var email: String = "",
        open var password: String = "",
        open var phone: String = "",
        open var role: String,
        @Id @GeneratedValue
        open var id: Long = 0)

@Entity
data class Student(
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        var registration: String = "",
        override var id: Long = 0
) : User(role = "student")

@Entity
data class Employer(
        override var username: String = "",
        override var email: String = "",
        override var password: String = "",
        override var phone: String = "",
        var company: String = "",
        override var id: Long = 0
) : User(role = "employer")