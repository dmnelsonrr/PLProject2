package Nelson.business;

public class Employee extends Person{

    private double socialSecurity;

    public Employee() {
        socialSecurity = 0;
    }

    public void setSocialSecurity(double socialSecurity){ this.socialSecurity = socialSecurity;}
    public double getSocialSecurity() { return socialSecurity;}

    public String getDisplayText(){
        String social = new String(Double.toString(socialSecurity));
        return super.toString() + "\nSocial security number: "
                + social.substring(0, 1) + social.substring(2, 4) + "-"
                + social.substring(4, 6) + "-"
                + social.substring(6, 10);
    }

}
