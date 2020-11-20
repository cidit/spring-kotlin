package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.ResumeRepository
import cal.fstg.stagerkotlin.model.Resume
import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ResumeService(@Autowired private val resumeRepository: ResumeRepository) {

    @ExperimentalCoroutinesApi
    fun getAll() = flux<Resume> { resumeRepository.findAll() }

    fun getOne(id: String) = mono { resumeRepository.findById(id) }

    fun save(resume: Resume) = mono { resumeRepository.save(resume) }

    fun delete(id: String) = resumeRepository.deleteById(id)
}