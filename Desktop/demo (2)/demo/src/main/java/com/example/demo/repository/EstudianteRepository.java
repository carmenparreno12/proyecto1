
package com.example.demo.repository;

import com.example.demo.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
        
public interface EstudianteRepository extends JpaRepository<Estudiante,Long>{

    public void deleteByld(Long iduser);
    
}
