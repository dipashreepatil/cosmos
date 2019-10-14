package SRTF;
import java.util.*;
class process
{
	int at,bt,wt,ct,tt,rt,f;
	int n,np=0;
	int i;
	
	
	  process p[]= new process [20];  
	  process p1[]=new process[50];
	Scanner sc =new Scanner(System.in);
	
    public void accept()
    {
        System.out.println("\n\t Enter the number of processes: ");
        n=sc.nextInt();
    
     System.out.println("\n\t Enter the processes and their burst time : ");
     for(i=0;i<n;i++)
     {
    	 p[i]=new process();
    	System.out.println("\n\t Enter the process number: ");
    	 p[i].np=sc.nextInt();
    	 System.out.println("\n\t Enter the arrival time of the process P"+p[i].np+" : ");
    	 p[i].at=sc.nextInt();
    	 System.out.println("\n\t Enter the burst time of the process: ");
    	 p[i].bt=sc.nextInt();
    	 p[i].rt=p[i].bt;
    	 p[i].ct=0;
    	 p[i].wt=0;
    	 p[i].tt=0;
    	 p[i].f=0;
     }
    }
   public void running()
   {
	   int systime=0,completedpr=0;
	   System.out.println("\n\t The Gantt chart is: ");
		 
	  while(true)
	  { int min=99;
	  int c=n;
		  if(completedpr==n)
		  {
			  break;
		  }
		   for(i=0;i<n;i++)
		   {
			   if((p[i].at<=systime) && (p[i].f==0) && (p[i].rt<min))
			   {
				   min=p[i].rt;
				   c=i;
				
			   }
		   }
		   if(c==n)  // no process whose at<systime
		   {
			   systime=systime+1;
			   
		   }
		   else
		   {
			   System.out.print("\t P"+p[c].np+"  |");
			   p[c].rt=p[c].rt-1;
			   systime=systime+1;
			   
			   if(p[c].rt==0)
			   {
				   p[c].ct=systime;
				   completedpr++;
				   p[c].f=1;
			   }
		   }
			   
	  }
	  System.out.println(" ");
	  for(i=1;i<systime;i++)
  	      {
  		System.out.print("\t     "+i);
         	}
	   }
   
   public void calculate()
   {
	   for(i=0;i<n;i++)
	   {
		   p[i].tt=p[i].ct-p[i].at;
		   p[i].wt=p[i].tt-p[i].bt;
	   }
   }
   public void display()
   {
		System.out.println(" ");
   	System.out.println("\n\t PROCESS    AT    BT    CT    TT    WT");
   
   	for(i=0;i<n;i++)
   	{
   		System.out.println("\n\t  P"+p[i].np+"       "+p[i].at+"     "+p[i].bt+"       "+p[i].ct+"    "+p[i].tt+"    "+p[i].wt);
   	}
   }
   }

public class SRTF
{
	public static void main(String args[])
	{
		process pt=new process();
		pt.accept();
		pt.running();
		pt.calculate();
		pt.display();
	}
	
}
