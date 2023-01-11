
public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
   
     public void throwCustomException() throws CustomException{
        int age=-2;
            if (age<0){
            throw new CustomException ("Age must not be negative");
        } 
        return;
            }
        }
         
        int even = 1;
            if (even%2 !=0){
            throw new CustomException ("You number is not even");
        }
        