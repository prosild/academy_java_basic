package shop.view;

import java.util.List;

import shop.vo.Product;

/**
 * 제품 전체 목록을 보여주는 작업
 * @author PC38218
 *
 */
public class ListReply implements Reply {

	@Override
	public void reply(Object object) {
		// object로 제품정보 목록이 넘어온다.
		List<Product> products = (List<Product>)object;
		for (Product product: products) {
			product.print();
		}
	}

}
