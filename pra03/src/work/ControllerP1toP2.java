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
		String[] item3 =  request.getParameterValues("item2");
		String[] numberoforder2 =  request.getParameterValues("numberoforder1");

		for( int i=0; i<numberoforder2.length; i++ ) {
			if(Integer.parseInt(numberoforder2[i]) != 0) {
				Order order = new Order();
				order.setItem(item3[i]);
				order.setNumberoforder(Integer.parseInt(numberoforder2[i]));
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
