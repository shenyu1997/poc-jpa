package yu.shen.pocjpa.us;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStory {
    public  enum Status {
        DRAFT, PLANED, STARTED, HUNGUPED, FINISHED, CANCELED;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title, description;
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserStory{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
