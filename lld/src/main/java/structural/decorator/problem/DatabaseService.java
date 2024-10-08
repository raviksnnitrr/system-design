package structural.decorator.problem;

public class DatabaseService {
    public String getMailFromUsername(String userName){
        return userName + "@Mail";
    }

    public String getPhoneNumberFromUsername(String userName){
        return userName + "@Phone";
    }

    public String getFbNameFromUsername(String userName){
        return userName + "@FB";
    }
}
