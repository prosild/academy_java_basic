package book.factory;

/**
 * 창고 객체(GeneralWarehouse 타입) 생성을
 * 전문적으로 수행하는 팩토리 클래스
 * @author PC38218
 *
 */
public class BookShelfFactory {

//	public static GeneralWarehouse getWarehouse(String type) {
//		GeneralWarehouse warehouse = null;
//		
//		if ("array".equals(type)) {
//			Book[] products = new Book[0];
//			warehouse = new ArrayWarehouse(products);
//			
//		} else if ("list".equals(type)) {
//			List<Book> products = new ArrayList<>();
//			warehouse = new ListWarehouse(products);
//			
//		} else if ("set".equals(type)) {
//			Set<Book> products = new HashSet<>();
//			warehouse = new SetWarehouse(products);
//
//		} else if ("map".equals(type)) {
//			Map<String, Book> products = new HashMap<>();
//			warehouse = new MapWarehouse(products);
//			
//		} else if ("jdbc".equals(type)) {
//			warehouse = new JdbcWarehouse();
//			
//		} else if ("singleton".equals(type)) {
//			warehouse = JdbcWarehouse2.getInstance();
//		}
//		
//		return warehouse;
//	}
}
