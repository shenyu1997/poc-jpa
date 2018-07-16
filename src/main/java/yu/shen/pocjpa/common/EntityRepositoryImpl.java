package yu.shen.pocjpa.common;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created by sheyu on 7/16/2018.
 */

public class EntityRepositoryImpl<T> implements EntityRepository<T> {
    @Autowired
    private EntityManager entityManager;


    @Override
    public List<T> loadHistory(Class<T> tClass, Long entityId, Optional<LocalDateTime> lastChangeDateTime) {
        AuditReader auditReader = AuditReaderFactory.get(entityManager);
        AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(tClass, true, false);

        lastChangeDateTime.ifPresent(from-> {
            query.add(AuditEntity.property("modifiedDate").ge(Timestamp.valueOf(from).getTime()));
        });

        query.add(AuditEntity.property("id").eq(entityId));
        query.addOrder(AuditEntity.property("modifiedDate").asc());
        return query.getResultList();
    }
}
