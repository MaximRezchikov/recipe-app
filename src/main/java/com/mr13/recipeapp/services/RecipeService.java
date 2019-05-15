package com.mr13.recipeapp.services;

import com.mr13.recipeapp.commands.RecipeCommand;
import com.mr13.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {


    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
