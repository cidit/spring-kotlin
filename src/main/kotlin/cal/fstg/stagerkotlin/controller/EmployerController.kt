package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.EmployerRepository
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.service.EmployerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employers")
class EmployerController(@Autowired private val employerService: EmployerService) {

    @GetMapping("/get/all")
    fun getAll(): List<Employer> = employerService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = employerService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody employer: Employer) = employerService.save(employer)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = employerService.delete(id)

}