
public class Review {
	Student writer;
	int rating;
	String feedback;
	Review(Student Writer,int Rating,String Feedback)
	{
		this.writer =Writer;
		this.rating = Rating;
		this.feedback = Feedback;
	}
	public Student getWriter() {
		return writer;
	}
	public int getRating() {
		return rating;
	}
	public String getFeedback() {
		return feedback;
	}
	

}
