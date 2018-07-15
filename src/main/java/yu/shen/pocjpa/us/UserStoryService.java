package yu.shen.pocjpa.us;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserStoryService {
    @Autowired
    private UserStoryRepository userStoryRepository;

    public List<UserStory> findAll() {

        return userStoryRepository.findAll();
    }

}
