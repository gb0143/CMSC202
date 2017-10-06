package proj1;

import java.util.Scanner;

public class Project1 {

	public static char displayMenu(Scanner in) {
		System.out.println("O - Open door");
		System.out.println("C - Close door");
		System.out.println("P - Pull car in");
		System.out.println("B - Back car out");
		System.out.println("F - Find an empty space");
		System.out.println("D - Display space state");
		System.out.println("E - Exit the program");
    
        String input = in.next();
		char charValue = input.charAt(0);
		return charValue;
	}

	public static int garageToUse(Scanner in) {
		System.out.println("Which garage door? (1,2,3):");
		int garageNumber = in.nextInt();
		String dummy = in.nextLine();
		if (garageNumber == 1) {
			return 1;
		} else if (garageNumber == 2) {
			return 2;
		} else if (garageNumber == 3) {
			return 3;
		} else {
			System.out.println("You entered invalid garage number");
			System.out.println("Please enter 1,2 or 3 garage numbers");
			return 0;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage g1 = new Garage();
		Garage g2 = new Garage();
		Garage g3 = new Garage();
		boolean again, loopThrough;
  
		loopThrough = true;
		Scanner in = new Scanner(System.in);
		while(loopThrough){
		
		loopThrough = false;
		
		char input = displayMenu(in);
		switch (input) {
		case 'O':
		case 'o':
			again = true;
			int garageNumberToOpen;
			garageNumberToOpen = garageToUse(in);
			while (again) {
				again = false;
				if (garageNumberToOpen == 1) {
					g1.openDoor();
				} else if (garageNumberToOpen == 2) {
					g2.openDoor();
				} else if (garageNumberToOpen == 3) {
					g3.openDoor();
				} else {
					garageNumberToOpen = garageToUse(in);
					again = true;
				}
			}
			loopThrough = true;
			break;
		case 'C':
		case 'c':
			again = true;
			int garageNumberToClose;
			garageNumberToClose = garageToUse(in);
			while (again) {
				again = false;
				if (garageNumberToClose == 1) {
					g1.closeDoor();
				} else if (garageNumberToClose == 2) {
					g2.closeDoor();
				} else if (garageNumberToClose == 3) {
					g3.closeDoor();
				} else {
					garageNumberToClose = garageToUse(in);
					again = true;
				}
			}
			loopThrough = true;
			break;
		case 'P':
		case 'p':
			again = true;
			int garageNumberToPull;
			garageNumberToPull = garageToUse(in);
			while (again) {
				again = false;
				if (garageNumberToPull == 1) {
					g1.pullCarIn();
				}
				else if (garageNumberToPull == 2) {
					g2.pullCarIn();
				}
				else if (garageNumberToPull == 3) {
					g3.pullCarIn();
				} else {
					garageNumberToPull = garageToUse(in);
					again = true;
				}
			}
			loopThrough = true;
			break;
		case 'B':
		case 'b':
			again = true;
			int garageNumberToBack;
			garageNumberToBack = garageToUse(in);
			while (again) {
				again = false;
				if (garageNumberToBack == 1) {
					g1.backCarOut();
				}
				else if (garageNumberToBack == 2) {
					g2.backCarOut();
				}
				else if (garageNumberToBack == 3) {
					g3.backCarOut();
				} else {
					garageNumberToBack = garageToUse(in);
					again = true;
				}
			}
			loopThrough = true;
			break;
		case 'F':
		case 'f':
			if (g1.findEmptySpace()) {
				System.out.println("Garage 1 is empty");
			} else if (g2.findEmptySpace()) {
				System.out.println("Garage 2 is empty");
			} else if (g3.findEmptySpace()) {
				System.out.println("Garage 3 is empty");
			} else {
				System.out.println("All the garages are full, please find somewhere else to park");
			}
			loopThrough = true;
			break;
		case 'D':
		case 'd':
			again = true;
			int garageNumberToDisplay;
			garageNumberToDisplay = garageToUse(in);
			while (again) {
				again = false;
				if (garageNumberToDisplay == 1) {
					g1.displayState();
				}
				else if (garageNumberToDisplay == 2) {
					g2.displayState();
				}
				else if (garageNumberToDisplay == 3) {
					g3.displayState();
				} else {
					garageNumberToDisplay = garageToUse(in);
					again = true;
				}
			}
			loopThrough = true;
			break;
		case 'E':
		case 'e':
			System.out.println("Garage 1 data:");
			g1.displayState();
			System.out.println("Garage 2 data:");
			g2.displayState();
			System.out.println("Garage 3 data:");
			g3.displayState();
			loopThrough=false;
			return;
		default:
			loopThrough=true;
			break;
		}

   	}
	}
}
