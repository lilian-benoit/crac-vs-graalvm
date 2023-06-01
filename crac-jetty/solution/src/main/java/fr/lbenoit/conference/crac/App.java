package fr.lbenoit.conference.crac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import fr.lbenoit.utils.presentation.utils.algo.NombrePremierCalculateur;

public class App extends AbstractHandler {
	private NombrePremierCalculateur calculateur = null; 

	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int nb = 75_000;
		
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		if (calculateur == null) {
			calculateur = new NombrePremierCalculateur();
		}
		response.getWriter().println(nb +" est un nombre premier : " + calculateur.estNombrePremier(nb));
	}

}
