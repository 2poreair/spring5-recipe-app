package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import jdk.jpackage.internal.Log;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Log> {
}
