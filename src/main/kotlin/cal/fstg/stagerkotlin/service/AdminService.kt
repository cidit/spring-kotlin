package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.AdminRepository
import cal.fstg.stagerkotlin.model.Admin
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminService(@Autowired private val adminRepository: AdminRepository) {

    fun getAll() = adminRepository.findAll()

    fun getOne(id: String) = adminRepository.findById(id)

    fun save(admin: Admin) = adminRepository.save(admin)

    fun delete(id: String) = adminRepository.deleteById(id)
}