package book.factory;

import book.view.BookView;

/**
 * 매니저가 특정 응답을 할 때,
 * 응답 객체를 Reply 타입으로 생성하는 클래스
 * @author PC38218
 *
 */
public class ViewFactory {
	
	public static BookView getReply(String type) {
		BookView bookView = null;
		
		if ("list".equals(type)) {
			
		} else if ("message".equals(type)) {
			
		} else if ("error".equals(type)) {
			
		} else if ("single".equals(type)) {
		}
		
		return bookView;
	}
}
