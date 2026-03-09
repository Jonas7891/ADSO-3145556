package com.sena.apiejemplo.IRepository;

import com.sena.apiejemplo.Entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModuleRepository extends JpaRepository<Module, Long> {
}
