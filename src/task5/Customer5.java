
package task5;

public class Customer5 {

    private static int nextId = 1;

    private int id;
    private long startTime;
    private long endTime;

    public Customer5() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long time) {
        startTime = time;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long time) {
        endTime = time;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}
