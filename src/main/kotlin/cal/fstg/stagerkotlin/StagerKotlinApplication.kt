package cal.fstg.stagerkotlin

import cal.fstg.stagerkotlin.service.PopulateDatabaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class StagerKotlinApplication(
        @Autowired private val populateDatabaseService: PopulateDatabaseService
) {
    @Bean
    fun commandLineRunner() = CommandLineRunner { populateDatabaseService.insert() }
}


fun main(args: Array<String>) {
    runApplication<StagerKotlinApplication>(*args)
}
