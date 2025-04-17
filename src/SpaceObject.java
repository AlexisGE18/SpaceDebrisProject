abstract class SpaceObject {
    private String recordID;
    private String satelliteName;
    private String originCountry;
    private String orbitType;
    private int launchYear;
    private String launchSite;
    private double longitude;
    private double avgLongitude;
    private String geoHash;
    private int daysOld;
    private String objectType;

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }
    public void setSatelliteName(String satelliteName){
        this.satelliteName = satelliteName;
    }
    public void setOriginCountry(String originCountry){
        this.originCountry = originCountry;
    }
    public void setOrbitType(String orbitType){
        this.orbitType = orbitType;
    }
    public void setLaunchYear(int launchYear){
        this.launchYear = launchYear;
    }
    public void setLaunchSite(String launchSite){
        this.launchSite = launchSite;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public void setAvgLongitude(double avgLongitude){
        this.avgLongitude = avgLongitude;
    }
    public void setGeoHash(String geoHash){
        this.geoHash = geoHash;
    }
    public void setDaysOld(int daysOld){
        this.daysOld = daysOld;
    }
    public void setObjectType(String objectType){
        this.objectType = objectType;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public String getRecordID() {
        return recordID;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getOrbitType() {
        return orbitType;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public String getLaunchSite() {
        return launchSite;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAvgLongitude() {
        return avgLongitude;
    }

    public String getGeoHash() {
        return geoHash;
    }

    public int getDaysOld() {
        return daysOld;
    }

    public String getObjectType() {
        return objectType;
    }

}
