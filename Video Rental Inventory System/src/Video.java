public class Video
{
	private String videoName;
	private boolean checkout;
	private int rating;
	
	///Constructor
	public Video()
	{
		
	}
	public void setName(String name)
	{
		this.videoName = name;
	}
	public String getName()
	{
		return this.videoName;
	}
	public void doCheckout()
	{
		this.checkout = true;
	}
	public void doReturn()
	{
		this.checkout = false;
	}
	void receiveRating(int rating)
	{
		this.rating = rating;
	}
	public int getRating()
	{
			return this.rating;
	}
	public boolean getCheckout()
	{
		return this.checkout;
	}
}

