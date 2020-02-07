public class Person {

    private String name;
    private String email;
    private String phoneNum;

    public Person() {

    }

    public Person(String name, String email, String phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    // String representation of a person object
    public String toString() {
        String pn = "", s = "";

        if (phoneNum.length() == 10) {
            pn += phoneNum.substring(0,3) + "-" + phoneNum.substring(3,6) + "-" + phoneNum.substring(6);
        } else {
            pn += phoneNum;
        }
        s += getName() + "\n" + getEmail() + "\n" + pn;
        return s;
    }
}
