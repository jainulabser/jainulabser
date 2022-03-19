package com.zsgs.student;

import java.util.Scanner;
import java.util.Stack;

class Choice {
	private int level;
	private int choice;

	public void setLevel(int level) {
		this.level = level;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getLevel() {
		return level;
	}

	public int getChoice() {
		return choice;
	}
}

public class AbsNetwork {
	private Stack<Choice> mStackCollection = new Stack<>();
	private Scanner mScanner = new Scanner(System.in);

	enum Index {
		option1("1 -> English"), option2("2 -> Tamil"), option3("0 -> exit");

		private String text;

		Index(String text) {
			this.text = text;
		}
	}

	enum EnglishIndex {
		option1("1 -> Recharge"), option2("2 -> Dth"), option3("3 -> Service"), option4("9 -> back"),
		option5("0 -> exit");

		private String text;

		EnglishIndex(String text) {
			this.text = text;
		}
	}

	enum TamilIndex {
		option1("1 -> ரிச்சார்ஜ்"), option2("2 -> டிடிஹச்"), option3("3 ->  சேவை "), option4("9 -> பின் செல்ல "),
		option5("0 -> exit");

		private String text;

		TamilIndex(String text) {
			this.text = text;
		}
	}

	enum Recharge {
		option1("1 ->  106. 1GB Data for 84 Days"), option2("2 -> 197. 2GB/DAY Data for 100 Days"),
		option3("3 -> ₹22 for 90 Days Pack"), option4("9 -> back"), option5("0 -> exit");

		private String text;

		Recharge(String text) {
			this.text = text;
		}
	}

	enum Dth {
		option1("1 ->  ₹100 for 50 Channels"), option2("2 -> ₹180 for 70 Channels"),
		option3("3 -> ₹216 for 88 Channels"), option4("9 -> back"), option5("0 -> exit");

		private String text;

		Dth(String text) {
			this.text = text;
		}
	}

	enum Service {
		option1("1 ->  Call 1001 for Recharge Complaint"), option2("2 -> Call 1002 for DTH Complaint"),
		option3("9 -> back"), option4("0 -> exit");

		private String text;

		Service(String text) {
			this.text = text;
		}
	}

	private void printDetails(int level) {

		if (level == 0) {
			System.out.println(Index.option1.text);
			System.out.println(Index.option2.text);
			System.out.println(Index.option3.text);

		} else if (level == 1) {
			switch (mStackCollection.peek().getChoice()) {
			case 1:
				System.out.println(EnglishIndex.option1.text);
				System.out.println(EnglishIndex.option2.text);
				System.out.println(EnglishIndex.option3.text);
				System.out.println(EnglishIndex.option4.text);
				System.out.println(EnglishIndex.option5.text);
				break;
			case 2:
				System.out.println(TamilIndex.option1.text);
				System.out.println(TamilIndex.option2.text);
				System.out.println(TamilIndex.option3.text);
				System.out.println(TamilIndex.option4.text);
				System.out.println(TamilIndex.option5.text);
				break;
			}
		} else if (level == 2) {
			switch (mStackCollection.peek().getChoice()) {
			case 1:
				System.out.println(Recharge.option1.text);
				System.out.println(Recharge.option2.text);
				System.out.println(Recharge.option3.text);
				System.out.println(Recharge.option4.text);
				System.out.println(Recharge.option5.text);
				break;
			case 2:
				System.out.println(Dth.option1.text);
				System.out.println(Dth.option2.text);
				System.out.println(Dth.option3.text);
				System.out.println(Dth.option4.text);
				System.out.println(Dth.option5.text);
				break;
			case 3:
				System.out.println(Service.option1.text);
				System.out.println(Service.option2.text);
				System.out.println(Service.option3.text);
				System.out.println(Service.option4.text);
				break;
			}
		} else {
			System.out.println("Successfull Operations");
			System.out.println("Bye");
			System.exit(0);
		}
	}

	private void indexDetails() {
		int choice;
		Choice choiceObj = new Choice();
		mStackCollection.push(choiceObj);
		printDetails(mStackCollection.peek().getLevel());
		do {
			Choice newChoiceObj = new Choice();
			System.out.println("Enter Your Choice");
			choice = mScanner.nextInt();
			if (choice == 0) {
				System.out.println("Thank you for using our network");
				System.exit(0);
			} else if (choice == 9) {
				mStackCollection.pop();
				printDetails(mStackCollection.peek().getLevel());
			} else if (choice != 9) {
				newChoiceObj.setChoice(choice);
				newChoiceObj.setLevel(mStackCollection.peek().getLevel() + 1);
				mStackCollection.push(newChoiceObj);
				printDetails(mStackCollection.peek().getLevel());
			}
		} while (choice != 0);
	}

	public static void main(String args[]) {
		AbsNetwork absNetwork = new AbsNetwork();
		absNetwork.indexDetails();
	}
}
