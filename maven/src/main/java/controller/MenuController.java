package controller;



import java.io.IOException;

import java.util.List;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Menu;





/**
 * Servlet implementation class ShowBooksController
 */
public class MenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	Session session;
	public void init(ServletConfig config) throws ServletException {
		SessionFactory sf= (SessionFactory)config.getServletContext().getAttribute("sf");
		session=sf.openSession();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Query q=session.createQuery("from menu");
		
		List<Menu> menus=q.getResultList();
		
		HttpSession s=request.getSession();
		
		s.setAttribute("menus", menus);
	    
		RequestDispatcher rd=request.getRequestDispatcher("showmenu.jsp");
		rd.forward(request, response);
		
		List<Menu> menu=(List<Menu>)s.getAttribute("menus");
		for(Menu b:menu)
		{
			System.out.println(b);
		}
		

	}
	@Override
	public void destroy() {
	
		session.close();
	}
	
}
