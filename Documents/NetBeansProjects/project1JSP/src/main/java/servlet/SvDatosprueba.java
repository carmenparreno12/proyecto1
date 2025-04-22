package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvDatosprueba", urlPatterns = {"/SvDatosprueba"})
public class SvDatosprueba extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String documento=request.getParameter("dni");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String telefono=request.getParameter("telefono");
        String correo=request.getParameter("correo");
    
        System.out.println("documento es:"+ documento);
        System.out.println("nombre es:"+ nombre);
        System.out.println("apellido es:"+ apellido);
        System.out.println("telefono es:"+ telefono);
        System.out.println("correo es:"+ correo);

}
        
    }

   
