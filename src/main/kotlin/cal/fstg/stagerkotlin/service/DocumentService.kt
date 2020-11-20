package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.DocumentRepository
import cal.fstg.stagerkotlin.model.Document
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DocumentService(@Autowired private val documentRepository: DocumentRepository) {

    @ExperimentalCoroutinesApi
    fun getAll() = flux<Document> { documentRepository.findAll() }

    fun getOne(id: String) = mono { documentRepository.findById(id) }

    fun save(document: Document) = mono { documentRepository.save(document) }

    fun delete(id: String) = documentRepository.deleteById(id)
}