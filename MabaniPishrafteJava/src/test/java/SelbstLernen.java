import org.junit.jupiter.api.Test;

public class SelbstLernen {
    @Test

    void boolen() {

        boolean condition1 = true;
        boolean condition2 = false;
        boolean result     = condition1 || condition2;
        System.out.println(result);

        if(condition1) {
            System.out.println("Die Aussage ist Wahr.");
        }
        else if(condition2){
                System.out.println("Entweder richtig oder fasch ist");
            }
        else {
            System.out.println("Die Aussage ist falsh");
        }
    }
}
