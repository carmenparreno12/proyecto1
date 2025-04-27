package com.example.demo.services;

import com.example.demo.model.Estudiante;

/*CRUD */
public interface EstudianteService {
 Estudiante newEstudiante(Estudiante newEstudiante); 
 Iterable<Estudiante>getAll();
 Estudiante modifyEstudiante(Estudiante estudiante);
 Boolean deleteEstudiante(Long Iduser);
 
    
}

