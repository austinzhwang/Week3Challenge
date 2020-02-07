import java.util.ArrayList;

public class Experience {

    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private ArrayList<String> jobDesc;

    public Experience() {

    }

    public Experience(String company, String jobTitle, String startDate, String endDate, ArrayList<String> jobDesc) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDesc = jobDesc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(ArrayList<String> jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String toString() {
        int counter = 0;
        String str = "";

        for (String s : getJobDesc()) {
            str += "- Duty " + ++counter + ", " + s + "\n";
        }
        return getJobTitle() + "\n" +
                getCompany() + ", " + getStartDate() + " - " + getEndDate() + "\n"
                + str;
    }

}
