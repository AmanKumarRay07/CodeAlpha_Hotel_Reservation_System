import java.util.Scanner;
public class Hotel_Reservation_System {

  static Scanner sc=new Scanner(System.in);
  static int roomnumber[]={101,102,103,104,105};
  static String roomtype[]={"standard","Premium","Deluxe"," Executive"," Suite"};
  static int roomprice[]={1500,1800,2000,2500,3500};
  static boolean booked[] = {false, false, false, false, false};
  static String bookingID []={"B001","B002","B003","B004","B005"};
  static String customerName[] = new String[5];
static String mobileNo[] = new String[5];
static int days[] = new int[5];
  public static void main(String[] args) {
  
    header();
    int x;

    do{

      x=menu();

         switch (x) {
      case 1:
        System.out.println();
        System.out.println("=========AVAILABLE ROOM==========");
        System.out.println("Room_No               Room_Type            Room_Price");
        for(int i=0; i<roomnumber.length; i++)
        {

         System.out.println(" "+roomnumber[i]+"                  "+roomtype[i]+"                "+roomprice[i]);
        }
        System.out.println();
         break;
      
        case 2:
          System.out.println();
          System.out.println("=========Room Booking===========");

          System.out.print("Enter the Room No::");
          int r=sc.nextInt();
          boolean found=false;
          for(int i=0; i<roomnumber.length; i++)
          {
           if(roomnumber[i]==r)
           {
              found=true;
              if(booked[i]==false)
              {
                sc.nextLine();
                System.out.print("Enter the Customer Name::");
                String name=sc.nextLine();

                System.out.print("Enter the Phone No::");
                String mob=sc.next();

                System.out.print("No of Days:");
                int day=sc.nextInt();

                if (day <= 0) 
                {
                 System.out.println("Please enter valid number of days!");
                  break;
                }

                System.out.println("Room Price   ::"+roomprice[i]);
                int total=roomprice[i]*day;
                System.out.println("No of Days   ::"+day);
                System.out.println("Total Amount ::"+total);

                System.out.println("==========PAYMENT========");
                System.out.println("1. Pay Now");
                System.out.println("2. Cancel");
                System.out.print("Enter the Choice::");
                 int Choice2=sc.nextInt();
                 if(Choice2==1)
                 {
                  System.out.println("Payment Successful!");
                  booked[i] = true;
                 customerName[i] = name;
                mobileNo[i] = mob;
                days[i] = day;
                  System.out.println();
                  System.out.println("========== BOOKING CONFIRMED ==========");
                  System.out.println("Booking ID    :: "+bookingID[i]);
                  System.out.println("Customer Name :: "+name);
                  System.out.println("Room No       :: "+roomnumber[i]);
                  System.out.println("Room Category :: "+roomtype[i]);
                  System.out.println("Number of Days:: "+day);
                  System.out.println("Total Amount  :: "+total);
                  System.out.println("Booking Status::  Confirmed");
                  System.out.println();
                 }
                 else if(Choice2==2)
                 {
                  System.out.println("Booking Cancelled!");
                 }
                 else
                 {
                  System.out.println("Invalid Choice!");
                 }


               
              }
              else
              {
               System.out.println("Sorry! Room is already booked.");
              }
             
            }
            
          }
          if (found == false)
          {
            System.out.println("Invalid Room Number!");
          }
       
        break;

     case 3:
      System.out.println();
      System.out.println("=========VIEW BOOKING=============");

      System.out.print("Enter the Room_No::");
      int roomNo = sc.nextInt();
      boolean bookingFound = false;
      for (int i = 0; i < roomnumber.length; i++)
      {
        if (roomnumber[i] == roomNo)
          {

            bookingFound=true;
            if(booked[i]==true)
            {
              System.out.println("Booking ID    :: "+bookingID[i]);
              System.out.println("Customer Name :: "+customerName[i]);
              System.out.println("Room No       :: "+roomnumber[i]);
              System.out.println("Room Category :: "+roomtype[i]);
              System.out.println("Number of Days:: "+days[i]);
              System.out.println("Total Amount  :: "+roomprice[i] * days[i]);
              System.out.println("Booking Status::  Confirmed");
              System.out.println();
            }
            else
            {
              System.out.println("Room is Available! \n");
              
            }

          }

      }
      if (bookingFound == false)
      {
        System.out.println("Invalid Room  No \n");
      }
       break;

         case 4:
        System.out.println("=========CANCEL BOOKING===========");

        System.out.println("Enter the Room No :");
        int cancelroom =sc.nextInt();
        boolean roomFound = false;

        for(int i=0; i<roomnumber.length; i++)
        {
          if(roomnumber[i]==cancelroom)
          {
            roomFound=true;
            if(booked[i]==true)
            {
             
              System.out.println("=======Booking Details==========");
               System.out.println("Booking ID    :: "+bookingID[i]);
              System.out.println("Customer Name :: "+customerName[i]);
              System.out.println("Room No       :: "+roomnumber[i]);
              System.out.println("Room Category :: "+roomtype[i]);
              System.out.println("Number of Days:: "+days[i]);
              System.out.println("Total Amount  :: "+roomprice[i] * days[i]);
              System.out.println("Booking Status::  Confirmed");
              
              System.out.println("Are you sure you want to cancel");
              System.out.println("1. Yes, Cancel Booking");
              System.out.println("2.No Go Back");
              int choice3=sc.nextInt();

              if(choice3==1)
              {
                booked[i] = false;
                System.out.println("Booking Cancelled Successfully!");
              }
              else if(choice3==2)
              {
                System.out.println("Cancellation Aborted!");
              }
              else
              {
                System.out.println("Invalid Choice!");
              }
            }
            else
            {
              System.out.println("Room is not booked. Nothing to cancel.");
            }
          }
        }
        if (roomFound == false)
        {
          System.out.println("Invalid Room No");
        }

        break;

         case 5:
        System.out.println("=========EXIT=====================");
        break;

         case 6:
        
        break;
    
      default:
        System.out.println("Inter a valid number ");
        break;
    }
    }while(x!=6);

 
   

  }
  public static void header()
  {
    System.out.println("=====================================================================================================================");
    System.out.println("                                            HOTEL_RESERVATION_SYSTEM                                                 ");
    System.out.println("=====================================================================================================================");
  }
  public static int menu()
  {
    System.out.println("1. Search Available Rooms");
    System.out.println("2.Booking Room");
    System.out.println("3.View Booking Room");
    System.out.println("4.Cancel Booking");
    System.out.println("5.Exit");
    System.out.println();
    System.out.print("Enter your Choice::");
    int n=sc.nextInt();
     return n;

  }
 
  

}
