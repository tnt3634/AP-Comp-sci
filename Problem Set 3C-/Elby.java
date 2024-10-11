public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        String nothing = "";
    if (statement.trim() == nothing) {
        response = "Feeling talkative today?";
        }else if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        }else if (statement.indexOf("Hello") >= 0
        || statement.indexOf("Hi") >= 0
        || statement.indexOf("Hey") >= 0) {
            response = "Hello how are you";
        } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("pet") >= 0
        || statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0
        || statement.indexOf("frog") >= 0) {
            response = "Tell me more about your pets.";
        } else if (statement.indexOf("quentin") >=0
        || statement.indexOf("mr.") >= 0) {
            response = "He seems chill.";
        } else if (statement.indexOf("ms.") >= 0
        ||  statement.indexOf("mrs.") >= 0) {
            response = "She seems chill.";
        } else if (statement.indexOf("music") >= 0){
            response = "In music i like all types";
        } else if (statement.indexOf("song") >= 0){  
            response = "My favourite song is Hell on earth pt.2 by Westside Gunn";
        } else if  ( statement.indexOf("album") >= 0) {
            response = "the album Infection by The The is amazing"; 
        } else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 5;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        }else if (whichResponse == 4) {
            response = "Alrighty then.";
        }

        return response;
    }
}