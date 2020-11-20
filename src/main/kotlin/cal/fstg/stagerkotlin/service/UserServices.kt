package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.UserRepository
import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    @ExperimentalCoroutinesApi
    fun getAll() = flux<User> { userRepository.findAll() }

    fun getOne(id: String) = mono { userRepository.findById(id) }

    fun save(user: User) = mono { userRepository.save(user) }

    fun delete(id: String) = userRepository.deleteById(id)
}