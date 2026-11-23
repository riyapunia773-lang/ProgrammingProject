
package task5;

public class Clock {

    private static Clock instance = new Clock();
    private double time;

    private Clock() {
        time = 0;
    }

    public static Clock getInstance() {
        return instance;
    }

    public void setTime(double newTime) {
        time = newTime;
    }

    public double getTime() {
        return time;
    }
}
