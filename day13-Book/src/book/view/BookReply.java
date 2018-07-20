package book.view;

import book.vo.Book;

/**
 * 매니저가 1건의 제품정보를 가지고 왔을 때
 * 출력할 응답을 구현
 * @author PC38218
 *
 */
public class BookReply implements Reply {

	@Override
	public void display(Object object) {
		// object로 들어오는 대상이 Product 타입인 것이 확실하다
		Book book = (Book)object;
		System.out.println(book);
		
	}

}
