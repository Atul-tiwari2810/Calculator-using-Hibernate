package atul.calculator.newproject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {


		try
		{
			Configuration config=new Configuration();
			config.configure("resources/hibernate.cfg.xml");
			System.out.println(config);


			System.out.println("  ->Select One(1) for Addition");
			System.out.println("  ->Select Two(2) for Subtraction");
			System.out.println("  ->Select three(3) for Multiplication");
			System.out.println("  ->Select Four(4) for division");
			System.out.println("  ->Select Four(5) for Exit");
			System.out.println("Select One your choice.....");
			Scanner sc=new Scanner(System.in);
			//InputOutput io=new InputOutput();
			int num1,num2,res;
			while(sc.hasNextInt()) {
				int ch=sc.nextInt();

				switch(ch) {
					// performs addition between numbers
					case 1:
						Addition add=new Addition();
						System.out.println("Enter two number");
						 num1=sc.nextInt();
						 num2=sc.nextInt();
						res=add.addition(num1,num2);
						SessionFactory sessionFactory=config.buildSessionFactory();
						Session session=sessionFactory.getCurrentSession();
						Transaction tx=session.beginTransaction();
						InputOutput o1=new InputOutput();
						o1.setF_no(num1);
						o1.setS_no(num2);
						o1.setRes(res);
						session.save(o1);
						//Transaction t=session.beginTransaction();
						tx.commit();
						break;

					// performs subtraction between numbers
					case 2:
						Subtraction sub=new Subtraction();
						System.out.println("Enter two number");
						 num1=sc.nextInt();
						 num2=sc.nextInt();
						 res=sub.subtraction(num1,num2);
						SessionFactory sessionFactory2=config.buildSessionFactory();
						Session session2=sessionFactory2.getCurrentSession();
						Transaction tx2=session2.beginTransaction();
						InputOutput o2=new InputOutput();
						o2.setF_no(num1);
						o2.setS_no(num2);
						o2.setRes(res);
						session2.save(o2);
						tx2.commit();
						break;

					// performs multiplication between numbers
					case 3:
						Multiply mlt=new Multiply();
						System.out.println("Enter two number");
						 num1=sc.nextInt();
						 num2=sc.nextInt();
						res=mlt.multiplication(num1,num2);
						SessionFactory sessionFactory3=config.buildSessionFactory();
						Session session3=sessionFactory3.getCurrentSession();
						Transaction tx3=session3.beginTransaction();
						InputOutput o3=new InputOutput();
						o3.setF_no(num1);
						o3.setS_no(num2);
						o3.setRes(res);
						session3.save(o3);
						tx3.commit();
						break;

					// performs division between numbers
					case 4:
						Division div=new Division();
						System.out.println("Enter two number");
						 num1=sc.nextInt();
						 num2=sc.nextInt();
						res=div.divition(num1,num2);
						SessionFactory sessionFactory4=config.buildSessionFactory();
						Session session4=sessionFactory4.getCurrentSession();
						Transaction tx4=session4.beginTransaction();
						InputOutput o4=new InputOutput();
						o4.setF_no(num1);
						o4.setS_no(num2);
						o4.setRes(res);
						session4.save(o4);
						tx4.commit();
						break;

					default:
						System.out.println("Invalid operator!");
						break;
				}
			}



		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		// TODO Auto-generated method stub

		

	}

}
