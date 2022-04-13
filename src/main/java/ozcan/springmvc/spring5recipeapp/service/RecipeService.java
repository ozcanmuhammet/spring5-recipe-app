package ozcan.springmvc.spring5recipeapp.service;

import ozcan.springmvc.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    public Set<Recipe> getRecipes();
}
