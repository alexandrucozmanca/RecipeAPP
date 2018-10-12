package ro.alex.learning.RecipeApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.alex.learning.RecipeApplication.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
