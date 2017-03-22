package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.Bibliotekainterfejs;

public class Biblioteka implements Bibliotekainterfejs {
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiknjigu(Knjiga k) {
		knjige.remove(k);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		LinkedList<Knjiga> rezultati = new LinkedList<Knjiga>();

		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov))
				rezultati.add(knjige.get(i));
		}
		return null;
	}
}
