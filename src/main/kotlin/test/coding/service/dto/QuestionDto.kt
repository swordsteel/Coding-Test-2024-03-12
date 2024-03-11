package test.coding.service.dto

import test.coding.service.etity.QuestionnaireEntity

object QuestionDto {

    data class QuestionResponse(
        val questionnaireTitle: String,
        val questionsText: List<String>,
    )

    fun mapToQuestionResponse(
        questionnaire: QuestionnaireEntity,
    ): QuestionResponse = QuestionResponse(questionnaire.title, questionnaire.questions)
}
