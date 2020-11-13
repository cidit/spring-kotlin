package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.model.Document
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.service.DocumentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/documents")
class DocumentController(@Autowired private val documentService: DocumentService) {

    @GetMapping("/get/all")
    fun getAll(): List<Document> = documentService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = documentService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody document: Document) = documentService.save(document)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = documentService.delete(id)
}