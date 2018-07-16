package yu.shen.pocjpa.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yu.shen.pocjpa.common.NotFoundException;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created by sheyu on 7/16/2018.
 */
@Service
@Transactional
public class FooServiceImpl implements FooService {

    @Autowired
    private FooRepository fooRepository;

    @Override
    public List<Foo> findAll() {
        return fooRepository.findAll();
    }

    @Override
    public Foo createFoo(Foo foo) {
        return fooRepository.save(foo);
    }

    @Override
    public Foo findById(Long id) {
        return fooRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(Foo.class.getCanonicalName(), id));
    }

    @Override
    public void update(Foo foo) {
        fooRepository.save(foo);
    }

    @Override
    public List<Foo> findHistoryById(Long id, Optional<LocalDateTime> from) {
        return fooRepository.loadHistory(Foo.class, id, from);
    }
}
