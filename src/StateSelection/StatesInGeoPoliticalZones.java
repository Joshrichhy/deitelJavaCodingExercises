package StateSelection;

public class StatesInGeoPoliticalZones {
    private GeoPoliticalZones zone;

    public StatesInGeoPoliticalZones(GeoPoliticalZones zone) {
        this.zone = zone;
    }

    public GeoPoliticalZones getZone() {
        return zone;
    }

    public void setZone(String nameOfState) {
        this.zone = GeoPoliticalZones.findZone(nameOfState);
    }


}
