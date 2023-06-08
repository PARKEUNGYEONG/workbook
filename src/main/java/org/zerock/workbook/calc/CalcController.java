package org.zerock.workbook.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="calcController",urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.printf("num1: %s", num1);
        System.out.printf("num2: %s", num2);

        resp.sendRedirect("/index");
        //브라우저는 응답 헤더에 "Location"이 포함되면 브라우저의 주소창을 변경하고 해당 주소를 get방식으로 호출하게 된다.

    }
}
