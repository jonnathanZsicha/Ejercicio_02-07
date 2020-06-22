package ec.edu.ups.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.DocenteDAO;
import ec.edu.ups.modelo.Docente;

/**
 * Servlet implementation class Gestionar
 */
@WebServlet("/Gestion")
public class Gestionar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date fec; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gestionar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	DocenteDAO docentedao = DAOFactory.getFactory().getDocenteDAO();
		

		SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd");
		 try {
			fec = formato.parse("2024/01/23");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 Docente docente1 = new Docente(22.50, fec, null, null);
		 
		 docentedao.create(docente1);
		 
	   response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
