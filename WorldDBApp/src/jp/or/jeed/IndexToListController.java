package jp.or.jeed;
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


@WebServlet("/IndexToListController")
public class IndexToListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		try {
			int pos = Integer.parseInt(request.getParameter("pos"));
			HttpSession session = request.getSession();
			ArrayList<CityTblBean> citylist = CityTblBean.selectAllList(pos);
			session.setAttribute("citylist", citylist);
			PagingBean pb = new PagingBean();
			if(citylist.size() < 20) {
				pb.setNext(pos);
			}else {
				pb.setNext(pos + 20);
			}
			if((pos - 20) <= 0) {
				pb.setPrevious(pos - 20);
			}
			session.setAttribute("pb",pb);

		}catch(Exception e) {
			e.printStackTrace();
		}
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/list.jsp");
		rd.forward(request, response);
	}
}
