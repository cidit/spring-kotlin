package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.AdminRepository
import cal.fstg.stagerkotlin.model.Admin
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admins")
class AdminController(@Autowired private val adminRepository: AdminRepository) {

    @GetMapping("/get/all")
    fun getAll(): List<Admin> = adminRepository.findAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = adminRepository.findById(id)

    @PostMapping("/save")
    fun save(@RequestBody admin: Admin) = adminRepository.save(admin)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = adminRepository.deleteById(id)
}