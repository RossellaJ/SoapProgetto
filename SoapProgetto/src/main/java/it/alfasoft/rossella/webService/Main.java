package it.alfasoft.rossella.webService;

import it.alfasoft.andrea.bean.Film;
import it.alfasoft.andrea.dao.FilmDao;

public class Main {

	public static void main(String[] args) {
		
		Film f1 = new Film("asd",2016,"ggg","025","romantico");
		Film f2 = new Film("kiu",2014,"iii","024","dramm");
		Film f3 = new Film("uyt",2015,"kkk","078","giallo");
		
		FilmDao fDao = new FilmDao();
		
		fDao.creaFilm(f1);
		fDao.creaFilm(f2);
		fDao.creaFilm(f3);
		
		
	}

}
