package cal.fstg.stagerkotlin.model

import javax.persistence.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
open class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: String = "",
        var firstName: String = "",
        var lastName: String = "",
        var username: String = "",
        var email: String = "",
        var password: String = "",
        var phone: String = "",
        var role: String,
)

@Entity
open class Student(
        id: String = "",
        firstName: String = "",
        lastName: String = "",
        username: String = "",
        email: String = "",
        password: String = "",
        phone: String = "",
        var registration: String = "",
//        @OneToMany var resumes: Set<Resume> = setOf()
) : User(
        id = id,
        firstName = firstName,
        lastName = lastName,
        username = username,
        email = email,
        password = password,
        phone = phone,
        role = "student",
)

@Entity
open class Employer(
        id: String = "",
        firstName: String = "",
        lastName: String = "",
        username: String = "",
        email: String = "",
        password: String = "",
        phone: String = "",
        var company: String = "",
) : User(
        id = id,
        firstName = firstName,
        lastName = lastName,
        username = username,
        email = email,
        password = password,
        phone = phone,
        role = "employer",
)

@Entity
open class Admin(
        id: String = "",
        firstName: String = "",
        lastName: String = "",
        username: String = "",
        email: String = "",
        password: String = "",
        phone: String = "",
) : User(
        id = id,
        firstName = firstName,
        lastName = lastName,
        username = username,
        email = email,
        password = password,
        phone = phone,
        role = "admin",
)
