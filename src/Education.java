public class Education {

    private String degreeType;
    private String major;
    private String uniName;
    private int gradYear;

    public Education () {

    }

    public Education(String degreeType, String major, String uniName, int gradYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.uniName = uniName;
        this.gradYear = gradYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    // String representation of a education object
    public String toString() {
        return getDegreeType() + " in " + getMajor() + ",\n" +
                getUniName() + ", " + getGradYear() + "\n";
    }

}
