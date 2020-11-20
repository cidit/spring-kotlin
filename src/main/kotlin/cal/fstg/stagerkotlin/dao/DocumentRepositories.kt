package cal.fstg.stagerkotlin.dao

import cal.fstg.stagerkotlin.model.Document
import cal.fstg.stagerkotlin.model.Resume
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface DocumentRepository : ReactiveMongoRepository<Document, String>

interface ResumeRepository : ReactiveMongoRepository<Resume, String>