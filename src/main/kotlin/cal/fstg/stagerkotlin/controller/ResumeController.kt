package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.model.Resume
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.service.DocumentService
import cal.fstg.stagerkotlin.service.ResumeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/resmumes")
class ResumeController(@Autowired private val resumeService: ResumeService) {

    @GetMapping("/get/all")
    fun getAll(): List<Resume> = resumeService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = resumeService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody resume: Resume) = resumeService.save(resume)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = resumeService.delete(id)
}