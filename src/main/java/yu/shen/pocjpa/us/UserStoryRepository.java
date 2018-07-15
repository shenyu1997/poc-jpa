package yu.shen.pocjpa.us;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserStoryRepository extends CrudRepository<UserStory, Long> {
    List<UserStory> findAll();
}
