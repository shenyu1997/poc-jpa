package yu.shen.pocjpa.common;

/**
 * Created by sheyu on 7/16/2018.
 */
public class NotFoundException extends ServiceException {
    private final static String MESSAGE = "entity type: %s, entity id: %s is not found";

    private String entityType;
    private Long entityId;

    public NotFoundException(String entityType, Long entityId) {
        super("ENTITY_NOT_FOUND", String.format(MESSAGE, entityType, entityId));
        this.entityType = entityType;
        this.entityId = entityId;
    }
}
