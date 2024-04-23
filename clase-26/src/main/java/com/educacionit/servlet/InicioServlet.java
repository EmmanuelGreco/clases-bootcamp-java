package com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

/**
 * Servlet implementation class InicioServlet
 */
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*PrintWriter printWriter = response.getWriter();
		printWriter.append(
		"<html>" +
		"<body>" +
		"<h2>InicioServlet</h2>" +
		"</body>" +
		"</html>");	*/
		
		// Creo mi modelo
		//List<Alumno> alumnos = new ArrayList<>();
		/*alumnos.add(new Alumno(1000, "Alumno1", 10));
		alumnos.add(new Alumno(2000, "Alumno2", 20));
		alumnos.add(new Alumno(3000, "Alumno3", 30));*/
		
		// Guardo mi lista en la session
		HttpSession session = request.getSession();
		//session.getAttribute("nombre atributo");
		@SuppressWarnings("unchecked")
		List<Alumno> alumnos = (List<Alumno>)session.getAttribute("listaAlumnos");
		
		if (alumnos == null) {
			alumnos = new ArrayList<Alumno>();		
			session.setAttribute("listaAlumnos", alumnos);
		}
		
		// Forward
		request.getRequestDispatcher("listado_alumnos.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
