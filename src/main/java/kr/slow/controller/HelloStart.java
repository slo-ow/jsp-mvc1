package kr.slow.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/h.do")
public class HelloStart extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. 클라이언트의 요청을 받는 작업(파라메터 수집) -> Controller(Servlet)
        // 2. 처리하는 작업(비즈니스로직) -> Model(Java class)
        int sum = 0;
        for(int i=1; i<=100; i++){
            sum += i;
        }
        // 3. 요청한 클라이언트에게 응답하는 작업(프레젠테이션로직) -> View(JSP)
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println(sum);
        out.println("</body>");
        out.println("</html>");

        // Servlet 과 Model 로 회원관리 만들기

    }
}
