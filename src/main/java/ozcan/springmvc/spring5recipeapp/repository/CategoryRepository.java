package ozcan.springmvc.spring5recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springmvc.spring5recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
