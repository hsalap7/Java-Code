import javax.swing.JOptionPane;
import java.util.Scanner;
class BookMyShow
{
	static Scanner sc=new Scanner(System.in);
	String movie_name;
	String time_of_movie;
	String type_of_ticket;
	static int A_ntt_total=50, A_ttt_total=50, A_tts_total=50, A_stn_total=50;
	static int P_ntt_total=50, P_ttt_total=50, P_tts_total=50, P_stn_total=50;
	static int G_ntt_total=50, G_ttt_total=50, G_tts_total=50, G_stn_total=50;
	static int B_ntt_total=50, B_ttt_total=50, B_tts_total=50, B_stn_total=50;
	static int platinumA_ntt=5, goldA_ntt=15, silverA_ntt=30, platinumA_ttt=5, goldA_ttt=15, silverA_ttt=30, platinumA_tts=5, goldA_tts=15, silverA_tts=30, platinumA_stn=5, goldA_stn=15, silverA_stn=30;
	static int platinumP_ntt=5, goldP_ntt=15, silverP_ntt=30, platinumP_ttt=5, goldP_ttt=15, silverP_ttt=30, platinumP_tts=5, goldP_tts=15, silverP_tts=30, platinumP_stn=5, goldP_stn=15, silverP_stn=30;
	static int platinumG_ntt=5, goldG_ntt=15, silverG_ntt=30, platinumG_ttt=5, goldG_ttt=15, silverG_ttt=30, platinumG_tts=5, goldG_tts=15, silverG_tts=30, platinumG_stn=5, goldG_stn=15, silverG_stn=30;
	static int platinumB_ntt=5, goldB_ntt=15, silverB_ntt=30, platinumB_ttt=5, goldB_ttt=15, silverB_ttt=30, platinumB_tts=5, goldB_tts=15, silverB_tts=30, platinumB_stn=5, goldB_stn=15, silverB_stn=30;
	
	void movieList()
	{
		System.out.println("Select 1 for Avengers 2 for Piku 3 for Gabbar 4 for Bombay Velvet");
		int movie_input=sc.nextInt();
		if(movie_input==1)
		{
			movie_name="Avengers";
		}
		if(movie_input==2)
		{
			movie_name="Piku";
		}
		if(movie_input==3)
		{
			movie_name="Gabbar";
		}
		if(movie_input==4)
		{
			movie_name="Bombay Velvet";
		}
	}
	
	void timing()
	{
		System.out.println("These timings are available for your selected movie\n");
		System.out.println(" 9-12      12-3        3-6         6-9\n");
		System.out.println("Enter 1 for (9-12)  2 for (12-3)  3 for (3-2)   4 for (6-9)");
		int time=sc.nextInt();
		if(time==1)
		{
			time_of_movie="9-12";
		}
		if(time==2)
		{
			time_of_movie="12-3";
		}
		if(time==3)
		{
			time_of_movie="3-6";	
		}
		if(time==4)
		{
			time_of_movie="6-9";	
		}
	
	}
	
	void ticketType()
	{
		System.out.println("These types of ticket are available\n");
		System.out.println(" (1) Platinum      (2) Gold       (3) Silver\n");
		System.out.println("Enter 1 for Platinum  2 for Gold  3 for Silver:");
		int type=sc.nextInt();
		if(type==1)
		{
			type_of_ticket="Platinum";
		}
		if(type==2)
		{
			type_of_ticket="Gold";
		}
		if(type==3)
		{
			type_of_ticket="Silver";
		}		
	}	
	
