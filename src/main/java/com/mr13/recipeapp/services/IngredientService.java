package com.mr13.recipeapp.services;

import com.mr13.recipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredient);

}
