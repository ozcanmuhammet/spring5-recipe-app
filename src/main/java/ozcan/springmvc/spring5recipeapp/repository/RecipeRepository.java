package ozcan.springmvc.spring5recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springmvc.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
