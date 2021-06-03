package org.pet.projects.sandbox.serialization.model.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.experimental.Accessors;
import org.pet.projects.sandbox.serialization.annotation.CustomFieldConstraint;
import org.pet.projects.sandbox.serialization.annotation.CustomRequestConstraint;
import org.pet.projects.sandbox.serialization.enums.RqType;
import org.pet.projects.sandbox.serialization.model.serialization.CustomSanitizer;

@Data
@Accessors(chain = true)
@CustomRequestConstraint
@JsonDeserialize(converter = CustomSanitizer.class)
public class Request {

    @CustomFieldConstraint
    private String name;

    private RqType rqType;

    private String strRqType;

}
