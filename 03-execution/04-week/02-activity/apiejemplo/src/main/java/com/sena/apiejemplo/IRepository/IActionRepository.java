package com.sena.apiejemplo.IRepository;

import com.sena.apiejemplo.Entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActionRepository extends JpaRepository<Action, Long> {
}