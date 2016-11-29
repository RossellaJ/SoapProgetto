package it.alfasoft.rossella.webService;

import it.alfasoft.andrea.bean.Film;
import it.alfasoft.andrea.servizio.Servizio;

import javax.jws.WebService;

@WebService
public class FilmS implements iFilm {
	
	private Servizio s =new Servizio();
	
	/* (non-Javadoc)
	 * @see it.alfasoft.rossella.webService.iFilm#getFilmConNome(java.lang.String)
	 */
	@Override
	public Film getFilmConNome(String nome){
		return s.leggiFilmConNome(nome);	
	}

}
