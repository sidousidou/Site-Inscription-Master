package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.Candidat;
import modele.Inscription;

/**
 * Servlet implementation class AnnulerServlet
 */
@WebServlet("/AnnulerServlet")
public class AnnulerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Inscription ins = Inscription.ins;
		Candidat c = new Candidat();
		HttpSession session = request.getSession();
		
		if (session.getAttribute("mat")!=null) {
			ins.annuler((int)session.getAttribute("mat"));
			session.setAttribute("mat", null);
			session.invalidate();
			request.getRequestDispatcher("logout.html").forward(request, response);
			ins.rechercher(1);
		} else {
			request.getRequestDispatcher("espace_candidat.html").forward(request, response);
		}
		/*Integer matt = (Integer) session.getAttribute("mat");

		
		System.out.println(ins.trouverCandidat(matt));
		ins.annuler(matt);
		request.getRequestDispatcher("espace_candidat.html").forward(request, response);*/
	}

}
