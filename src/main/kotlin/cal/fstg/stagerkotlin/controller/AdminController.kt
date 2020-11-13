package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.AdminRepository
import cal.fstg.stagerkotlin.model.Admin
import cal.fstg.stagerkotlin.service.AdminService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admins")
class AdminController(@Autowired private val adminService: AdminService) {

    @GetMapping("/get/all")
    fun getAll(): List<Admin> = adminService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = adminService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody admin: Admin) = adminService.save(admin)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = adminService.delete(id)
}