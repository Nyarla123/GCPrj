package gc.controller.api.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gc.entity.notice.Notice;
import gc.service.notice.NoticeService;



@WebServlet("/notice/detail")
public class DetailController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		NoticeService service = new NoticeService();
		Notice n = service.get(id);
		
		request.setAttribute("n", n);
		
		request.getRequestDispatcher("/notice/detail.jsp").forward(request, response);
	}
}
