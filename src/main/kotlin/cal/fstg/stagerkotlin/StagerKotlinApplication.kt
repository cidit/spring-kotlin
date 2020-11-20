package cal.fstg.stagerkotlin

import cal.fstg.stagerkotlin.service.PopulateDatabaseService
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer

//import org.springframework.web.reactive.config.EnableWebFlux
//import org.springframework.web.reactive.config.WebFluxConfigurer

@SpringBootApplication
class StagerKotlinApplication(@Autowired private val populateDatabaseService: PopulateDatabaseService) {
    @Bean
    fun commandLineRunner() = CommandLineRunner { populateDatabaseService.insert() }
}

@Configuration
@EnableWebFlux
class WebFluxConfig : WebFluxConfigurer

@Configuration
@EnableReactiveMongoRepositories
class MongoReactiveConfig: AbstractReactiveMongoConfiguration() {

    @Bean
    fun mongoClient() = MongoClients.create()

    @Bean
    override fun getDatabaseName(): String = "spring-kotlin"
}

fun main(args: Array<String>) {
    runApplication<StagerKotlinApplication>(*args)
}
