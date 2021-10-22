package work;

import java.io.Serializable;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Company
 */
@WebServlet(name = "Companyname", urlPatterns = { "/Companynamemap" })
public class Company extends HttpServlet implements Serializable {

	private String companyname = null ;

	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}



}
