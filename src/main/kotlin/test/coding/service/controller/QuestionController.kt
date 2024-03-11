package test.coding.service.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import test.coding.service.dto.QuestionDto.QuestionResponse
import test.coding.service.dto.QuestionDto.mapToQuestionResponse
import test.coding.service.service.QuestionnaireService

@RestController
@RequestMapping("/api/questions")
class QuestionController(
    private val questionnaireService: QuestionnaireService
) {

    @GetMapping
    suspend fun getQuestion(): QuestionResponse = mapToQuestionResponse(questionnaireService.getQuestion())
}
