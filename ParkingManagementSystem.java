import java.util.Scanner;
class ShowData
{
    ShowData(String name,int N_slots,int[]  Veh_type,int[] N_days,int[] reg_no,int[] time,int[] amount,int r,int z)
    {   System.out.print("Customer's name is "+name.toUpperCase());
        System.out.println("\n");
        switch(Veh_type[z])
        {
        case 1:
        System.out.println("Vehicle type is Bike");
        System.out.println("*****************************");
        break;
        case 2:
        System.out.println("Customer's Vehicle type is Auto");
        System.out.println("**************************************");
        break;
        case 3:
        System.out.println("Customer's Vehicle type is Car");
        System.out.println("**************************************");
        break;
        default:
        System.out.println("\n");
        z=0;
        break;
        }
        if(z==0)
        {
            System.out.println("You are terminated because of wrong choice.");
            System.out.println("********************************************");
        }
        else
        {
        System.out.println("*The Number of Slots is* :"+N_slots);
        System.out.println("*****************************************");
        System.out.println("Customer's registration number is "+reg_no[z]);
        System.out.println("************************************************");
        if(N_days[z] == 0)
        {
        System.out.println("Customer's time for parking is " +time[z] + "hrs");
        System.out.println("****************************************************************");
        }
        else
        {
            System.out.println("Number of days for parking the is  "+N_days[z]);
            System.out.println("*****************************************************");
        }
        System.out.println("Customer's total Amount is : "+amount[z]);
        System.out.println("************************************************");
        }
}
}

class ParkingManagementSystem
{   
    public static void main(String args[]) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\t\t*****************************************************\t\t");
        System.out.println("\t\t*****************************************************\t\t");
        System.out.println("\t\t*Welcome to Maheshwari Parking management System*\t\t");
        System.out.println("\t\t*****************************************************\t\t");
        System.out.println("\t\t*****************************************************\t\t\n\n\n");
        System.out.println("\tPrices for Different types of Vehicles are as follows:");
        System.out.println("\t-----------------------------------------------------\n");
        System.out.println("\t Bikes or Any other 2 wheeler\t |\t $50/hr \t|\t $100/day\n");
        System.out.println("\t Auto or Any other 3 wheeler \t |\t $80/hr \t|\t $160/day\n");
        System.out.println("\t Car or Any other 4 wheeler  \t |\t $100/hr\t|\t $200/day\n");
        System.out.println("\n");
        
        int N_slots;
        int reg_no[];
        reg_no=new int[20];
        int time[];
        time=new int[20];
        int amount[];
        amount=new int[20];
        int Veh_type[];
        Veh_type=new int[20];
        int N_days[];
        N_days=new int[20];
        String name;
        System.out.println("Enter Customer's name: ");
        System.out.println("************************************************");
        name=scan.nextLine();
        System.out.println("Enter number of slots for parking the vehicle");
        System.out.println("************************************************");
        N_slots=scan.nextInt();
        for(int i=1;i<=N_slots;i++)
        {
            System.out.println("Enter the vehicle type which customer want to park \n1.Bike \n2.Auto \n3.Car");
            Veh_type[i]=scan.nextInt();
            System.out.println("******************************************************************************");
            System.out.println("Enter the one time registration number of "+name.toUpperCase());
            reg_no[i]=scan.nextInt();
            System.out.println("************************************************");

            System.out.println("Enter the Number of days for parking the vehicle");
            N_days[i]=scan.nextInt();
            System.out.println("************************************************");
            if(Veh_type[i]==1)
            
            {
                if(N_days[i]==0)
                {
                System.out.println("Enter time on hourly basis: ");
                time[i]=scan.nextInt();
                System.out.println("************************************************");
                amount[i]=time[i]*50;
                }
            
            else
            {
                amount[i]=N_days[i]*100;
            }
        }
           
            if(Veh_type[i]==2)
            {
                if(N_days[i]==0)
                {
                System.out.println("Enter time on hourly basis: ");
                time[i]=scan.nextInt();
                System.out.println("************************************************");
                amount[i]=time[i]*80;
                }
            
            else
            {
                amount[i]=N_days[i]*160;
            }
        }
            
            if(Veh_type[i]==3)
            {
                if(N_days[i]==0)
                {
                System.out.println("Enter time on hourly basis: ");
                System.out.println("************************************************");
                time[i]=scan.nextInt();
                amount[i]=time[i]*100;
                }
            
                else
             {
                amount[i]=N_days[i]*200;
             }
            }
            
        }
        int r,z=0;
        System.out.println("Enter registration number for billing : ");
        r=scan.nextInt();
        for(int i=1;i<=N_slots;i++)
        {
            if(r==reg_no[i])
            {
                z=i;
                ShowData d =  new ShowData(name,N_slots,Veh_type,N_days,reg_no,time,amount,r,z);
            }
            else
            {
                break;
            }
        }
       
           
        }
    }