package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.EmployerRepository
import cal.fstg.stagerkotlin.dao.StudentRepository
import cal.fstg.stagerkotlin.dao.UserRepository
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PopulateDatabaseService(
        @Autowired private val userRepository: UserRepository,
        @Autowired private val studentRepository: StudentRepository,
        @Autowired private val employerRepository: EmployerRepository
) {
    fun insert() {
        print("""
            
            
populating!


""".trimIndent())
        userRepository.save(
                User(role = "none").apply {
                    username = "tata"
                    email = "tat@users.com"
                    password = "this_is_tata"
                    phone = "111-222-3333"
                }
        )

        studentRepository.save(
                Student().apply {
                    username = "toto"
                    email = "toto@students.com"
                    password = "this_is_toto"
                    phone = "222-333-4444"
                    registration = "TOTO12345"
                }
        )

        employerRepository.save(
                Employer().apply {
                    username = "titi"
                    email = "titi@employers.com"
                    password = "this_is_titi"
                    phone = "333-444-5555"
                    company = "TitiTime.inc"
                }
        )
    }
}