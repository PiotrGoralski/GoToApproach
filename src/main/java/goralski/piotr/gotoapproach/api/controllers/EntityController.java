package goralski.piotr.gotoapproach.api.controllers;

import goralski.piotr.gotoapproach.business.dto.AddEntityRequest;
import goralski.piotr.gotoapproach.business.dto.AddEntityResponse;
import goralski.piotr.gotoapproach.business.functions.AddEntity;
import goralski.piotr.gotoapproach.business.functions.GetEntity;
import goralski.piotr.gotoapproach.business.library.GoToProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EntityController {

    @GetMapping("/entity/{id}")
    public String getEntity(@PathVariable String id) {
        return new GoToProducer<>(GetEntity.class).execute(id);
    }

    @PostMapping("/entity")
    public AddEntityResponse createEntity(@RequestBody AddEntityRequest request) {
        return new GoToProducer<>(AddEntity.class).execute(request);
    }

}
