package com.sena.apiejemplo.IRepository;

import com.sena.apiejemplo.Entity.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewRepository extends JpaRepository<View, Long> {
}
