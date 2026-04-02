public class Agent {
    private final String agentId;
    private final String name;
    private int x;
    private int y;
    private boolean available;

    public Agent(String agentId, String name, int x, int y) {
        this.agentId = agentId;
        this.name = name;
        this.x = x;
        this.y = y;
        this.available = true;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void updateLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Agent{" +
            "agentId='" + agentId + '\'' +
            ", name='" + name + '\'' +
            ", location=(" + x + "," + y + ")" +
            ", available=" + available +
            '}';
    }
}
