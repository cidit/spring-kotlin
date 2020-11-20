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
    fun getAll() = adminService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: String) = adminService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody admin: Admin) = adminService.save(admin)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: String) = adminService.delete(id)
}