package book.view;

import java.util.List;

import book.vo.Book;

/**
 * 제품 전체 목록을 보여주는 작업
 * @author PC38218
 *
 */
public class ListReply implements Reply {

	@Override
	public void display(Object object) {
		// object로 제품정보 목록이 넘어온다.
		List<Book> books = (List<Book>)object;
		for (Book book: books) {
			System.out.println(book);
		}
	}
}