	void bookSeat()
	{
		if(movie_name=="Avengers" )
		{
			if(time_of_movie=="9-12")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumA_ntt!=0)
						platinumA_ntt=platinumA_ntt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldA_ntt!=0)
						goldA_ntt=goldA_ntt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverA_ntt!=0)
						silverA_ntt=silverA_ntt-1;
				}
			A_ntt_total=A_ntt_total-1;
			
			if(A_ntt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumA_ntt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldA_ntt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverA_ntt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="12-3")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumA_ttt!=0)
						platinumA_ttt=platinumA_ttt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldA_ttt!=0)
						goldA_ttt=goldA_ttt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverA_ttt!=0)
						silverA_ttt=silverA_ttt-1;
				}
			A_ttt_total=A_ttt_total-1;
			
			if(A_ttt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumA_ttt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldA_ttt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverA_ttt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="3-6")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumA_tts!=0)
						platinumA_tts=platinumA_tts-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldA_tts!=0)
						goldA_tts=goldA_tts-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverA_tts!=0)
						silverA_tts=silverA_tts-1;
				}
			A_tts_total=A_tts_total-1;
			
			if(A_tts_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumA_tts==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldA_tts==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverA_tts==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="6-9")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumA_stn!=0)
						platinumA_stn=platinumA_stn-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldA_stn!=0)
						goldA_stn=goldA_stn-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverA_stn!=0)
						silverA_stn=silverA_stn-1;
				}
			A_stn_total=A_stn_total-1;
			
			if(A_stn_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumA_stn==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldA_stn==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverA_stn==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
		}
		
		if(movie_name=="Piku" )
		{
			if(time_of_movie=="9-12")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumP_ntt!=0)
						platinumP_ntt=platinumP_ntt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldP_ntt!=0)
						goldP_ntt=goldP_ntt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverP_ntt!=0)
						silverP_ntt=silverP_ntt-1;
				}
			P_ntt_total=P_ntt_total-1;
			
			if(P_ntt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumP_ntt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldP_ntt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverP_ntt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="12-3")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumP_ttt!=0)
						platinumP_ttt=platinumP_ttt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldP_ttt!=0)
						goldP_ttt=goldP_ttt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverP_ttt!=0)
						silverP_ttt=silverP_ttt-1;
				}
			P_ttt_total=P_ttt_total-1;
			
			if(P_ttt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumP_ttt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldP_ttt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverP_ttt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="3-6")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumP_tts!=0)
						platinumP_tts=platinumP_tts-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldP_tts!=0)
						goldP_tts=goldP_tts-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverP_tts!=0)
						silverP_tts=silverP_tts-1;
				}
			P_tts_total=P_tts_total-1;
			
			if(P_tts_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumP_tts==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldP_tts==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverP_tts==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="6-9")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumP_stn!=0)
						platinumP_stn=platinumP_stn-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldP_stn!=0)
						goldP_stn=goldP_stn-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverP_stn!=0)
						silverP_stn=silverP_stn-1;
				}
			P_stn_total=P_stn_total-1;
			
			if(P_stn_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumP_stn==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldP_stn==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverP_stn==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
		}
		
		if(movie_name=="Gabbar" )
		{
			if(time_of_movie=="9-12")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumG_ntt!=0)
						platinumG_ntt=platinumG_ntt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldG_ntt!=0)
						goldG_ntt=goldG_ntt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverG_ntt!=0)
						silverG_ntt=silverG_ntt-1;
				}
			G_ntt_total=G_ntt_total-1;
			
			if(G_ntt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumG_ntt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldG_ntt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverG_ntt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="12-3")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumG_ttt!=0)
						platinumG_ttt=platinumG_ttt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldG_ttt!=0)
						goldG_ttt=goldG_ttt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverG_ttt!=0)
						silverG_ttt=silverG_ttt-1;
				}
			G_ttt_total=G_ttt_total-1;
			
			if(G_ttt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumG_ttt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldG_ttt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverG_ttt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="3-6")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumG_tts!=0)
						platinumG_tts=platinumG_tts-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldG_tts!=0)
						goldG_tts=goldG_tts-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverG_tts!=0)
						silverG_tts=silverG_tts-1;
				}
			G_tts_total=G_tts_total-1;
			
			if(G_tts_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumG_tts==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldG_tts==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverG_tts==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="6-9")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumG_stn!=0)
						platinumG_stn=platinumG_stn-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldG_stn!=0)
						goldG_stn=goldG_stn-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverG_stn!=0)
						silverG_stn=silverG_stn-1;
				}
			G_stn_total=G_stn_total-1;
			
			if(G_stn_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumG_stn==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldG_stn==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverG_stn==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
		}
		
		if(movie_name=="Bombay Velvet" )
		{
			if(time_of_movie=="9-12")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumB_ntt!=0)
						platinumB_ntt=platinumB_ntt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldB_ntt!=0)
						goldB_ntt=goldB_ntt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverB_ntt!=0)
						silverB_ntt=silverB_ntt-1;
				}
			B_ntt_total=B_ntt_total-1;
			
			if(B_ntt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumB_ntt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldB_ntt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverB_ntt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="12-3")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumB_ttt!=0)
						platinumB_ttt=platinumB_ttt-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldB_ttt!=0)
						goldB_ttt=goldB_ttt-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverB_ttt!=0)
						silverB_ttt=silverB_ttt-1;
				}
			B_ttt_total=B_ttt_total-1;
			
			if(B_ttt_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumB_ttt==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldB_ttt==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverB_ttt==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="3-6")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumB_tts!=0)
						platinumB_tts=platinumB_tts-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldB_tts!=0)
						goldB_tts=goldB_tts-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverB_tts!=0)
						silverB_tts=silverB_tts-1;
				}
			B_tts_total=B_tts_total-1;
			
			if(B_tts_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumB_tts==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldB_tts==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverB_tts==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
			
			if(time_of_movie=="6-9")
			{
				if(type_of_ticket=="Platinum")
				{
					if(platinumB_stn!=0)
						platinumB_stn=platinumB_stn-1;
				}
				if(type_of_ticket=="Gold")
				{
					if(goldB_stn!=0)
						goldB_stn=goldB_stn-1;
				}
				if(type_of_ticket=="Silver")
				{
					if(silverB_stn!=0)
						silverB_stn=silverB_stn-1;
				}
			B_stn_total=B_stn_total-1;
			
			if(B_stn_total==0)
				System.out.println("Sorry no tickets Available");
			if(platinumB_stn==0)
				System.out.println("Sorry no tickets Available in platinum section");
			if(goldB_stn==0)
				System.out.println("Sorry no tickets Available in gold section");
			if(silverB_stn==0)
				System.out.println("Sorry no tickets Available in silver section");
			}
		}
		
	}
	
	static void show()
	{
		{
			String message="                                                                                                                 Timings\n"+ 
			               "                                                                                                         Seats Availability                                                \n"+
						   "Movies Name     |         9.00am-12.00pm           12.00pm-03.00pm          03.00pm-06.00pm           06.00pm-09.00pm\n"+
						   "_____________|_______________________________________________________________________________\n"+
						   "                              |  Platinum | Gold | Silver || Platinum | Gold | Silver || Platinum | Gold | Silver || Platinum | Gold | Silver\n"+
						   "Avengers            |     "+platinumA_ntt+"     |     "+goldA_ntt+"|"+silverA_ntt+"||"+platinumA_ttt+"|"+goldA_ttt+"|"+silverA_ttt+"||"+platinumA_tts+"|"+goldA_tts+"|"+silverA_tts+"||"+platinumA_stn+"|"+goldA_stn+"|"+silverA_stn+"\n"+
						   "Piku                     |     "+platinumP_ntt+"     |     "+goldP_ntt+"|"+silverP_ntt+"||"+platinumP_ttt+"|"+goldP_ttt+"|"+silverP_ttt+"||"+platinumP_tts+"|"+goldP_tts+"|"+silverP_tts+"||"+platinumP_stn+"|"+goldP_stn+"|"+silverP_stn+"\n"+
						   "Gabbar                |"+platinumG_ntt+"|"+goldG_ntt+"|"+silverG_ntt+"||"+platinumG_ttt+"|"+goldG_ttt+"|"+silverG_ttt+"||"+platinumG_tts+"|"+goldG_tts+"|"+silverG_tts+"||"+platinumG_stn+"|"+goldG_stn+"|"+silverG_stn+"\n"+
						   "Bombay Velvet  |"+platinumB_ntt+"|"+goldB_ntt+"|"+silverB_ntt+"||"+platinumB_ttt+"|"+goldB_ttt+"|"+silverB_ttt+"||"+platinumB_tts+"|"+goldB_tts+"|"+silverB_tts+"||"+platinumB_stn+"|"+goldB_stn+"|"+silverB_stn;
			JOptionPane.showMessageDialog(null, message);
		}
	}
	
	static void initialize()
	{
		BookMyShow book=new BookMyShow();
		book.movieList();
		book.timing();
		book.ticketType();
		book.bookSeat();
		book.show();
		System.out.println("Want to book another ticket? Enter 1 for booking again \n To go to home enter 2 to exit enter cntl c");
		int again=sc.nextInt();
		if(again==1)
			initialize();
		if(again==2)
		{
			main();
		}
		
	}
	
	public static void main(String... args)
	{
		System.out.println("If you are user enter 1 or if you are admin enter 2 cntl c to exit");
		int user=sc.nextInt();
		if(user==1)
		{
			initialize();
		}
		else
		{
			show();
		}
		
	}                    

}

