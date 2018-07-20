package book.factory;

import book.view.BookReply;
import book.view.ErrorReply;
import book.view.ListReply;
import book.view.MessageReply;
import book.view.Reply;

/**
 * 매니저가 특정 응답을 할 때,
 * 응답 객체를 Reply 타입으로 생성하는 클래스
 * @author PC38218
 *
 */
public class ViewFactory {
	
	public static Reply getReply(String type) {
		Reply reply = null;
		
		if ("list".equals(type)) {
			reply = new ListReply();
		} else if ("message".equals(type)) {
			reply = new MessageReply();
		} else if ("error".equals(type)) {
			reply = new ErrorReply();
		} else if ("single".equals(type)) {
			reply = new BookReply();
		}
		
		return reply;
	}
}
