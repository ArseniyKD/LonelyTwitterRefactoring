package ca.ualberta.cs.kouzmenk_lonelyTwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends LTSuperClass implements Serializable {

	private static final long serialVersionUID = 1L;
	protected Date tweetDate;
	protected String tweetBody;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		super(text, date);
	}

	public Date getDate() {
		return tweetDate;
	}

	public void setDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

	public String getBody() {
		return tweetBody;
	}

	public void setBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

	private void writeObjectToStream(java.io.ObjectOutputStream out) throws IOException {
		out.writeObject(tweetDate);
		out.writeObject(tweetBody);
	}

	private void readObjectFromStream(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		tweetDate = (Date) in.readObject();
		tweetBody = (String) in.readObject();
	}

	@Override
	public String toString() {
		return getDate() + " | " + getBody() ;
	}
}