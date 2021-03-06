package rei08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Rei08Controller
 */

@WebServlet("/a")

public class Rei08Controller extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Rei08Bean rei08bean = new Rei08Bean();
		rei08bean.setSei(request.getParameter("sei"));
		rei08bean.setNen(request.getParameter("nen"));
		rei08bean.setMosidoki(request.getParameterValues("mosidoki"));
		rei08bean.setSeminar(request.getParameterValues("seminar"));
		request.setAttribute("rei08bean", rei08bean);

		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/jsp/Rei08_response.jsp");
		rd.forward(request, response);
	}

}

