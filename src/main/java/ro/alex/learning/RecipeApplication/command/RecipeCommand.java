package ro.alex.learning.RecipeApplication.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.omg.CORBA.INTERNAL;
import org.springframework.context.annotation.Primary;
import ro.alex.learning.RecipeApplication.domain.Category;
import ro.alex.learning.RecipeApplication.domain.Difficulty;
import ro.alex.learning.RecipeApplication.domain.Ingredient;
import ro.alex.learning.RecipeApplication.domain.Notes;

import java.io.PipedReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand implements Comparable<RecipeCommand>{
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
    private Set<IngredientCommand> ingredients = new TreeSet<>();
    private Byte[] image;



    @Override
    public int compareTo(RecipeCommand other) {
        if(other == null || other.getId() == null)
            return 1;

        if (this == null || this.getId() == null)
            return -1;

        return Long.compare(this.getId(), other.getId());
    }
}
