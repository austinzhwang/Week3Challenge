import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> jobDescList = new ArrayList<>();

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        Resume resume = new Resume();
        int eduCount = 0, expCount = 0, skillsCount = 0;

        System.out.println("========================================================");
        System.out.println("Welcome to Robo Resume Generator!\n"
                + "\nYou must enter at least one educational achievement," +
                "\nat least one work experience, and" +
                " at least three skills.");
        System.out.println("========================================================\n");
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your email address: ");
        String email = in.nextLine();
        System.out.println();

        // Do-while checks to ensure user enters in at least one educational achievement
        do {
            String again;
            if (eduCount < 1) {
                eduInput(in, resume);
                eduCount++;
            } else if (eduCount >= 1) {
                System.out.print("Would you like to enter another educational achievement? (Y/N): ");
                again = in.nextLine();
                if (again.equalsIgnoreCase("y")) {
                    eduInput(in, resume);
                } else {
                    break;
                }
            } else {
                break;
            }
        } while (true);
        System.out.println();

        // Do while checks to ensure user enters in at least one work experience
        do {
            String again;
            if (expCount < 1) {
                expInput(in, resume);
                expCount++;
            } else if (expCount >= 1) {
                System.out.print("Would you like to enter another work experience? (Y/N): ");
                again = in.nextLine();
                if (again.equalsIgnoreCase("y")) {
                    expInput(in, resume);
                } else {
                    break;
                }
            } else {
                break;
            }
        } while (true);
        System.out.println();

        // Do-while checks to make sure user enters in at least three skills
        do {
            String again;
            if (skillsCount < 3) {
                skillsInput(in, resume);
                skillsCount++;
            } else if (skillsCount >= 3) {
                System.out.print("Would you like to enter another skill? (Y/N): ");
                again = in.nextLine();
                if (again.equalsIgnoreCase("y")) {
                    skillsInput(in, resume);
                } else {
                    break;
                }
            } else {
                break;
            }
        } while (true);

        // Outputs Resume
        System.out.println("\n================================================");
        System.out.println(name + "\n" + email);
        System.out.println("================================================\n");

        System.out.print(resume.getEducation());
        System.out.print(resume.getExperience());
        System.out.print(resume.getSkills());

    }

    // Private helper method for inputting user education
    private static void eduInput(Scanner in, Resume resume) {
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
    }

    // Private helper method for inputting user work experience
    private static void expInput(Scanner in, Resume resume) {
        System.out.print("Enter the company name that you worked for: ");
        String company = in.nextLine();
        System.out.print("Enter your job title: ");
        String jobTitle = in.nextLine();
        System.out.print("Enter the start date: ");
        String startDate = in.nextLine();
        System.out.print("Enter the end date: ");
        String endDate = in.nextLine();
        System.out.print("Enter a job description: ");
        String jobDesc = in.nextLine();
        jobDescList.add(jobDesc);
        // While loop lets user add more than one job description for the one job
        while (true) {
            System.out.print("Would you like to add another job description? (Y/N): ");
            String again = in.nextLine();
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
    }

    // Private helper method for inputting user skills
    private static void skillsInput(Scanner in, Resume resume) {
        System.out.print("Enter a skill: ");
        String skill = in.nextLine();
        System.out.print("Enter the proficiency level for that skill: ");
        String proficiency = in.nextLine();
        resume.addSkills(new Skills(skill, proficiency));
    }
}
