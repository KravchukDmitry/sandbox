package org.pet.projects.sandbox.serialization.controller;

import org.pet.projects.sandbox.serialization.model.request.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("constraints")
public class ConstraintController {

    @PostMapping
    public void testCustomConstraints(@Valid @RequestBody Request request) {
        System.out.println(request);
    }

}
