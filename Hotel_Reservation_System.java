import java.util.Scanner;
public class Hotel_Reservation_System {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    header();
    hotel(0);

  }
  public static void header()
  {
    System.out.println("=====================================================================================================================");
    System.out.println("                                            HOTEL_RESERVATION_SYSTEM                                                 ");
    System.out.println("=====================================================================================================================");
  }
  public static void menu(int n)
  {
    System.out.println("1. Search Available Rooms");
    System.out.println("2.Booking Room");
    System.out.println("3.View Booking Room");
    System.out.println("4.Cancel Booking");
    System.out.println("5.Exit");
    System.out.println("Enter your Choice::");
    int n=sc.nextInt();
  }

}
