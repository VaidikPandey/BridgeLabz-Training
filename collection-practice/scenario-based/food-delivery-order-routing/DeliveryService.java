import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DeliveryService {
    private final Queue<Order> orderQueue;
    private final List<Agent> agents;
    private final Map<Order, Agent> activeDeliveries;

    public DeliveryService() {
        orderQueue = new LinkedList<>();
        agents = new ArrayList<>();
        activeDeliveries = new HashMap<>();
    }

    public void addOrder(Order order) {
        orderQueue.offer(order);
    }

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    public void assignNextOrder() throws NoAgentAvailableException {
        if (orderQueue.isEmpty()) {
            System.out.println("No pending orders.");
            return;
        }

        Order nextOrder = orderQueue.peek();
        Agent nearest = findNearestAvailableAgent(nextOrder);

        if (nearest == null) {
            throw new NoAgentAvailableException("No agent available for order " + nextOrder.getOrderId());
        }

        orderQueue.poll();
        nearest.setAvailable(false);
        activeDeliveries.put(nextOrder, nearest);
    }

    public void assignAllPossible() throws NoAgentAvailableException {
        while (!orderQueue.isEmpty()) {
            assignNextOrder();
        }
    }

    public boolean cancelOrder(String orderId) {
        Order activeOrder = findActiveOrder(orderId);
        if (activeOrder != null) {
            Agent assignedAgent = activeDeliveries.remove(activeOrder);
            assignedAgent.setAvailable(true);
            return true;
        }

        Iterator<Order> iterator = orderQueue.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderId().equals(orderId)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public void viewActiveDeliveries() {
        if (activeDeliveries.isEmpty()) {
            System.out.println("No active deliveries.");
            return;
        }

        for (Map.Entry<Order, Agent> entry : activeDeliveries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private Agent findNearestAvailableAgent(Order order) {
        Agent nearest = null;
        int bestDistance = Integer.MAX_VALUE;

        for (Agent agent : agents) {
            if (!agent.isAvailable()) {
                continue;
            }

            int distance = squaredDistance(order.getX(), order.getY(), agent.getX(), agent.getY());
            if (distance < bestDistance) {
                bestDistance = distance;
                nearest = agent;
            }
        }

        return nearest;
    }

    private int squaredDistance(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return dx * dx + dy * dy;
    }

    private Order findActiveOrder(String orderId) {
        for (Order order : activeDeliveries.keySet()) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }
}
