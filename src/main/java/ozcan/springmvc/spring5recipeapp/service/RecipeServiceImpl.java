package ozcan.springmvc.spring5recipeapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ozcan.springmvc.spring5recipeapp.domain.Recipe;
import ozcan.springmvc.spring5recipeapp.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("Test");
        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }
}
