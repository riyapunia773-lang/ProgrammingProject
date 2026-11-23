
package task6;

public class Customer6 {

    private static int nextId = 1;

    private int id;
    private long startTime;
    private long endTime;

    public Customer6() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setStartTime(long time) {
        startTime = time;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime(long time) {
        endTime = time;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}
