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

@WebServlet("/EditController")
public class EditController extends HttpServlet
{
    int i;
    ArrayList<Product> products;
    HttpSession hs;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        i=Integer.parseInt(req.getParameter("index"));
        
        hs=req.getSession();
        products=(ArrayList)hs.getAttribute("products");
        Product p=products.get(i);
        
        hs.setAttribute("p", p);
        resp.sendRedirect("editproduct.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        Product product=new Product();
        product.setProduct_id(Integer.parseInt(req.getParameter("pid")));
        product.setProduct_name(req.getParameter("pname"));
        product.setPrice(Float.parseFloat(req.getParameter("price")));
        
        products.remove(i);
        products.add(i,product);
        hs.setAttribute("products", products);
        resp.sendRedirect("displayproducts.jsp");
    }
}
