package com.coffeecompany.controller;

import com.coffeecompany.constants.CoffeeContainers;
import com.coffeecompany.entities.User;
import com.coffeecompany.entities.coffee.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeServlet extends HttpServlet {

    /**
     * @noinspection FieldMayBeFinal
     */
//    private List<Coffee> coffees;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        if (coffees == null) {
//            coffees = new ArrayList<>();
//            HttpSession session = req.getSession();
//            session.setAttribute("coffees", coffees);
//        }

//        if (req.getParameter("container") == null) {
            req.getRequestDispatcher("/WEB-INF/jsp/Coffee.jsp").forward(req, resp);
//        }

//        String sort = req.getParameter("sort");
//        double price = Double.parseDouble(req.getParameter("price"));
//        String container = req.getParameter("container");
//        int weight = Integer.parseInt(req.getParameter("weight"));
//        CoffeeContainers bag = null;
//
//        if (sort != null & container != null) {
//            switch (container) {
//                case ("BEANS_IN_BAG"):
//                    bag = CoffeeContainers.BEANS_IN_BAG;
//                    break;
//                case ("JAR"):
//                    bag = CoffeeContainers.JAR;
//                    break;
//                case ("BAG"):
//                    bag = CoffeeContainers.BAG;
//                    break;
//                case ("ONE_PORTION_BAG"):
//                    bag = CoffeeContainers.ONE_PORTION_BAG;
//                    break;
//            }
//
//            switch (sort) {
//                case ("Arusha"):
//                    coffees.add(new Arusha(price, bag, weight));
//                    break;
//                case ("BlueMountain"):
//                    coffees.add(new BlueMountain(price, bag, weight));
//                    break;
//                case ("Java"):
//                    coffees.add(new Java(price, bag, weight));
//                    break;
//                case ("Sagada"):
//                    coffees.add(new Sagada(price, bag, weight));
//                    break;
//            }
//        }
//        System.out.println(((User) req.getSession().getAttribute("companyUser")).getName());


//        if (req.getParameter("container") != null) {
//            req.getRequestDispatcher("/WEB-INF/jsp/Coffee.jsp").forward(req, resp);
//        }
    }
}
