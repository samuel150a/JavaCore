package com.xworkz;


import co.dto.LicenseDto;
import co.dto.LicenseServiceImple;
import co.service.LicenseService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/L")

public class LicenseServlet  extends HttpServlet {
    public LicenseServlet() {

        System.out.println("Running in the License Constructor");
    }
    //@Override
    //public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running in the Post method");
        String name = req.getParameter("name");
        String sonof = req.getParameter("s");
        String dob = req.getParameter("d");
        String photo = req.getParameter("p");

        System.out.println(name);
        System.out.println(sonof);
        System.out.println(dob);
        System.out.println(photo);


        req.setAttribute("name", name);
        req.setAttribute("s", sonof);
        req.setAttribute("d", dob);
        req.setAttribute("p", photo);

        LicenseDto dto = new LicenseDto();
        dto.setname(name);
        dto.setsonof(sonof);
        dto.setdob(dob);
        dto.setphoto(photo);

        LicenseService service = new LicenseServiceImple();
        boolean saved = service.save(dto);
        String Name=dto.getname();

        if (Name!=null && Name.length()>=4 && Name.length()<=20) {
            req.setAttribute("dto", dto);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("SuccessLicense.jsp");
            req.setAttribute("message","Save is success");
            requestDispatcher.forward(req, resp);
            System.out.println("Successfull");

        }

     else {
            req.setAttribute("dto", dto);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("License.jsp");
            req.setAttribute("message","Save Failed");
            requestDispatcher.forward(req, resp);
            System.err.println("Name cant be null");

        }


    }
}
