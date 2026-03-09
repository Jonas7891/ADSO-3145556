package com.sena.apiejemplo.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.apiejemplo.Entity.Rol;
import com.sena.apiejemplo.Service.RolService;

@RestController
@RequestMapping("/apiejemplo/rol")
public class RolController {

    private final RolService service;

    public RolController(RolService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Rol> create(@RequestBody Rol rol) {
        Rol savedRol = service.save(rol);
        return new ResponseEntity<>(savedRol, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rol>> All() {
        List<Rol> rols = service.All();
        return new ResponseEntity<>(rols, HttpStatus.OK);
    }
}