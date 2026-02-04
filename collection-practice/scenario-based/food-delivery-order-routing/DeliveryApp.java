public class DeliveryApp {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        service.addAgent(new Agent("A1", "Ravi", 2, 4));
        service.addAgent(new Agent("A2", "Maya", 8, 1));
        service.addAgent(new Agent("A3", "Neha", 5, 6));

        service.addOrder(new Order("O101", "Anil", 3, 4));
        service.addOrder(new Order("O102", "Priya", 7, 2));
        service.addOrder(new Order("O103", "Rahul", 1, 9));

        try {
            service.assignNextOrder();
            service.assignNextOrder();
            service.assignNextOrder();
        } catch (NoAgentAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.viewActiveDeliveries();

        boolean cancelled = service.cancelOrder("O102");
        System.out.println("Cancel O102: " + cancelled);

        service.viewActiveDeliveries();
    }
}
