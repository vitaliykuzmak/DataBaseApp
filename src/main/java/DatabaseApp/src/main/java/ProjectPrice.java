public class ProjectPrice {
    private int projectId;
    private int price;

    public ProjectPrice(int projectId, int price) {
        this.projectId = projectId;
        this.price = price;
    }

    public int getProjectId() { return projectId; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "ProjectPrice{projectId=" + projectId + ", price=" + price + '}';
    }
}

