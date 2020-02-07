import java.util.ArrayList;

public class Recruiter {

    private ArrayList<Resume> resumeList;

    public Recruiter() {
        resumeList = new ArrayList();
    }

    public void addResume(Resume resume) {
       resumeList.add(resume);
    }

    public String getPeopleWithSkill(String skill) {
        String s = "";
        s += "\nList of people with the skill " + skill + ":\n";
        for (Resume resume : resumeList) {
            if (resume.getSkillsList().contains(skill)) {
                s += resume.getPersonName() + "\n";
            }
        }
        return s;
    }


}
