import java.util.Scanner;
public class VideoLauncher {

	public static VideoStore vs = new VideoStore();
	public static void main(String[] args)
	{

		vs.initialize();
		int userInput;
		while (true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos:");
			System.out.println("2.Check out Video:");
			System.out.println("3.Return Video:");
			System.out.println("4.Receive rating:");
			System.out.println("5.List Inventory:");
			System.out.println("6.Exit:\n");
			
			System.out.println("Enter your choice (1..6) : ");
			
			userInput = sc.nextInt();
			switch(userInput)
			{
				case 1:
					System.out.println("Enter the name of the video you want to add : ");
					String add_name = sc.next();
					vs.addVideo(add_name);
				break;
				case 2:
					System.out.println("Enter the name of the video you want to checkout : ");
					String checkout_name = sc.next();
					vs.doCheckout(checkout_name);
				break;
				case 3:
					System.out.println("Enter the name of the video you want to return : ");
					String return_name = sc.next();
					vs.doReturn(return_name);
				break;
				case 4:
					System.out.println("Enter the name of the video you want to rate : ");
					String rate_name = sc.next();
					System.out.println("Enter the rating for this video : ");
					int rating = sc.nextInt();
					vs.receiveRating(rate_name, rating);
				break;
				case 5:
					vs.listInventory();
				break;
				case 6:
					System.exit(0);
				break;
				default:
					System.out.println("Invalid Input!!\n");
				break;
					
				
					
			}
		}
	}

}