package MainFinal;

public class Final {
	public static void main(String[] args) {
		// Number of teams is set to 10
		// This code block initializes the number of teams to 10 and creates an integer
		// array ids with a length of 10.
		// Then, it uses a for loop to generate a random number between 0 and 999 for
		// each element in ids.
		// If the result of ids[i] % 100 is equal to ids[i], the value of i is
		// decremented so that the same random number is generated again.
		int numberOfteams = 10;
		// Create an array to store team IDs with a size of `numberOfteams`
		int[] ids = new int[numberOfteams];
		// Generate unique random IDs for each team
		for (int i = 0; i < numberOfteams; i++) {
			ids[i] = (int) (Math.random() * 1000);

			// Check if the generated number is a multiple of 100, if so decrement `i` to
			// generate another number
			if (ids[i] % 100 == ids[i]) {

				i--;
			}
		}
		// Check if any generated IDs are duplicates, if so generate a new random number
		// for the duplicate ID
		// This code block checks for duplicate values in the ids array using nested for
		// loops.
		// If a duplicate is found, a new random number is generated until a unique
		// number is found.
		for (int i = 0; i < ids.length; i++) {
			for (int j = 0; j < ids.length - 1; j++) {
				if (ids[i] == ids[j + 1]) {
					do {
						ids[j + 1] = (int) (Math.random() * 1000);
					} while (ids[j + 1] % 100 == ids[j + 1]);
				}
			}
		}

		// Initialize an array to store team names
		// This code block creates an array of String objects teamsName with 10
		// elements, each representing the name of a team.
		String[] teamsName = new String[10];
		teamsName[0] = "Coders-HTU";
		teamsName[1] = "Syntax- JU";
		teamsName[2] = "Fast- JUST";
		teamsName[3] = "Wizards-HU";
		teamsName[4] = "Savants-HU";
		teamsName[5] = "Brigade-JU";
		teamsName[6] = "Leaders-AU";
		teamsName[7] = "Command-MU";
		teamsName[8] = "Dreamer-JU";
		teamsName[9] = "Debug-PSUT";
		// Create an array of `Team` objects with a size of `numberOfteams`
		// it creates an array of Team objects teams with a length of 10.
		// Finally, it uses a for loop to set the ID, name, solved questions,
		// and elapsed time of each team using the setId, setTeamName,
		// setSolvedQuestion, and setElapsedTime methods, respectively.
		Team[] teams = new Team[10];
		// Initialize the team objects with the generated ID and team name, random
		// solved questions and elapsed time
		for (int i = 0; i < numberOfteams; i++) {
			teams[i] = new Team();
			teams[i].setId(ids[i]);
			teams[i].setTeamName(teamsName[i]);
			// Set a random number of solved questions for each team
			teams[i].setSolvedQuestion((int) (Math.random() * 11));
			// Set a random elapsed time for each team
			teams[i].setElapsedTime((int) (Math.random() * 301));
		}

		// This part of the code is sorting the "teams" array based on the number of
		// solved questions and elapsed time of each team.
		// The sorting is done using the bubble sort algorithm, where it compares each
		// pair of elements and swaps them
		// so if the element on the left is greater than the one on the right.
		// The sorting is done in two steps: first, the teams are sorted based on the
		// number of solved questions,

		for (int i = 0; i < teams.length; i++) {
			// Sort the teams based on the number of solved questions and elapsed time
			// inner loop to compare values and sort teams based on solved question and
			// elapsed time
			for (int j = 0; j < teams.length - i - 1; j++) {
				// swap the teams if team[j].getSolvedQuestion() < team[j +
				// 1].getSolvedQuestion()
				if (teams[j].getSolvedQuestion() < teams[j + 1].getSolvedQuestion()) {
					// swapping values if solved question of j is less than j+1
					Team temp = teams[j];
					teams[j] = teams[j + 1];

					teams[j + 1] = temp;
				}
				// and then, if two teams have the same number of solved questions, they are
				// sorted based on their elapsed time.
				// The final result is that the teams array will be sorted in a descending order
				// based on the number of solved questions
				// and ascending order based on the elapsed time.
				else if (teams[j].getSolvedQuestion() == teams[j + 1].getSolvedQuestion()) {
					// if solved question of j is equal to j+1 then sorting based on elapsed time
					if (teams[j].getElapsedTime() > teams[j + 1].getElapsedTime()) {
						Team temp = teams[j];
						teams[j] = teams[j + 1];
						teams[j + 1] = temp;
					}
				}
			}
		}

//		This code is part of a program that outputs the rankings of teams in a competition.
//		The first for loop is sorting the teams based on the number of solved questions and elapsed time.
//		The second part is printing the team rankings in a table format. It starts by printing the table headers: 
//		"Rank", "Team ID", "Team Name", "Solved Questions", "Elapsed Time". Then, it uses a for loop to print the rankings of each team 
//		using the "print()" method of the "Team" class. The team rankings are displayed one after the other, with each 
//		team's rank displayed as a prefix to the output from the "print()" method

		System.out.println("################################################################################");
		System.out.println("#   Rank   #   Team ID   #   Team Name   #  Solved Questions  #  Elapsed Time  #");
		System.out.println("################################################################################");
		System.out.print("#     1    #");
		teams[0].print();
		System.out.print("#     2    #");
		teams[1].print();
		System.out.print("#     3    #");
		teams[2].print();
		System.out.print("#     4    #");
		teams[3].print();
		System.out.print("#     5    #");
		teams[4].print();
		System.out.print("#     6    #");
		teams[5].print();
		System.out.print("#     7    #");
		teams[6].print();
		System.out.print("#     8    #");
		teams[7].print();
		System.out.print("#     9    #");
		teams[8].print();
		System.out.print("#    10    #");
		teams[9].print();

	}
}
