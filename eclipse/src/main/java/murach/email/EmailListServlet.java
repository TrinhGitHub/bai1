package murach.email;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import murach.business.*;
/**
 * Servlet implementation class EmailListServlet
 */
@WebServlet("/EmailListServlet")
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
            throws ServletException, IOException {
        String url = "/index.html";
        // get current action
        String action = request.getParameter("action");
        if (action == null){
            action = "join";
        }
        if(action.equals("join")){
            url = "/index.html";
        }
        else if(action.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            
            User user = new User(firstName,lastName,email);
           
            request.setAttribute("user",user);
            url = "/thanks.jsp";
           
        }
        
         getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        

    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                doPost(request,response);
            }


}
