package com.exemplo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.demo.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
