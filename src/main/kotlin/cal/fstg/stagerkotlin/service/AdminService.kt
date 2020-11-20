package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.AdminRepository
import cal.fstg.stagerkotlin.model.Admin
import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminService(@Autowired private val adminRepository: AdminRepository) {

    @ExperimentalCoroutinesApi
    fun getAll() = flux<Admin> { adminRepository.findAll() }

    fun getOne(id: String) = mono { adminRepository.findById(id) }

    fun save(admin: Admin) = mono { adminRepository.save(admin) }

    fun delete(id: String) = adminRepository.deleteById(id)
}