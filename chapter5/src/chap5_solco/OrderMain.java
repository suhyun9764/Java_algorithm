package chap5_solco;

public class OrderMain {

	public static void main(String[] args) {
		Order order = new Order(201803120001L,"abc123");
		order.orderDate = "2018년 3월 12일";
		order.orderName = "홍길순";
		order.productNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrder();
	}	

}
