package work;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerP1toP2
 */
@WebServlet(name = "ControllerP1toP2name", urlPatterns = { "/ControllerP1toP2map" })
public class ControllerP1toP2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	try {
		HttpSession session=request.getSession();
		ArrayList<Order> orderlist = new ArrayList<Order>();
		String[] ninzu2 =  request.getParameterValues("ninzu1");
		String[] seminar4 =  request.getParameterValues("seminar3");
		for( int i=0; i<ninzu2.length; i++ ) {
			if(Integer.parseInt(ninzu2[i]) != 0) {
				Order order = new Order();
				order.setSeminar5(seminar4[i]);
				order.setOrderninzu(Integer.parseInt(ninzu2[i]));
				orderlist.add(order);
			}
		}
		session.setAttribute("orderlist", orderlist);
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	ServletContext context = getServletContext();
	RequestDispatcher rd = context.getRequestDispatcher("/jsp/page2.jsp");
	rd.forward(request, response);
	}
}
