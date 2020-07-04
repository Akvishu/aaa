import javax.servlet.*;
import java.io.* ;
public class Addition extends GenericServlet{
	
	public void service(ServletRequest req,ServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out=res.getWriter();
			String a = req.getParameter("num1");
			String b = req.getParameter("num2");
			int n1=Integer.parseInt(a);
			int n2=Integer.parseInt(b);
			int n;
			n=n1+n2;
			out.print("<html><body>");
			out.print("<h1><center>My First Web App</center></h1>");
			out.print("Sum of "+n1+" and "+n2+" :- "+n+" ");
			out.print("</body></html>");
		}catch(Exception e){
		out.print(e);
	}
	}
}
