package com.fo4ik.responce;

public class Duration {
    private long departure;
    private long total;

    public long getDeparture() {
        return departure;
    }

    public void setDeparture(long departure) {
        this.departure = departure;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Duration{" +
                "departure=" + departure +
                ", total=" + total +
                '}';
    }
}
