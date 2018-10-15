package ro.alex.learning.RecipeApplication.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ro.alex.learning.RecipeApplication.command.UnitOfMeasureCommand;
import ro.alex.learning.RecipeApplication.domain.UnitOfMeasure;


@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand unitOfMeasureCommand) {
        if(unitOfMeasureCommand == null)
            return null;

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setDescription(unitOfMeasureCommand.getDescription());
        uom.setId(unitOfMeasureCommand.getId());

        return uom;
    }
}
