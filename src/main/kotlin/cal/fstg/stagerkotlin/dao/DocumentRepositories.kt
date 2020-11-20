package cal.fstg.stagerkotlin.dao

import cal.fstg.stagerkotlin.model.Document
import cal.fstg.stagerkotlin.model.Resume
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface DocumentRepository : JpaRepository<Document, String>

interface ResumeRepository : JpaRepository<Resume, String>