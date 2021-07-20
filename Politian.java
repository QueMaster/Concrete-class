public class Politician
{
	private String surname;
	private String position;
	private String politicalParty;
	
	public Politician()
	{
		surname = "SURNAME";
		position = "NOT APPOINTED YET";
		politicalParty = "MUST MAKE UP YOUR MIND";
	}
	
	public Politician(String pSurname, String pPosition, String pParty)
	{
		surname = pSurname;
		position = pPosition;
		politicalParty = pParty;
	}
	
	public void setSurname(String pSurname)
	{
		surname = pSurname;
	}
	
	public void setPosition(String pPosition)
	{
		position = pPosition;
	}
	
	public void setPoliticalParty(String pParty)
	{
		politicalParty = pParty;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public String getPoliticalParty()
	{
		return politicalParty;
	}
	
	public boolean goodPolitician(int budget, double moneySpend)
	{
		boolean answer = false;
		
		double spendingFactor = (moneySpend/(double)budget)*100.0;
		if(spendingFactor < 100.0)
		{
			answer = true;
		}
				
		return answer;
	}
	
}