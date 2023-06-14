package org.zerock.workbook.todo;
//TodoController 은 Get 방식만 처리하므로 doGet()만을 추가해서 다음과 같은 형태로 작성한다.
//TodoListController 은 TodoService에서 제공하는 List<TodoDTO>를 가져와서 jsp로 전달하는 내용의 코드를 다음과 같이 작성한다.

import org.zerock.workbook.todo.dto.TodoDTO;
import org.zerock.workbook.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@WebServlet(name="todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{

        System.out.println("/todo/list");

        List<TodoDTO> dtoList =TodoService.INSTANCE.getList();

        req.setAttribute("list",dtoList);

        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req,resp);
        //forward():현재까지의 모든 응답(response)내용은 무시하고 JSP가 작성하는 내용만을 브라우저로 전달
    }
}
