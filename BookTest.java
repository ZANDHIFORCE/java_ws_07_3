
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager manager = BookManager.getInstance();
		manager.add(new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법"));
        manager.add(new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용"));
        manager.add(new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링"));
        manager.add(new Magazine("45678", "월간 알고리즘", "홍길동", "jaen.kr", 10000, "1월 알고리즘", 2021, 1));
		System.out.println("*****************도서 전체 목록*****************");
		printBooks(manager.getList());
		System.out.println("*****************일반 전체 목록*****************");
		printBooks(manager.getBooks());
		System.out.println("*****************잡지 전체 목록*****************");
		printBooks(manager.getMagazines());
		System.out.println("*****************도서 제목 포함검색:*****************");
		printBooks(manager.searchByTitle("Java"));	
		System.out.println("도서 가격 총합: "+manager.getTotalPrice());
		System.out.println("도서 가격 총합: "+manager.getPriceAvg());
	}
	public static void printBooks(Book[] books) {
		for(Book b: books) {
			System.out.println(b);
		}
	}

}
