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

@WebServlet("/AddProductController")
public class AddProductController  extends HttpServlet
{
    ArrayList<Product> products=new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        Product product=new Product();
        product.setProduct_id(Integer.parseInt(req.getParameter("pid")));
        product.setProduct_name(req.getParameter("pname"));
        product.setPrice(Float.parseFloat(req.getParameter("price")));
        
        products.add(product);
        
        HttpSession hs=req.getSession();
        hs.setAttribute("products", products);
        
        resp.sendRedirect("displayproducts.jsp");
    }
}
