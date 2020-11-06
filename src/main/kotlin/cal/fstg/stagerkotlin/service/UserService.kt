package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.UserRepository
import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    fun getAll() = Flux.fromStream { userRepository.findAll().stream() }

    fun getOne(id: Long) = mono { userRepository.findById(id) }

    fun save(user: User) = mono { userRepository.save(user) }

    fun delete(id: Long) = userRepository.deleteById(id)
}