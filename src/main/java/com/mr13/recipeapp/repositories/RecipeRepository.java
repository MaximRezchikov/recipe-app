package com.mr13.recipeapp.repositories;

import com.mr13.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
