package ro.alex.learning.RecipeApplication.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ro.alex.learning.RecipeApplication.command.UnitOfMeasureCommand;
import ro.alex.learning.RecipeApplication.domain.UnitOfMeasure;

@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {
        @Override
        public UnitOfMeasureCommand convert(UnitOfMeasure unitOfMeasure) {
            if(unitOfMeasure == null)
            return null;

            final UnitOfMeasureCommand unitOfMeasureCommand = new UnitOfMeasureCommand();
            unitOfMeasureCommand.setDescription(unitOfMeasure.getDescription());
            unitOfMeasureCommand.setId(unitOfMeasure.getId());

            return unitOfMeasureCommand;
        }
}