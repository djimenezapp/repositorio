package com.example.demo.controllers;

import com.example.demo.models.Alumno;
import com.example.demo.repository.AlumnoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoRepository repo;

    public AlumnoController(AlumnoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Alumno> listar() {
        return repo.findAll();
    }

    @GetMapping("/{login}")
    public Alumno obtener(@PathVariable Integer login) {
        return repo.findById(login).orElse(null);
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return repo.save(alumno);
    }

    @PutMapping("/{login}")
    public Alumno actualizar(@PathVariable Integer login, @RequestBody Alumno alumno) {
        alumno.setLogin(login);
        return repo.save(alumno);
    }

    @DeleteMapping("/{login}")
    public void eliminar(@PathVariable Integer login) {
        repo.deleteById(login);
    }
}