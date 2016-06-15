/*
 * ImageReader.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 15, 2016  5:56:19 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@WebServlet(name = "ImageReader", urlPatterns = {"/image.png"})
public class ImageReader extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String path = (String) request.getSession().getAttribute("path");
            String contentType = getServletContext().getMimeType(path);
            response.setContentType(contentType);
            
            FileInputStream in=new FileInputStream(new File(path));
            OutputStream out=response.getOutputStream();
            
            byte[] buffer=new byte[1024];
            int length;
            
            while((length=in.read(buffer))>0){
                out.write(buffer, 0, length);
            }
            
            in.close();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
