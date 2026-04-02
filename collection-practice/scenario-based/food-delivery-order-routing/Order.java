public class Order {
    private final String orderId;
    private final String customerName;
    private final int x;
    private final int y;

    public Order(String orderId, String customerName, int x, int y) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.x = x;
        this.y = y;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Order{" +
            "orderId='" + orderId + '\'' +
            ", customerName='" + customerName + '\'' +
            ", location=(" + x + "," + y + ")" +
            '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order other = (Order) obj;
        return orderId.equals(other.orderId);
    }

    @Override
    public int hashCode() {
        return orderId.hashCode();
    }
}
