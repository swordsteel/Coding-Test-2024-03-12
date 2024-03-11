package test.coding.service.repository.impl

import java.util.UUID
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
import test.coding.service.etity.QuestionnaireEntity
import test.coding.service.repository.QuestionnaireRepository

/**
 * this class is only here to let uss fake things and pretend DB stuff...
 */
@Service
class QuestionnaireRepositoryImpl : QuestionnaireRepository {

    override suspend fun getQuestionnaire(): QuestionnaireEntity = QuestionnaireEntity(
        UUID.fromString("00000000-0000-0000-0000-000000000000"),
        "Geography Questions",
        mutableListOf(
            "What is the capital of Cuba?",
            "What is the capital of France?",
            "What is the capital of Poland?",
            "What is the capital of Germany?",
        ),
    )

    override suspend fun count(): Long {
        TODO("Not yet implemented")
    }

    override suspend fun delete(entity: QuestionnaireEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAll() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAll(entities: Iterable<QuestionnaireEntity>) {
        TODO("Not yet implemented")
    }

    override suspend fun <S : QuestionnaireEntity> deleteAll(entityStream: Flow<S>) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllById(ids: Iterable<UUID>) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteById(id: UUID) {
        TODO("Not yet implemented")
    }

    override suspend fun existsById(id: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun findAll(): Flow<QuestionnaireEntity> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Iterable<UUID>): Flow<QuestionnaireEntity> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Flow<UUID>): Flow<QuestionnaireEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun findById(id: UUID): QuestionnaireEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun <S : QuestionnaireEntity> save(entity: S): QuestionnaireEntity {
        TODO("Not yet implemented")
    }

    override fun <S : QuestionnaireEntity> saveAll(entities: Iterable<S>): Flow<S> {
        TODO("Not yet implemented")
    }

    override fun <S : QuestionnaireEntity> saveAll(entityStream: Flow<S>): Flow<S> {
        TODO("Not yet implemented")
    }
}
