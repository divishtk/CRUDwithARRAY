package com.niit.controller;

import com.niit.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        int i=Integer.parseInt(req.getParameter("index"));
        
        HttpSession hs=req.getSession();
        ArrayList<Product> products=(ArrayList)hs.getAttribute("products");
        products.remove(i);
        
        hs.setAttribute("products", products);
        resp.sendRedirect("displayproducts.jsp");
    }
}
