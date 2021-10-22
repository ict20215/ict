package work;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerP2toP3
 */
@WebServlet(name = "ControllerP2toP3name", urlPatterns = { "/ControllerP2toP3map" })
public class ControllerP2toP3 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字化け防止（会社名の入力）
		request.setCharacterEncoding("UTF-8");

		HttpSession session=request.getSession();

		String companyname =  request.getParameter("companyname");
		Company company = new Company();
		company.setCompanyname(companyname);
		session.setAttribute("company", company);
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/jsp/page3.jsp");
		rd.forward(request, response);
	}

}
