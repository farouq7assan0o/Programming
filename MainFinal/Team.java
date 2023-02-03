package MainFinal;

public class Team {
	public Team() {
	}

	// parameterized constructor to set the values of the fields
	public Team(int id, String teamName, int solvedQuestion, int elapsedTime) {
		this.id = id;
		this.teamName = teamName;
		this.solvedQuestion = solvedQuestion;
		this.elapsedTime = elapsedTime;
	}

	// fields of the class with private access
	private int id;
	private String teamName;
	private int solvedQuestion;
	private int elapsedTime;

	// getter method to get the value of id field
	public int getId() {
		return id;
	}

	// setter method to set the value of id field
	public void setId(int id) {
		this.id = id;
	}

	// getter method to get the value of teamName field
	public String getTeamName() {
		return teamName;
	}

	// setter method to set the value of teamName field
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	// getter method to get the value of solvedQuestion field
	public int getSolvedQuestion() {
		return solvedQuestion;
	}

	// setter method to set the value of solvedQuestion field
	public void setSolvedQuestion(int solvedQuestion) {
		this.solvedQuestion = solvedQuestion;
	}

	// getter method to get the value of elapsedTime field
	public int getElapsedTime() {
		return elapsedTime;
	}

	// setter method to set the value of elapsedTime field
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;

	}

	// print method to print the values of id, teamName, solvedQuestion and
	// elapsedTime fields
	public void print() {

		System.out.println("     " + id + "     #   " + teamName + "  #         " + solvedQuestion + "/10"
				+ "       #     " + elapsedTime + "        #");
	}
}