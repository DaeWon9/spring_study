package study.firstSample.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
