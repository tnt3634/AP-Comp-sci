
class StringTools {

    String str;
    public String lastLetter(String str) {
        int length = str.length();

        return str.substring(str.length() - 1);

    }

    public String formatPhoneNumber(String str1){

        return "(" + str1.substring(0,3) + ")" + " " + str1.substring(3,6) + "-" + str1.substring(6,10);

    }

    public String middleThree(String str) {

        int middlestr = str.length()/2;
        return str.substring(middlestr - 1, middlestr + 2);

    }

    public String swapLastTwo(String str) {

        int lastDig = str.length() - 1;
        int secondlastDig = str.length() - 1;
        int everythingbefore = str.length(); 
        return str.substring(0, everythingbefore - 2 ) + str.substring(lastDig) +
        str.substring(str.length() - 2,secondlastDig);

    }

    public boolean frontAgain(String str, int n){

        return str.substring(0,n).equals(str.substring(str.length() - n));

    }

}


