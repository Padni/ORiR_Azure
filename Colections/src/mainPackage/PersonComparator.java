package mainPackage;

import java.util.Comparator;

/*
 * Por�wnuje dwa obiekty klasy osoba najpierw wed�ug dlugosci sumy imienia i nazwska 
 * a je�eli sa takie same to nazwsiko i imie w kolejno�ci leksykograficznej 
 * @author Dariusz Brzostek
 * @version 0.0.3
 */


public class PersonComparator implements Comparator<Person> {

	@Override
	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Person firstPerson, Person seconPerson) {
		if (personStringLenghtDiferent(firstPerson, seconPerson) == 0) {
			return personStringCompare(firstPerson, seconPerson);
		} else {
			return personStringLenghtDiferent(firstPerson, seconPerson);
		}

	}

	/*
	 * Por�wnuje sumy d�ugo�ci imion nazwisk dw�ch os�b i zwraca ich r�nice
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
	 * Por�wnuje najpierw nazwiska os�b leksykograficznie
	 * jezeli sa r�zne zwaraca 1,-1 w zate�nosci kt�re jest piewsze w kolejno�ci
	 * jezeli sa takie same port�wnuje imiona i zrwraca warto�c analogicznie do por�wnywania nazwisk
	 * @param firstPerson Pierwsza osoba 
	 * @param secondPerson druga osoba 
	 * @see Person
	 * @return zwraca -1,0,1 wg. meteody compareTo klasy String
	 */
	
	private int personStringCompare(Person firstPerson, Person secondPerson) {
		if (firstPerson.getSurname().compareTo(secondPerson.getSurname()) == 0) { //Por�wnanie nazwisk
			return firstPerson.getName().compareTo(secondPerson.getName());
		} else
			return firstPerson.getSurname().compareTo(secondPerson.getSurname());  //por�wnanie imion 
	}

}
