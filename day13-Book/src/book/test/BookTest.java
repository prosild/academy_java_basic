package book.test;

import book.controller.Manager;
import book.dao.BookShelf;
import book.factory.BookShelfFactory;
import book.vo.Book;

public class BookTest {
	public static void main(String[] args) {

		// 2. 
		BookShelf shelf = BookShelfFactory.getBookShelf("mybatis");
		
		// 3. 매장을 관리할 매니저를 고용함
		Manager manager = new Manager(shelf);
		
		Book ivp = new Book("B001", "나는 왜 그리스도인이 되었는가", "존 스토트", 6000, "9788932815381", "IVP");
		Book ivp2 = new Book("B002", "늘 급한 일로 쫓기는 삶", "찰스 험멜", 1000, "9788932881164", "IVP");
		
		// 1. 매장에 도착한 책을 입고
		manager.insert(ivp);
		manager.insert(ivp2);
		
		// 2. 입고된 책 전체 확인
		shelf.selectAll();

		// 3. 아디다스 제품 수정
		Book ivp3 = new Book("B002", "늘 급한 일로 쫓기는 삶", "찰스 험멜", 2000, "9788932881164", "IVP");
		manager.update(ivp3);
		
		// 4. 수정된 아디다스 제품 수정 확인		
		manager.selectOne(ivp3);
		
		// 5. 판매 종료할 제품 폐기
		manager.delete(ivp);
		
		// 6. 폐기 확인을 위해 전체 목록 재 조회
		System.out.println("================================================================================================");
		manager.selectAll();
		
		// 7. 없는 코드 조회 ==> NotFoundException 발생 상황
		Book p007 = new Book("P007");
		manager.selectOne(p007);
		
		// 8. 없는 제품 수정 ==> NotFoundException 발생 상황
		manager.update(p007);
		
		// 9. 있는 제품 중복 추가 ==> DuplicateException
		Book b002 = new Book("B002");
		manager.insert(b002);
		
		// 10. 전체 1건씩 모두 삭제
		manager.delete(null);
		manager.delete(b002);
		
	}
}
