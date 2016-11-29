package it.alfasoft.rossella.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;

import it.alfasoft.andrea.bean.Film;

@WebService
public interface iFilm {
	
	@WebMethod
	public abstract Film getFilmConNome(String nome);

}