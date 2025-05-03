package com.example.demo.repository;

import com.example.demo.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
