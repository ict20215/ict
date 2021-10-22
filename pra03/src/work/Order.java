package work;

import java.io.Serializable;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Order
 */
@WebServlet(name = "Ordername", urlPatterns = { "/Ordermap" })
public class Order extends HttpServlet implements Serializable {
	private String item = null;
	private int numberoforder;

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getNumberoforder() {
		return numberoforder;
	}
	public void setNumberoforder(int numberoforder) {
		this.numberoforder = numberoforder;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	private String companyname;


}
