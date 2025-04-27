package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;
    private Estudiante newEstudiante;

    @PostMapping("/nuevo")
    public Estudiante newEstudiante(@RequestBody Estudiante newEstudiante) {
        return this. estudianteService.newEstudiante(newEstudiante);
    }

    @GetMapping("/mostrar")
    public Iterable<Estudiante>getAll(){
        return (Iterable<Estudiante>) estudianteService.getAll();
    }

    @PostMapping("/modificar")
    public Estudiante updateEstudiante(@RequestBody Estudiante estudiante){
        return this.estudianteService.modifyEstudiante(estudiante);
    }
   @PostMapping("/value=/(id)")
    public boolean deleteEstudiante(@PathVariable(value="id")Long id){
        return this.estudianteService.deleteEstudiante(id);
    } 
}