package vanm_sailboat;

public class VanM_SailboatDB {
	
	public static Sailboat getSailboat(String boatName)
    {
		Sailboat sailboat = new Sailboat();
		
		sailboat.setBoatName(boatName);
		
		if (boatName.equalsIgnoreCase("Boaty McBoatface"))
        {
            sailboat.setOwnerName("RRS Sir David Attenborough");
            sailboat.setNumberOfSails(0);
            sailboat.setPrice(287000000);
        }
		
		else if (boatName.equalsIgnoreCase("HMS Beagle"))
        {
            sailboat.setOwnerName("Charles Darwin");
            sailboat.setNumberOfSails(7);
            sailboat.setPrice(7803);
        }
		
		else if (boatName.equalsIgnoreCase("SS Anne"))
        {
            sailboat.setOwnerName("Pokemon");
            sailboat.setNumberOfSails(4);
            sailboat.setPrice(25000);
        }
		
		else if (boatName.equalsIgnoreCase("The Love Boat"))
        {
            sailboat.setOwnerName("SS Pacific Princess");
            sailboat.setNumberOfSails(2);
            sailboat.setPrice(69000);
        }
		
		else if (boatName.equalsIgnoreCase("SS Minnow"))
        {
            sailboat.setOwnerName("Gilligan");
            sailboat.setNumberOfSails(0);
            sailboat.setPrice(99000);
        }
		

		else
        {
            sailboat.setOwnerName("Unknown Sailboat");
            sailboat.setNumberOfSails(0);
            sailboat.setPrice(0);
        }
		
		return sailboat;
    }
}
