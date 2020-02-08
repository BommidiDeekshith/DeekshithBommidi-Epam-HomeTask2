package deeks.epam.EpamAssignment;

import java.util.Scanner;

public class GiftBoxWeight {

	public static void main(String[] args)
	{
		System.out.println("Select the Sweets to add into Your GiftBox");
		Scanner sc=new Scanner(System.in);
		int to_wt=0,q=0,w=0,tb_wt=0,d,a[]=new int[5];
		String s[]= {"Barfi","Kulfi","Ferrero Rocher","Miniatures","Signature"};
		sweet current;
		Boolean isTrue=true;
		while(isTrue)
		{
			System.out.println("Available Sweets and Choclates with us are:");
			System.out.println("1.Barfi\n2.Kulfi\n3.Ferrero Rocher\n4.Miniatures\n5.Signature\n");
			System.out.println("Select using Numbers\nEnter the number of the Sweet:");
			d =sc.nextInt();
			switch(d)
			{
			
			case 1:
				System.out.println("Enter the quantity of Barfi:");
				q=sc.nextInt();
				System.out.println("Enter the weight of Barfi in grams:");
				w=sc.nextInt();
				current = new barfi();
				to_wt=current.calc(q,w);
				tb_wt+=to_wt;
				a[d-1]+=to_wt;
				System.out.println("Total weight of Barfi is:"+to_wt+"grams");
	        	System.out.println("Total weight of gift box is:"+tb_wt+"grams");
	        	System.out.println("Do you want any other item (0/1):");
	        	isTrue=sc.nextBoolean();
	        	if(isTrue)
    	        { 
    	    	  isTrue=true;
    	          break;
    	        }
    	     else
    		    {
    	    	 isTrue=false;
                 System.out.println("Total weight of gift box is:"+to_wt+"grams");
                 break;
                }
	        	
	        	
			case 2:
				System.out.println("Enter the quantity of Kulfi:");
				q=sc.nextInt();
				System.out.println("Enter the weight of Kulfi in grams:");
				w=sc.nextInt();
				current = new kulfi();
				to_wt=current.calc(q,w);
				tb_wt+=to_wt;
				a[d-1]+=to_wt;
				System.out.println("Total weight of Kulfi is:"+to_wt+"grams");
	        	System.out.println("Total weight of gift box is:"+tb_wt+"grams");
	        	System.out.println("Do you want any other item (0/1):");
	        	isTrue=sc.nextBoolean();
	        	if(isTrue)
    	        { 
    	    	  isTrue=true;
    	          break;
    	        }
    	     else
    		    {
    	    	 isTrue=false;
                 System.out.println("Total weight of gift box is:"+to_wt+"grams");
                 break;
                }
	        	
	        	
	        	
			case 3:
				System.out.println("Enter the quantity of Ferrero Rocher:");
				q=sc.nextInt();
				System.out.println("Enter the weight of Ferrero Rocher in grams:");
				w=sc.nextInt();
				current = new ferrero();
				to_wt=current.calc(q,w);
				tb_wt+=to_wt;
				a[d-1]+=to_wt;
				System.out.println("Total weight of Ferrero Rocher is:"+to_wt+"grams");
	        	System.out.println("Total weight of gift box is:"+tb_wt+"grams");
	        	System.out.println("Do you want any other item (0/1):");
	        	isTrue=sc.nextBoolean();
	        	if(isTrue)
    	        { 
    	    	  isTrue=true;
    	          break;
    	        }
    	     else
    		    {
    	    	 isTrue=false;
                 System.out.println("Total weight of gift box is:"+to_wt+"grams");
                 break;
                }
	        	
                
			case 4:
				System.out.println("Enter the quantity of Miniature:");
				q=sc.nextInt();
				System.out.println("Enter the weight of Miniature in grams:");
				w=sc.nextInt();
				current = new miniature();
				to_wt=current.calc(q,w);
				tb_wt+=to_wt;
				a[d-1]+=to_wt;
				System.out.println("Total weight of Miniatures is:"+to_wt+"grams");
	        	System.out.println("Total weight of gift box is:"+tb_wt+"grams");
	        	System.out.println("Do you want any other item (0/1):");
	        	isTrue=sc.nextBoolean();
	        	if(isTrue)
    	        { 
    	    	  isTrue=true;
    	          break;
    	        }
    	     else
    		    {
    	    	 isTrue=false;
                 System.out.println("Total weight of gift box is:"+to_wt+"grams");
                 break;
                }
			
			
	        	
			case 5:
				System.out.println("Enter the quantity of Signature:");
				q=sc.nextInt();
				System.out.println("Enter the weight of Signature in grams:");
				w=sc.nextInt();
				current = new signature();
				to_wt=current.calc(q,w);
				tb_wt+=to_wt;
				a[d-1]+=to_wt;
				System.out.println("Total weight of Signature is:"+to_wt+"grams");
	        	System.out.println("Total weight of gift box is:"+tb_wt+"grams");
	        	System.out.println("Do you want any other item (0/1):");
	        	isTrue=sc.nextBoolean();
	        	if(isTrue)
    	        { 
    	    	  isTrue=true;
    	          break;
    	        }
    	     else
    		    {
    	    	 isTrue=false;
                 System.out.println("Total weight of gift box is:"+to_wt+"grams");
                 break;
                }
	        	
	        	
	        	default:System.out.println("Plaese Select a valid Sweet using the options ranged between 1-5:");
			
			}
		}
		
		System.out.println("Enter the starting range of weight in Grams: ");
		int sw,ew;
		sw=sc.nextInt();
		System.out.println("Enter the ending range of weight in Grams: ");
		ew=sc.nextInt();
		
		int i;
		for(i=0;i<5;i++)
		{
			if(a[i]>=sw && a[i]<=ew)
			{
				System.out.println(i+1+"."+s[i]);
				System.out.println("  Weight:"+a[i]);
				
			}
		}
		
		
		sc.close();
	}
	
	
}
