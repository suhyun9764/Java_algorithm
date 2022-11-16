package chap5_solco;

public class Order {
	long orderNum;
	String orderId;
	String orderDate;
	String orderName;
	String productNum;
	String address;
	
	public Order(long odn, String oid) {
		orderNum = odn;
		orderId = oid;
	}
	public void showOrder() {
		System.out.printf("주문 번호 : %d\n주문자 아이디 : %s\n주문 날짜 : %s\n주문자 이름 : %s\n"
				+ "주문 상품 번호 : %s\n배송주소 : %s\n",orderNum,orderId,orderDate,orderName,productNum,address);
	}
}
