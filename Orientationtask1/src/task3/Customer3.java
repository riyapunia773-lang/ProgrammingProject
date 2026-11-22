package task3;

public class Customer3 {
    private static int nextId = 1;

    private int id;
    private long startTime;
    private long endTime;

    public Customer3() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}

