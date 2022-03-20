package com.zsgs.student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Class Interviewee*/
class Interviewee {// store and get all Interviewee Details
	private String name;// name of the Interviewee
	private String mail;// Mail id of the Interviewee
	// end of properties in Interviewee Class
	/* setter and getter methods */

	public void setName(String name)// set Name
	{
		this.name = name;
	}

	public String getName()// get Name
	{
		return name;
	}

	public void setMail(String mail)// set Mail
	{
		this.mail = mail;
	}

	public String getMail()// get Mail
	{
		return mail;
	}
}// end of Interviewee Class
/* Interview List Class */

public class InterviewList {
	private Queue<Interviewee> mIntervieweeCollection = new LinkedList<Interviewee>();// Queue Creation
	private int mTotalInterviewee;// all interviewees count
	private Scanner mScanner = new Scanner(System.in);

	private void indexDetails() {// Index Page
		do {
			System.out.println("1->Add Interviewee");
			System.out.println("2->Check all Interviewee");
			System.out.println("3->Finished Interviewee");
			System.out.println("0->exit");
			switch (mScanner.nextInt()) {// get input whether
			case 1:
				addInterviewee();// add details of interviewee
				break;
			case 2:
				printList();// or print details of interviewee
				break;
			case 3:
				finishedInterviewee();// print who finished the interview
				break;
			default:
				System.out.println("Thank you for Using");
				System.exit(0);// otherwise exit
			}
		} while (true);
	}// end of indexDetails method
	/* addInterviewee method */

	private void addInterviewee() {
		int newInterviewee = 0;
		System.out.println("How Many Interviewees are Come");// get input how many new comers
		newInterviewee = mScanner.nextInt();
		for (int increment = 1; increment <= newInterviewee; increment++) {// use loops for get all newcomers
			Interviewee interviewee = new Interviewee();
			mTotalInterviewee++;
			System.out.println("Interviewee :" + mTotalInterviewee);
			System.out.print("Name  :");
			interviewee.setName(mScanner.next());// setName
			System.out.print("Mail  :");
			interviewee.setMail(mScanner.next());// setMail
			mIntervieweeCollection.add(interviewee);// perform enqueue operaion collection
			System.out.println("Sucessfully Added");
			System.out.println();
		}
	}

	private void printList() {
		Iterator<Interviewee> iterator = mIntervieweeCollection.iterator();//create iterator for traverse the collection
		int count = 0;
		while (iterator.hasNext()) {// use hasNext() method for check whether queue is not empty
			Interviewee interviewee = (Interviewee) iterator.next();// is yes point next object and store it to
																	// Interviewee object
			if (count == 0) {// from the front only one person inside room
				System.out.println("Inside Room : ");
				System.out.println("Name :" + interviewee.getName());
				System.out.println("Mail :" + interviewee.getMail());
				System.out.println();
			}
			count++;
			if (count == 1) {
				System.out.println("at Door : ");
			} else if (count > 1 && count <= 5) {// then after 4 members are in near door
				System.out.println("Name :" + interviewee.getName());
				System.out.println("Mail :" + interviewee.getMail());
				System.out.println();
			} else if (count > 5) {// after all in reception
				if (count == 6) {
					System.out.println("in Reception :");
				}
				System.out.println("Name :" + interviewee.getName());
				System.out.println("Mail :" + interviewee.getMail());
				System.out.println();
			}
		}
	}// end of printDetails() method
	/* start of finishedInterviewee() method */

	private void finishedInterviewee() {
		System.out.println(mIntervieweeCollection.poll().getName());// use poll method for remove front and print it
	}// end
	/* main Method */

	public static void main(String[] args) {
		InterviewList interviewListObj = new InterviewList();// create object for InterviewList class
		interviewListObj.indexDetails();// call indexDetails() method
	}// end of main
}// end of class InterviewList
