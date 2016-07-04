
public class HelloGoogle {

    static {
        message = "Hello World!";
    }

    private final static String message;    

    public HelloGoogle() {}

    public static void main(String[] args) {
        System.out.println(new HelloGoogle().getMessage());
    }
    
    private final String getMessage() {
        return message;
    }

}