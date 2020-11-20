package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.EmployerRepository
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployerService(@Autowired private val employerRepository: EmployerRepository) {

    fun getAll() = employerRepository.findAll()

    fun getOne(id: String) = employerRepository.findById(id)

    fun save(employer: Employer) = employerRepository.save(employer)

    fun delete(id: String) = employerRepository.deleteById(id)
}