package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.DocumentRepository
import cal.fstg.stagerkotlin.model.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DocumentService(@Autowired private val documentRepository: DocumentRepository) {

    fun getAll() = documentRepository.findAll()

    fun getOne(id: Long) = documentRepository.findById(id)

    fun save(document: Document) = documentRepository.save(document)

    fun delete(id: Long) = documentRepository.deleteById(id)
}