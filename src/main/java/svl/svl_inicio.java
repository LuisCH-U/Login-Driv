package svl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import bean.dUsuario;
import dao.dao_home;


public class svl_inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		    
		//Inicio_Sesion    
		String Email = request.getParameter("Email");
		String Pass = request.getParameter("Pass");
		//Registro_usuario
		String Nombre = request.getParameter("Nombre");
	    String email = request.getParameter("Email");
	    String pass = request.getParameter("Pass");

		dao_home log = new dao_home();
		dUsuario Us = log.Login(Email, Pass);
		
		//inicio_Sesion
		if (Us == null) {
			request.setAttribute("mensaje", "Error nombre de usuario y/o clave. Vuelva a intentarlo");
			request.getRequestDispatcher("Home-Driv.jsp").forward(request, response);
		} 
		else
		{
			response.sendRedirect("Home-Driv.jsp");
			session.setAttribute("Email", Email);
			session.setAttribute("Pass", Pass);
		}
		
		//Registro
		if (Nombre == null || Nombre.isEmpty() || 
		    Email  == null || email.isEmpty() ||   
		    Pass   == null || pass.isEmpty()) {
	        request.setAttribute("Aviso", "Todos los campos son obligatorios");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("sesion.jsp");
	        dispatcher.forward(request, response);
	        return;
		    }

		dUsuario usu = new dUsuario(Nombre, Email, Pass);
		    usu.setNOMBRE(Nombre);
		    usu.setEMAIL(email);
		    usu.setPASS(pass);

		    try {
		        dao_home.Registro(usu);
		        request.setAttribute("Aviso", "Registro Exitoso");
		        request.setAttribute("Excelente", true);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("sesion.jsp");
		        dispatcher.forward(request, response);
		    } catch (SQLException e) {
		        request.setAttribute("Aviso", "Error en los datos");
		        e.printStackTrace();
		        request.setAttribute("Error", true);
		        RequestDispatcher rd = request.getRequestDispatcher("sesion.jsp");
		        rd.forward(request, response);
		    }
		    
		    
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
