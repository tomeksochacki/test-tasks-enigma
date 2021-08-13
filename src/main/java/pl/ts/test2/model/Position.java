package pl.ts.test2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tposition")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int deviceId;
    private int latitiude;
    private int longitude;

    public Position() {
    }

    public Position(int id, int deviceId, int latitiude, int longitude) {
        this.id = id;
        this.deviceId = deviceId;
        this.latitiude = latitiude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(int latitiude) {
        this.latitiude = latitiude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", deviceId=" + deviceId +
                ", latitiude=" + latitiude +
                ", longitude=" + longitude +
                '}';
    }
}
