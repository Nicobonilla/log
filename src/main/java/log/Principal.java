package log;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Principal
 */
@WebServlet("/Principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Principal() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private static final void home(HttpServletRequest request, HttpServletResponse response) {
    	HttpSession sesion = request.getSession(); // es un mismo objeto, no hay new
    	sesion.setAttribute("usuario", "awakelab");
    	String name = request.getParameter("name");
		String password = request.getParameter("password");
    }
    
    private static final void log(HttpServletRequest request, HttpServletResponse response) {
    	HttpSession sesion = request.getSession(); // es un mismo objeto, no hay new
    	sesion.setAttribute("usuario", "awakelab");
    }
    
    private static final void panel(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sesion = request.getSession();
		Object usuario = (String) sesion.getAttribute("usuario");
	}
    
    private static final void salir(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sesion = request.getSession();
		sesion.invalidate();
    }
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		Cookie uiColorCookie = new Cookie("color", "red");
		uiColorCookie.setMaxAge(60*60);
		response.addCookie(uiColorCookie);
		
		home(request,response);
		HttpSession sesion = request.getSession();
		
		if (parametro != null) {
			if (parametro.equals("sesion")) {
				getServletContext().getRequestDispatcher("/vista/verLogin.jsp").forward(request, response);
				response.getWriter().append("Esto es por GET at: ");
			} else if (parametro.equals("login")) {
				getServletContext().getRequestDispatcher("/vista/login.jsp").forward(request, response);
			}
		} else {
			getServletContext().getRequestDispatcher("/vista/login.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
	}

}
