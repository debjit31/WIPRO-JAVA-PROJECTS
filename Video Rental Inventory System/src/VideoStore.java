public class VideoStore
{
	public static int i = 0;
	public static Video store[] = new Video[100];
	public void addVideo(String name)
	{
		store[i++].setName(name);
		System.out.println("Video " + name + " added successfully\n");
	}
	public void doCheckout(String name)
	{
		for(int i=0;i<store.length; i++)
		{
			if(store[i].getName().equals(name))
			{
				store[i].doCheckout();
				break;
			}
		}
		System.out.println("Video " + name + "checked out successfully\n");
	}
	public void doReturn(String name)
	{
		for(int i=0;i<store.length; i++)
		{
			if(store[i].getName().equals(name))
			{
				store[i].doReturn();
				break;
			}
		}
		System.out.println("Video " + name + "returned successfully\n");
	}
	public void receiveRating(String name, int rating)
	{
		for(int i=0;i<store.length; i++)
		{
			if(store[i].getName().equals(name))
			{
				store[i].receiveRating(rating);
				break;
			}
		}
	}
	public void listInventory()
	{
		for(int i=0; i<VideoStore.i; i++)
		{
			System.out.println("Video Name :- " + store[i].getName());
			System.out.println("Checkout Status :- " + store[i].getCheckout());
			System.out.println("Rating :- " + store[i].getRating());
			System.out.print("\n");
		}
	}
	public void initialize()
	{
		for(int t=0;t<store.length; t++) {
			store[t] = new Video();
		}
			
	}
}