package vanm_sailboat;

public class VanM_Sailboat_API {

	public static VanM_SailboatDB aSailboat;
	
	public String createSailboatDB_Object()
	{
		aSailboat = new VanM_SailboatDB();
		return "VanM_SailboatDB object created successfully";
	}
	
	public String getSailboat(String boatName)
	{
		Sailboat aSailboat = VanM_SailboatDB.getSailboat(boatName);

		String rValue = aSailboat.toString();			
		return rValue;
	}
}
