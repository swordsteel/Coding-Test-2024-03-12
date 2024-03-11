package test.coding.service.repository

import java.util.UUID
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository
import test.coding.service.etity.QuestionnaireEntity

@Repository
interface QuestionnaireRepository : CoroutineCrudRepository<QuestionnaireEntity, UUID> {

    /*
     * this method is supposed to have magical DB related thing...
     */
    suspend fun getQuestionnaire(): QuestionnaireEntity
}
