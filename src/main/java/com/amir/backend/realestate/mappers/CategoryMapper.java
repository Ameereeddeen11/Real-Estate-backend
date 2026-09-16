package com.amir.backend.realestate.mappers;

import com.amir.backend.realestate.domain.PropertyStatus;
import com.amir.backend.realestate.domain.dtos.CategoryDto;
import com.amir.backend.realestate.domain.entities.Category;
import com.amir.backend.realestate.domain.entities.Property;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CategoryMapper {
    @Mapping(
            target = "propertyCount",
            source = "properties",
            qualifiedByName = "calculatePropertyCount"
    )
    CategoryDto toDto(Category category);

    @Named("calculatePropertyCount")
    default long calculatePropertyCount(List<Property> properties) {
        if (properties == null) {
            return 0;
        } else {
            return properties.stream()
                    .filter(property -> PropertyStatus.PUBLISHED.equals(property.getStatus()))
                    .count();
        }
    }
}
