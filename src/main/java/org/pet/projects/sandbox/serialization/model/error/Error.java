package org.pet.projects.sandbox.serialization.model.error;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Error {

    private String fieldName;

    private String message;

}
