package org.zerock.workbook.todo;
//TodoRegisterController은 특이하게 GET방식으로 호출되는 경우에는 입력할 수 있는 화면을 보여주고 POST방식으로 호출되는 경우에는 등록이 처리된 후에 다시목페이지(/to do/list)를 호출하게 된다(sendRediresct()).

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="todoRegisterController",urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        System.out.println("입력 화면을 볼 수 있도록 구성");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        System.out.println("입력을 처리하고 목록 페이지로 이동");
    }

}
