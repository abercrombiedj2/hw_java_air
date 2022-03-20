public class Pilot {

    private String name;
    private Rank rank;
    private String pilotLicenseNo;

    public Pilot(String name, Rank rank, String pilotLicenseNo) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNo = pilotLicenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getPilotLicenseNo() {
        return pilotLicenseNo;
    }

    public void setPilotLicenseNo(String pilotLicenseNo) {
        this.pilotLicenseNo = pilotLicenseNo;
    }

    public String flyPlane(){
        return "This is your captain speaking";
    }
}
