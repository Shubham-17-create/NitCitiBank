package firstProgramServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class WelcomeServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request,
			ServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
       out.println("<marquee>Hello welcome first program</marquee>");
		out.println("</body>");
		out.println("</html>");
	}
}

