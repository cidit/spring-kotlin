package cal.fstg.stagerkotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
open class User(var username: String,
                var email: String,
                var password: String,
                @Id @GeneratedValue var id: Long?);

@Entity
open class Student(username: String,
                   email: String,
                   password: String,
                   var registration: String,
                   var phone: String,
                   id: Long?
) : User(username = username,
        email = email,
        password = password,
        id = id)

@Entity
open class Employer(username: String,
                    email: String,
                    password: String,
                    var company: String,
                    var phone: String,
                    id: Long?
) : User(username = username,
        email = email,
        password = password,
        id = id)