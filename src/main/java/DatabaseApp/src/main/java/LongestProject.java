public class LongestProject {
    private int projectId;
    private int duration;

    public LongestProject(int projectId, int duration) {
        this.projectId = projectId;
        this.duration = duration;
    }

    public int getProjectId() { return projectId; }
    public int getDuration() { return duration; }

    @Override
    public String toString() {
        return "LongestProject{projectId=" + projectId + ", duration=" + duration + '}';
    }
}
