
package com.example.demo.services;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

public class EstudianteServiceImpl{
    @Service
    public class EstudianteServiceImpl implements EstudianteService{
    
    @Autowired
    public EstudianteRepository estudianteRepository;
    
    @Override /* crear info*/
    public Estudiante newEstudiante(Estudiante newEstudiante){
       return this.estudianteRepository.save(newEstudiante);
        
    }
    @Override   /* obtener info*/
    public Iterable<Estudiante>getAll(){
        return this.estudianteRepository.findAll();
        
    }
    @Override  /* actualizar*/
    public boolean modifyEstudiante(Estudiante estudiante){
    Optional<Estudiante>estudianteEncontrado = this.estudianteRepository.findById(estudiante.getIduser());
    if(estudianteEncontrado.get())!=null{
       estudianteEncontrado.get().setNombre(estudiante.getNombre());
       estudianteEncontrado.get().setApellido(estudiante.getApellido());
       estudianteEncontrado.get().setEmail(estudiante.getEmail());
       estudianteEncontrado.get().setTelefono(estudiante.getTelefono());
       return null;        
        
    }
    
    @Override  /* eliminar*/
    public Boolean deleteEstudiante(longIduser){
      this.estudianteRepository.deleteByld(Iduser);
      return true;
        
  }
    
  }
}