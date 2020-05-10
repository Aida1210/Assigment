package Assigment2;

public class Password {
    // passwordStr // it should contain uppercase and lowercase letters and digits
        // passwordStr // it should contain uppercase and lowercase letters and digits
        // and its length must be more than 9 symbols
    private String password;

        public Password(){
        }

        public boolean setPassword(String password) {
            if(isValid(password)){
                this.password = password;
                return true;
            }
            else{
                return false;
            }
        }

        public String getPassword() {
            return password;
        }
    private static boolean containsUpperCase(String word) {
        int ndx;
        char ch;
        boolean t=false;
        char[] letter=word.toCharArray();
        for(ndx = 0; ndx < word.length(); ndx++) {
            ch = letter[ndx];
            if (ch <='Z'&&ch>='A') {
                t=true;
            }
        }
        return t;
    }
    private boolean containsLowerCase(String word) {
        int ndx;
        char ch;
        boolean t=false;
        char[] letter=word.toCharArray();
        for(ndx = 0; ndx < word.length(); ndx++) {
            ch = letter[ndx];
            if (ch <='a'+32&&ch>='z'-32) {//the same as ch>='a' && ch<='z'

                t=true;
            }
        }
        return t;
    }
    private boolean isDigit(String word) {
        int ndx;
        char ch;
        boolean t=false;
        char[] letter=word.toCharArray();


        for(ndx = 0; ndx < word.length(); ndx++) {
            ch = letter[ndx];
            if (ch <='9'&&ch>='0') {

                t=true;
            }
        }
        return t;
    }
    private static boolean isValid(String password)
    {
        boolean goodSoFar = true;
        int index = 0;


        if (password.length() < 6)//at least 6 characters
            goodSoFar = true;
        return goodSoFar;
        if(containsUpperCase(password)==false)
            goodSoFar=false;
        return goodSoFar;
        if(containsLowerCase(password)==false)
            goodSoFar=false;
        return goodSoFar;
        if(isDigit(password)==false)
            goodSoFar=false;
        return goodSoFar;
        return goodSoFar;
    }
}
