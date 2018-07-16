package yu.shen.pocjpa.foo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yu.shen.pocjpa.common.EntityRepository;

import java.util.List;

/**
 * Created by sheyu on 7/16/2018.
 */
@Repository
public interface FooRepository extends CrudRepository<Foo, Long>, EntityRepository<Foo> {
    List<Foo> findAll();
}
