
public interface IBookManager {

	void add(Book book);
	void remove(String isbn);
	Book[] getList();
	Book searchByIsbn(String title);
	Book[] searchByTitle(String title);
	Magazine[] getMagazines();
	Book[] getBooks();
	int getTotalPrice();
	double getPriceAvg();
	
}
