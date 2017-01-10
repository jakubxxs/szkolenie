package pl.softronic.szkolenie.klasy.dziedziczenie;

import pl.softronic.szkolenie.klasy.geometria.Punkt;

public class Main {

	public static void main(String[] args) {
		
		Samochod zabawka = new Samochod("zabawka", new Punkt(100, 0));
		zabawka.setPredkosc(new Wektor(10, 0));
		zabawka.setPrzyspieszenie(new Wektor(0, 0));
		zabawka.setSkret(1 * Math.PI/180);
		
		System.out.println("Pozycja startowa");
		System.out.println(zabawka);
		
		for(int t=0; t<100; t++){
			zabawka.krok();
		}
		
		System.out.println("Pozycja ko�cowa");
		System.out.println(zabawka);
		
		System.out.println("k�t pr�dko�ci: "
				+ zabawka.getPredkosc().getKat() * 180/Math.PI );
		
	}

}
