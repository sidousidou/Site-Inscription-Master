package control;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.Candidat;
import modele.Inscription;

@WebServlet("/InsererServlet")
public class InsererServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Inscription ins = Inscription.ins;

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		String dateString = request.getParameter("dateNaissance");
		String[] atts = dateString.split("-");
		LocalDate date = LocalDate.of(Integer.parseInt(atts[0]), Integer.parseInt(atts[1]), Integer.parseInt(atts[2]));

		String moyenString = request.getParameter("moyennes");
		String[] moys = moyenString.split(" ");
		ArrayList<Double> moyennes = new ArrayList<Double>();
		for (String m : moys) {
			moyennes.add(Double.parseDouble(m));
		}

		int nbr_prgr = Integer.parseInt(request.getParameter("nbprogression"));
		int nbr_ratt = Integer.parseInt(request.getParameter("nbrattrapage"));
		int nbr_redo = Integer.parseInt(request.getParameter("nbredoublement"));

		Candidat c = new Candidat(nom, prenom, date, moyennes, nbr_prgr, nbr_ratt, nbr_redo);
		
		ins.inscrire(c);

		System.out.println(c);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("mat",c.getMatricule());
		session.setAttribute("nom",c.getNom());
		session.setAttribute("prenom",c.getPrenom());
		request.getRequestDispatcher("espace_candidat.html").forward(request, response);
	}

}
