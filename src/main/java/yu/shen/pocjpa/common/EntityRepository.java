package yu.shen.pocjpa.common;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created by sheyu on 7/16/2018.
 */
public interface EntityRepository<T> {
    List loadHistory(Class<T> tClass, Long entityId, Optional<LocalDateTime> lastChangeDateTime);
}
