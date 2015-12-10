package learning;

public class CalculateString {

    public void method() {
        String last4;
        String last3 = "";
        String str = "";
        if (str == null || str.length() < 4)
        {
            last3 = str;
        } else
        {
            last3 = str.substring(str.length() - 4);
        }
    }
}