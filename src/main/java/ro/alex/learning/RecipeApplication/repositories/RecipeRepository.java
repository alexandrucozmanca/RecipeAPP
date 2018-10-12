package ro.alex.learning.RecipeApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.alex.learning.RecipeApplication.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
