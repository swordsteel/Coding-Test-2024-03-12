package test.coding.service.controller

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.web.reactive.server.WebTestClient

@ExtendWith
@SpringBootTest(webEnvironment = RANDOM_PORT)
class QuestionControllerIntegrationTest {

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun `get questions`() {
        // when
        val actualResponse = webTestClient.get()
            .uri("/api/questions")
            .accept(APPLICATION_JSON)
            .exchange()

        // then
        actualResponse
            .expectStatus().isOk
            .expectBody()
            .jsonPath("$.questionnaireTitle").isEqualTo("Geography Questions")
            .jsonPath("$.questionsText[0]").isEqualTo("What is the capital of Cuba?")
            .jsonPath("$.questionsText[1]").isEqualTo("What is the capital of France?")
            .jsonPath("$.questionsText[2]").isEqualTo("What is the capital of Poland?")
            .jsonPath("$.questionsText[3]").isEqualTo("What is the capital of Germany?")
    }
}
