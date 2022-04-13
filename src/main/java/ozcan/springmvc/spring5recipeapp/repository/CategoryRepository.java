package ozcan.springmvc.spring5recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springmvc.spring5recipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
