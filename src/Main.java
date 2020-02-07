import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> jobDescList = new ArrayList<>();

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Welcome to Robo Resume Generator!\n"
                + "\nThis program allows you to add educational " +
                "\nachievements, work experience, and skills.");
        System.out.println("===========================================\n");

        String anotherPerson;
        Recruiter recruiter = new Recruiter();

        do {
            Resume resume = new Resume();
            System.out.print("Enter your name: ");
            String name = in.nextLine();
            System.out.print("Enter your email address: ");
            String email = in.nextLine();
            System.out.print("Enter your phone #: ");
            String phoneNum = in.nextLine();
            Person p = new Person(name, email, phoneNum);
            resume.addPerson(p);
            System.out.println();

            String enter;
            System.out.print("Would you like to update your information? (Y/N): ");
            enter = in.nextLine();
            if (enter.equalsIgnoreCase("y")) {
                System.out.print("Enter your new name: ");
                String newName = in.nextLine();
                resume.updateName(newName);
                System.out.print("Enter your new email address: ");
                String newEmail = in.nextLine();
                resume.updateEmail(newEmail);
                System.out.print("Enter your new phone #: ");
                String newNum = in.nextLine();
                resume.updatePhoneNum(newNum);
            }

            System.out.print("Would you like to add an educational achievement? (Y/N): ");
            enter = in.nextLine();
            if (enter.equalsIgnoreCase("y")) {
                eduInput(in, resume);
            }
            System.out.println();

            System.out.print("Would you like to add work experience? (Y/N): ");
            enter = in.nextLine();
            if (enter.equalsIgnoreCase("y")) {
                expInput(in, resume);
            }
            System.out.println();

            System.out.print("Would you like to add a skill? (Y/N): ");
            enter = in.nextLine();
            if (enter.equalsIgnoreCase("y")) {
                skillsInput(in, resume);
            }
            System.out.println();

            // Outputs Resume
            System.out.println(resume.getPerson());
            System.out.print(resume.getEducation());
            System.out.print(resume.getExperience());
            System.out.print(resume.getSkills());
            recruiter.addResume(resume);
            System.out.print("\nWould you like to enter information for another person?: (Y/N): ");
            anotherPerson = in.nextLine();
        } while (anotherPerson.equalsIgnoreCase("y"));

        System.out.println("\n===========================================");
        System.out.println("Welcome to Robo Recruiter Resume Search!\n"
                + "\nThis program allows you to search through " +
                "\nresumes and find people with a particular skill.");
        System.out.println("===========================================\n");

        System.out.print("Enter a skill to search: ");
        String skill = in.nextLine();
        System.out.println(recruiter.getPeopleWithSkill(skill));
    }

    // Private helper method for inputting user education
    private static void eduInput(Scanner in, Resume resume) {
        String again;

        do {
            System.out.print("Enter your degree type: ");
            String degreeType = in.nextLine();
            System.out.print("Enter your major: ");
            String major = in.nextLine();
            System.out.print("Enter your university name: ");
            String uniName = in.nextLine();
            System.out.print("Enter your graduation year: ");
            int gradYear = in.nextInt();
            resume.addEducation(new Education(degreeType, major, uniName, gradYear));
            in.nextLine();
            System.out.print("Would you like to add another educational achievement? (Y/N): ");
            again = in.nextLine();
        } while (again.equalsIgnoreCase("y"));
    }

    // Private helper method for inputting user work experience
    private static void expInput(Scanner in, Resume resume) {
        String jobDesc, company, jobTitle, startDate, endDate, again;

        do {
            System.out.print("Enter the company name: ");
            company = in.nextLine();
            System.out.print("Enter your job title: ");
            jobTitle = in.nextLine();
            System.out.print("Enter the start date: ");
            startDate = in.nextLine();
            System.out.print("Enter the end date: ");
            endDate = in.nextLine();
            System.out.print("Enter a job description: ");
            jobDesc = in.nextLine();
            jobDescList.add(jobDesc);
            // While loop lets user add more than one job description for the one job
            while (true) {
                System.out.print("Would you like to add another job description? (Y/N): ");
                again = in.nextLine();
                if (again.equalsIgnoreCase("y")) {
                    System.out.print("Enter a job description: ");
                    jobDesc = in.nextLine();
                    jobDescList.add(jobDesc);
                } else {
                    break;
                }
            }
            resume.addExperience(new Experience(company, jobTitle, startDate, endDate, jobDescList));
            jobDescList = new ArrayList<>();
            System.out.print("Would you like to add more work experience? (Y/N): ");
            again = in.nextLine();
        } while (again.equalsIgnoreCase("y"));
    }

    // Private helper method for inputting user skills
    private static void skillsInput(Scanner in, Resume resume) {
       String again;

       do {
           System.out.print("Enter a skill: ");
           String skill = in.nextLine();
           System.out.print("Enter the proficiency level for that skill: ");
           String proficiency = in.nextLine();
           resume.addSkills(new Skills(skill, proficiency));
           System.out.print("Would you like to add another skill? (Y/N): ");
           again = in.nextLine();
       } while (again.equalsIgnoreCase("y"));
    }
}
