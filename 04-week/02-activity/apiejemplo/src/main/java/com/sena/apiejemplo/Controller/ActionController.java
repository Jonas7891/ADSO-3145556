package com.sena.apiejemplo.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.apiejemplo.Entity.Action;
import com.sena.apiejemplo.Service.ActionService;

@RestController
@RequestMapping("/apiejemplo/action")
public class ActionController {

    private final ActionService service;

    public ActionController(ActionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Action> create(@RequestBody Action action) {
        Action savedAction = service.save(action);
        return new ResponseEntity<>(savedAction, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Action>> All() {
        List<Action> actions = service.All();
        return new ResponseEntity<>(actions, HttpStatus.OK);
    }
}