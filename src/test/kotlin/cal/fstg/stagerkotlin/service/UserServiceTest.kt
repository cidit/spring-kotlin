package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.reactor.mono
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import reactor.test.StepVerifier

@ExtendWith(MockitoExtension::class)
class UserServiceTest {

    @Autowired
    var userService: UserService? = null;

    @Test
    fun `test if embeded mongo database works`() {
        val id = userService?.save(User(
                firstName = "bob",
                lastName = "ross",
                email = "bob@ross.com",
                password = " qwertyuiop",
                username = "bob_ross",
                phone = "1234567890",
                role = "painter",
        ))?.block()?.id

        print(id)

        val userMono = id?.let { userService?.getOne(it) }

        //StepVerifier.create<User> { userMono }.assertNext { assertEquals(it.firstName, "bob") }.expectComplete().verify()
    }
}