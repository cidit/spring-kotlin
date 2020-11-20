package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.ResumeRepository
import cal.fstg.stagerkotlin.model.Resume
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ResumeService(@Autowired private val resumeRepository: ResumeRepository) {

    fun getAll() = resumeRepository.findAll()

    fun getOne(id: String) = resumeRepository.findById(id)

    fun save(resume: Resume) = resumeRepository.save(resume)

    fun delete(id: String) = resumeRepository.deleteById(id)
}