package ozcan.springmvc.spring5recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springmvc.spring5recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
