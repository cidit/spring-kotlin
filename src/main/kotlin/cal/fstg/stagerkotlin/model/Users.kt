package cal.fstg.stagerkotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

//@Document
open class User(
        var id: String = "",
        var firstName: String = "",
        var lastName: String = "",
        var username: String = "",
        var email: String = "",
        var password: String = "",
        var phone: String = "",
        var role: String,
)

@Document
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

@Document
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

@Document
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
