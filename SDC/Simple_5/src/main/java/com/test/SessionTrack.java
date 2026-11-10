
package com.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.util.Date;

@WebServlet("/SessionTrack")
public class SessionTrack extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("count", count);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Session Tracking</h2>");
        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Creation Time: " +
                new Date(session.getCreationTime()) + "<br>");
        out.println("Last Access Time: " +
                new Date(session.getLastAccessedTime()) + "<br>");
        out.println("Number of Visits: " + count);
        out.println("</body></html>");
    }
}
