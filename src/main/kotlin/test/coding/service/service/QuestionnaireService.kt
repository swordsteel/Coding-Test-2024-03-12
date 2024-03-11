package test.coding.service.service

import org.springframework.stereotype.Service
import test.coding.service.etity.QuestionnaireEntity
import test.coding.service.repository.QuestionnaireRepository

@Service
class QuestionnaireService(
    private val questionnaireRepository: QuestionnaireRepository,
) {

    suspend fun getQuestion(): QuestionnaireEntity = questionnaireRepository.getQuestionnaire()
}
