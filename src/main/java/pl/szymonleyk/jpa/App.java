package pl.szymonleyk.jpa;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AddressRepository addressRepository = new AddressRepository();

		// dodanie elementu
		Address address = new Address("Gdynia", "Hutnicza", "3", 5, "51-222");
		addressRepository.insert(address);

		// pobierz element
		Address szukanyAdres = new Address();
		szukanyAdres = addressRepository.select(7);
		System.out.println(szukanyAdres);
	}
}
