package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.UserRepository
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    fun getAll() = userRepository.findAll()

    fun getOne(id: Long) = userRepository.findById(id)

    fun save(user: User) = userRepository.save(user)

    fun delete(id: Long) = userRepository.deleteById(id)
}