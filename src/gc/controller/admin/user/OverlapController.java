package gc.controller.admin.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gc.entity.user.User;
import gc.service.user.UserService;

@WebServlet("/user/sign/overlap")
public class OverlapController extends HttpServlet {
	

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service = new UserService();
		
		String overlap = "���̵� �ߺ� �Ǿ����ϴ�";
		
		if(service.overlapId(overlap))
			overlap = "��� �����մϴ�";
		
		request.setAttribute("overlap", overlap);
		
		request.getRequestDispatcher("overlap.jsp").forward(request, response);
		
	}

}
