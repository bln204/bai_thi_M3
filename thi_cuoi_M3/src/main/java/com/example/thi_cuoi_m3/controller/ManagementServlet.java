package com.example.thi_cuoi_m3.controller;

import com.example.thi_cuoi_m3.service.PremisesServiceImpl;
import com.example.thi_cuoi_m3.service.PremisesService;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "PremisesServlet", value = "/")
public class ManagementServlet extends HttpServlet {

    private PremisesService premisesService ;

    public void init() {
        premisesService = new PremisesServiceImpl();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                break;
            case "edit":

                break;
            case "delete":

                break;
            case "search":

                break;
            default:
                findAll(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    }





    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("list", premisesService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(request, response);
    }
}