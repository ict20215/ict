package work;

import java.io.Serializable;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Order
 */
@WebServlet(name = "Ordername", urlPatterns = { "/Ordermap" })
public class Order extends HttpServlet implements Serializable {
	private int orderninzu;
	private String seminar5 = null;

	public int getOrderninzu() {
		return orderninzu;
	}
	public void setOrderninzu(int orderninzu) {
		this.orderninzu = orderninzu;
	}
	public String getSeminar5() {
		return seminar5;
	}
	public void setSeminar5(String seminar6) {
		this.seminar5 = seminar6;
	}

}
