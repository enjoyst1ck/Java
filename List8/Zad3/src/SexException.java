public class SexException extends Exception{
    String sex;

    SexException(String sex){
        this.sex = sex;
    }

    @Override
    public String getMessage(){
        return sex + " nie zgadza się z podanym imieniem.";
    }
}