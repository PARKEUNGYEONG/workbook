package org.zerock.workbook.todo.service;
//enum타입으로 클래스를 작성하는 경우 가장 큰 장점은 정해진 수만큼만 객체를 생성할 수 있다는 장점.

import com.sun.tools.javac.comp.Todo;
import org.zerock.workbook.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;//객채의 개수를 결정하는 부분
    public void register(TodoDTO todoDTO){//register()의 경우 새로운 TodoDTO 객체를 받아서 확인할수 있는것을 목표로 작성
        System.out.println("DEBUG....."+todoDTO);

    }

    public List<TodoDTO> getList(){

        List<TodoDTO>todoDTOS = IntStream.range(0,10).mapToObj(i ->{//getList()는 10개의 TodoDTO객체를 만들어서 반환하도록 구성
        TodoDTO dto = new TodoDTO();
        dto.setTno((long)i);
        dto.setTitle("Todo.."+i);
        dto.setDueDate(LocalDate.now());

        return dto;
    }).collect(Collectors.toList());

        return todoDTOS;
    }

    //특정한 번호의 조회기능을 추가, 조회의 경우 대부분은 식별할 수 있는 값(식별키)를 get방식으로 같이 요청한다.
    public TodoDTO get(Long tno){

        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }

}
