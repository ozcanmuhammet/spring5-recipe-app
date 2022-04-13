package ozcan.springmvc.spring5recipeapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ozcan.springmvc.spring5recipeapp.domain.Category;
import ozcan.springmvc.spring5recipeapp.domain.UnitOfMeasure;
import ozcan.springmvc.spring5recipeapp.repository.CategoryRepository;
import ozcan.springmvc.spring5recipeapp.repository.UnitOfMeasureRepository;
import ozcan.springmvc.spring5recipeapp.service.RecipeService;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }

}
