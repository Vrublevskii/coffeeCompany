package com.coffeecompany.controller.filter;

import com.coffeecompany.data.UserData;
import com.coffeecompany.entities.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class EntryFilter implements Filter {

    List<User> users = UserData.getUsers();

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        for (User user : users) {
            String name = user.getName();
            String passwordUserData = user.getPassword();
            if (Objects.equals(username, name) && Objects.equals(password, passwordUserData)) {
                session.setAttribute("companyUser", user);
                break;
            }
        }

        if (session.getAttribute("companyUser") != null) {
            response.sendRedirect("http://localhost:8080/coffeeCompany/coffeecompany");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }


    }

    @Override
    public void destroy() {
    }
}
