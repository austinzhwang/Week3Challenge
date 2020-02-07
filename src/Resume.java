import java.util.ArrayList;

public class Resume {

    private Person person;
    private ArrayList<Education> eduList;
    private ArrayList<Experience> expList;
    private ArrayList<Skills> skillsList;

    public Resume() {
        person = new Person();
        eduList = new ArrayList<>();
        expList = new ArrayList<>();
        skillsList = new ArrayList<>();
    }

    // Creates a new person object
    public void addPerson(Person person) {
        this.person = new Person(person.getName(), person.getEmail(), person.getPhoneNum());
    }

    public void updateName(String name) {
        this.person.setName(name);
    }

    public void updateEmail(String email) {
        this.person.setEmail(email);
    }

    public void updatePhoneNum(String phoneNum) {
        this.person.setPhoneNum(phoneNum);
    }

    // Adds an educational accomplishment to the array list of education objects
    public void addEducation(Education edu) {
        eduList.add(edu);
    }

    // Adds work experience to the array list of experience objects
    public void addExperience(Experience exp) {
        expList.add(exp);
    }

    // Adds a skill to the array list of Skills objects
    public void addSkills(Skills skill) {
        skillsList.add(skill);
    }

    // Returns string representation of a list of educational accomplishments
    public String getEducation() {
        String s = "";

        for (Education e : eduList) {
            s += e.toString() + "\n";
        }
        return "Education\n----------\n" + s;
    }

    // Returns string representation of a list of work experiences
    public String getExperience() {
        String s = "";

        for (Experience exp : expList) {
            s += exp.toString() + "\n";
        }
        return "Experience\n----------\n" + s;
    }

    // Returns string representation of a list of skills
    public String getSkills() {
        String s = "";

        for (Skills skill : skillsList) {
            s += skill.toString() + "\n";
        }
        return "Skills\n----------\n" + s;
    }

    public String getSkillsList() {
        String s = "";
        for (Skills skill : skillsList) {
            s += skill.getSkillName() + " ";
        }
        return s;
    }

    // Returns string representation of a list of person (name, email, phone #)
    public String getPerson() {
        String s = "";
        s += "\n================================================\n";
        s += person.toString();
        s += "\n================================================\n";
        return s;
    }

    public String getPersonName() {
        return person.getName();
    }

}
