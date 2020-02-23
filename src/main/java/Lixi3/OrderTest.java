package Lixi3;


public class OrderTest {
}
class  Order{
    private int orderId;
    private  String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
       // super.equals(o);
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        return orderName != null ? orderName.equals(order.orderName) : order.orderName == null;
    }




    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderName != null ? orderName.hashCode() : 0);
        return result;
    }
}
