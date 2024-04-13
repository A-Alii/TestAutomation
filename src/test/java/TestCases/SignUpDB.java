package TestCases;

import org.testng.annotations.DataProvider;

public class SignUpDB {
    @DataProvider(name = "signUp-provider")
    public static Object [] [] signUpData ()
    {
        Object [] [] data = new Object [1] [3];
        data [0] [0] = "ahmedali123@gmail.com";			data [0] [1] = "admin123";		data [0] [2] = true;
        return data;
    }
}
