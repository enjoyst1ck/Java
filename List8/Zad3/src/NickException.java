public class NickException extends Exception{
    String nick;

    NickException(String nick){
        this.nick = nick;
    }

    @Override
    public String getMessage(){
        return "Twoja nazwa " + nick + " jest niewłaściwa";
    }
}
