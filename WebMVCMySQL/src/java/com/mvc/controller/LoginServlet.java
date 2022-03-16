/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

public class LoginServlet extends HttpServlet {

    public LoginServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");//Se toman los valores 
        String password = request.getParameter("password");//de la página JSP

        LoginBean loginBean = new LoginBean(); //Se crea un bean LoginBean, una clase normal de java, contiene sólo setters y getters, para acceder a la información del usuario cuando se requiere.

        loginBean.setUserName(userName); //establece username and password
        loginBean.setPassword(password);

        LoginDao loginDao = new LoginDao(); //crea un objeto LoginDao. Contiene la lógica principal de la aplicación.

        String userValidate = loginDao.authenticateUser(loginBean); //Llama la función para autenticar

        if (userValidate.equals("SUCCESS")) //Si éxito, entonces Home.jsp
        {
            request.setAttribute("userName", userName);
            request.getRequestDispatcher("/Home.jsp").forward(request, response);
        } else //Si no-éxito
        {
            request.setAttribute("errMessage", userValidate);
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
    }
}
