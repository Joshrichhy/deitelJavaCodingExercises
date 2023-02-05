package StateSelection;

public enum GeoPoliticalZones {
    NORTHCENTRAL(new String[]{"Benue","FCT", "KOGI", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTHEAST (new String[]{"Adamawa","Bauch", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTHWEST (new String[]{"Kaduna","Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTHEAST(new String[]{"Abia","Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTHSOUTH(new String[]{"Akwa-Ibom","Bayelsa", "Cross River", "Delta", "Edo", "Rivers"}),
    SOUTHWEST(new String[]{"Ekiti","Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    private String [] zone;



    GeoPoliticalZones(String[] state){
        this.zone = state;}

    public String[] getZone() {
        return zone;
    }

    public void setZone(String[] zone) {
        this.zone = zone;
    }
    public static GeoPoliticalZones findZone(String state){
        GeoPoliticalZones politicalZone = null;
        for (GeoPoliticalZones zones: GeoPoliticalZones.values()){
            for (String eachstate: zones.getZone()){
                if (state.equalsIgnoreCase(eachstate)){
                    System.out.println(zones);
                    politicalZone = zones;}
            }
        }

        return politicalZone;
    }
}
