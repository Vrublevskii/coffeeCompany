package com.coffeecompany.controller;

import com.coffeecompany.entities.coffee.Coffee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TruckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sort = req.getParameter("sort");
        if (sort != null){
            HttpSession session = req.getSession();
            List<Coffee> coffees = (List<Coffee>) session.getAttribute("coffees");
            Collections.sort(coffees);
        }
            req.getRequestDispatcher("/WEB-INF/jsp/Truck.jsp").forward(req, resp);

    }
}
