package ro.alex.learning.RecipeApplication.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception{
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception{
        String descriptionValue = "description";

        category.setDescription(descriptionValue);

        assertEquals(descriptionValue, category.getDescription());
    }

    @Test
    public void getRecipes() throws Exception{
        Set<Recipe> testRecipeSet = new HashSet<>();
        Recipe testRecipe = new Recipe();
        testRecipeSet.add(testRecipe);

        category.setRecipes(testRecipeSet);

        assertEquals(testRecipeSet, category.getRecipes());

    }
}