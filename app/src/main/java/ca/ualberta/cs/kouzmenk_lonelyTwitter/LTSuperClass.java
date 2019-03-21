package ca.ualberta.cs.kouzmenk_lonelyTwitter;

import java.util.Date;

public class LTSuperClass {

    protected Date tweetDate;
    protected String tweetBody;

    public LTSuperClass(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    public LTSuperClass(){

    }


    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;
    }
}
