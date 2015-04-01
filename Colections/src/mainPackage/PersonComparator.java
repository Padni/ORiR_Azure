package mainPackage;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person firstPerson, Person seconPerson) {
		if (personStringLenghtDiferent(firstPerson, seconPerson) == 0) {
			return personStringCompare(firstPerson, seconPerson);
		} else {
			return personStringLenghtDiferent(firstPerson, seconPerson);
		}

	}

	/*
	 * Metoda por�wnuje sumy d�ugo�ci imion nazwisk dw�ch os�b i zwraca ich r�nice
	 * @param firstPerson Pierwsza osoba odjemna
	 * @param secondPerson druga osoba odjemik
	 * @return zwaraca r�znice sumy d�ugo�ci imion i nazwisk 
	 * @see Person
	 */
	private int personStringLenghtDiferent(Person firstPerson, Person secondPerson) {
		int tempArg0 = firstPerson.getName().length() + firstPerson.getSurname().length();
		int tempArg1 = secondPerson.getName().length() + firstPerson.getSurname().length();

		return tempArg0 - tempArg1;
	}

	/*
	 * Metoda por�wnuje najpierw nazwiska os�b leksykograficznie
	 * jezeli sa r�zne zwaraca 1,-1 w zate�nosci kt�re jest piewsze w kolejno�ci
	 * jezeli sa takie same port�wnuje imiona i zrwraca warto�c analogicznie do por�wnywania nazwisk
	 */
	
	private int personStringCompare(Person firstPerson, Person secondPerson) {
		if (firstPerson.getSurname().compareTo(secondPerson.getSurname()) == 0) { //Por�wnanie nazwisk
			return firstPerson.getName().compareTo(secondPerson.getName());
		} else
			return firstPerson.getSurname().compareTo(secondPerson.getSurname());  //por�wnanie imion 
	}

}
