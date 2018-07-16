package yu.shen.pocjpa.foo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created by sheyu on 7/16/2018.
 */
public interface FooService {
    List<Foo> findAll();

    Foo createFoo(Foo foo);

    Foo findById(Long id);

    void update(Foo foo);

    List<Foo> findHistoryById(Long id, Optional<LocalDateTime> from);
}
