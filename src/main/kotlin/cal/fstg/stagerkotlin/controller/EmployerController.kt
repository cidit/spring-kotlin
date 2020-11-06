package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.EmployerRepository
import cal.fstg.stagerkotlin.model.Employer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employers")
class EmployerController(@Autowired private val employerRepository: EmployerRepository) {

    @GetMapping("/get/all")
    fun getAll(): List<Employer> = employerRepository.findAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = employerRepository.findById(id)

    @PostMapping("/save")
    fun save(@RequestBody employer: Employer) = employerRepository.save(employer)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = employerRepository.deleteById(id)

}