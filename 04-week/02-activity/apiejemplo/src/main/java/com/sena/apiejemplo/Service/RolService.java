package com.sena.apiejemplo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.apiejemplo.Entity.Rol;
import com.sena.apiejemplo.IRepository.IRolRepository;

@Service
public class RolService {
    @Autowired
    private IRolRepository repository;

    public Rol save(Rol rol) {
        return repository.save(rol);
    }

    public List<Rol> All() {
        return repository.findAll();
    }

}