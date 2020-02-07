import java.util.ArrayList;

public class Resume {

    private ArrayList<Education> eduList;
    private ArrayList<Experience> expList;
    private ArrayList<Skills> skillsList;

    public Resume() {
        eduList = new ArrayList<>();
        expList = new ArrayList<>();
        skillsList = new ArrayList<>();
    }

    public void addEducation(Education edu) {
        eduList.add(edu);
    }

    public void addExperience(Experience exp) {
        expList.add(exp);
    }

    public void addSkills(Skills skill) {
        skillsList.add(skill);
    }

    public String getEducation() {
        String s = "";

        for (Education e : eduList) {
            s += e.toString() + "\n";
        }
        return "Education\n----------\n" + s;
    }

    public String getExperience() {
        String s = "";

        for (Experience exp : expList) {
            s += exp.toString() + "\n";
        }
        return "Experience\n----------\n" + s;
    }

    public String getSkills() {
        String s = "";

        for (Skills skill : skillsList) {
            s += skill.toString() + "\n";
        }
        return "Skills\n----------\n" + s;
    }

}
