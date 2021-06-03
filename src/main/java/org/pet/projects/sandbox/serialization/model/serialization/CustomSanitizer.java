package org.pet.projects.sandbox.serialization.model.serialization;

import com.fasterxml.jackson.databind.util.StdConverter;
import org.pet.projects.sandbox.serialization.model.request.Request;

public class CustomSanitizer extends StdConverter<Request, Request> {

    @Override
    public Request convert(Request request) {
        return request.setStrRqType(request.getRqType().name());
    }

}
