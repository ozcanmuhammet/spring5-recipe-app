package ozcan.springmvc.spring5recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springmvc.spring5recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
