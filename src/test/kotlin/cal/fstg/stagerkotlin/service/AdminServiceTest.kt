package cal.fstg.stagerkotlin.service


import cal.fstg.stagerkotlin.dao.AdminRepository
import cal.fstg.stagerkotlin.model.Admin
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AdminServiceTest(@Mock
                       var adminRepository: AdminRepository? = null,
                       @InjectMocks
                       var adminService: AdminService? = null) {


    var admin1 = Admin(
            firstName = "John",
            lastName = "Doe",
            phone = "1234567890",
            password = "qwertyuiop",
            username = "_johndoe",
            email = "john@doe.com"
    )

    var admin2 = Admin(
            firstName = "Jane",
            lastName = "Doe",
            phone = "0987654321",
            password = "poiuytrewq",
            username = "_janedoe",
            email = "jane@doe.com"
    )

    @Test
    fun `test if AdminService getAll returns properly`() {
        // Arrange
        Mockito.`when`(adminRepository?.findAll()).then { listOf(admin1.copy(), admin2.copy()) }

        // Act
        val list = adminService?.getAll() as List<Admin>

        // Assert
        assertTrue(list[0] == admin1)
        assertTrue(list[1] == admin2)
    }
}