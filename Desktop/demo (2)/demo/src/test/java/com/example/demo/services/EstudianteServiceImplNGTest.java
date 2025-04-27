/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.model.Estudiante;
import static org.testng.Assert.*;

/**
 *
 * @author TOSHIBA
 */
public class EstudianteServiceImplNGTest {
    
    public EstudianteServiceImplNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of newEstudiante method, of class EstudianteServiceImpl.
     */
    @org.testng.annotations.Test
    public void testNewEstudiante() {
        System.out.println("newEstudiante");
        Estudiante newEstudiante = null;
        EstudianteServiceImpl instance = new EstudianteServiceImpl();
        Estudiante expResult = null;
        Estudiante result = instance.newEstudiante(newEstudiante);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class EstudianteServiceImpl.
     */
    @org.testng.annotations.Test
    public void testGetAll() {
        System.out.println("getAll");
        EstudianteServiceImpl instance = new EstudianteServiceImpl();
        Iterable expResult = null;
        Iterable result = instance.getAll();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifyEstudiante method, of class EstudianteServiceImpl.
     */
    @org.testng.annotations.Test
    public void testModifyEstudiante() {
        System.out.println("modifyEstudiante");
        Estudiante estudiante = null;
        EstudianteServiceImpl instance = new EstudianteServiceImpl();
        Estudiante expResult = null;
        Estudiante result = instance.modifyEstudiante(estudiante);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
