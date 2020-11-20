package cal.fstg.stagerkotlin.dao

import cal.fstg.stagerkotlin.model.Admin
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.model.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface UserRepository : ReactiveMongoRepository<User, String>

interface StudentRepository : ReactiveMongoRepository<Student, String>

interface EmployerRepository : ReactiveMongoRepository<Employer, String>

interface AdminRepository : ReactiveMongoRepository<Admin, String>