public class FirstSecondNameException extends Exception{
    String name;

    FirstSecondNameException(String name){
        this.name = name;
    }

    @Override
    public String getMessage(){
        return name + " jest niewłaściwe.";
    }
}