package biblioteka;

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

import biblioteka.interfejs.Bibliotekainterfejs;

public class Biblioteka implements Bibliotekainterfejs {
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		if(k == null)
			throw new RuntimeException("Knjiga je null");
	}

	@Override
	public void obrisiknjigu(Knjiga k) {
		if(k == null)
			throw new RuntimeException("Knjiga je null");
		
		knjige.remove(k);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		if(autor == null || isbn==0 || naslov==null || izdavac == null)
			throw new RuntimeException("Morate uneti neki kriterijum");
		LinkedList<Knjiga> rezultati = new LinkedList<Knjiga>();

		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov))
				rezultati.add(knjige.get(i));
		}
		return null;
	}
}
