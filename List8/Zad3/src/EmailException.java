public class EmailException extends Exception{
    String email;

    EmailException(String email){
        this.email = email;
    }

    @Override
    public String getMessage(){
        return "Email: " + email + " jest niewłaściwy.";
    }
}