package ro.alex.learning.RecipeApplication.services;

import ro.alex.learning.RecipeApplication.command.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
