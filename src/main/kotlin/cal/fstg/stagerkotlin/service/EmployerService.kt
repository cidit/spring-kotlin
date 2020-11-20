package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.EmployerRepository
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployerService(@Autowired private val employerRepository: EmployerRepository) {

    @ExperimentalCoroutinesApi
    fun getAll() = flux<Employer> { employerRepository.findAll() }

    fun getOne(id: String) = mono { employerRepository.findById(id) }

    fun save(employer: Employer) = mono { employerRepository.save(employer) }

    fun delete(id: String) = employerRepository.deleteById(id)
}