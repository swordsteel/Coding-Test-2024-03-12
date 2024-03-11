package test.coding.service.etity

import java.util.UUID
import org.springframework.data.relational.core.mapping.Table

@Table("questionnaires")
data class QuestionnaireEntity(
    val id: UUID,
    val title: String,
    val questions: List<String>,
)
