package org.zerock.workbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="myServlet",urlPatterns = "/my")
public class MyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        //doGet()은 브라우저의 주소를 직접 변경해서 접근하는 경우에 호출되는 메서드

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();//PrintWriter는 브라우저로 무언가를 출력하기 위한 용도
        out.println("<h1>My Servlet</h1>");
        out.println("</body></html>");

    }
}
