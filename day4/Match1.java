public class Match1 implements Comparable<Match1>{
	private String date;
	private String teamOne;
	private String teamTwo;
	public Match1(String date, String teamOne, String teamTwo) {
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	@Override
	public String toString() {
		return "Match1 [date=" + date + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", getDate()=" + getDate()
				+ ", getTeamOne()=" + getTeamOne() + ", getTeamTwo()=" + getTeamTwo() + "]";
	}
	@Override
	public int compareTo(Match1 m) {
		// TODO Auto-generated method stub
		return getDate().compareTo(m.getDate());
	}
	

}
