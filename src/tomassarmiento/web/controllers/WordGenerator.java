package tomassarmiento.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WordGenerator
 */
@WebServlet("/WordGenerator")
public class WordGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WordGenerator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//getAttribute()
		HttpSession session = request.getSession();
		if(session.getAttribute("word")!=null) {
			session.setAttribute("showingWord", (String) session.getAttribute("word"));
		}
		if(session.getAttribute("count")==null){
			session.setAttribute("count", 0);
		}
		else{
			int newCount = (int) session.getAttribute("count");
			newCount++;
			session.setAttribute("count", newCount);
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/wordGenerator.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
