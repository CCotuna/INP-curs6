
public class MainAvion {

	public static void main(String[] args) {
		
		Avion avion1 = new Avion("ID1 -> AvionPrincipal", 500);
		Avion avion2 = new ALupta("ID2 -> AvionLupta", 600);
		Avion avion3 = new ACalatori(50, "ID3 -> AvionCalatori", 700);
		Avion avion4 = new Boeing(60, "ID4 -> AvionBoeing", 800);
		Avion avion5 = new Concorde(50, "ID5 -> AvionConcorde", 900);
		Avion avion6 = new Mig("ID6 -> AvionMig", 1000);
		Avion avion7 = new TomCat("ID7 -> AvionTomCat", 1100);
		
		
		avion1.takeOff();
		avion1.fly();
		avion1.land();
		
		System.out.println(avion2.getPlaneID());
		System.out.println("TotalEnginePower: "+avion2.getTotalEnginePower());
	
		avion3.takeOff();
		avion3.fly();
		avion3.land();
		System.out.println("Date avion3: " + avion3.getPlaneID() +", TEP: "+ avion3.getTotalEnginePower());
	
		System.out.println("Avion4 TEP: " +avion4.getTotalEnginePower());
	
		System.out.println("Numarul maxim de pasageri al avion5: " + ((ACalatori) avion5).getMaxPassengers());
		avion5.fly();
		((Concorde) avion5).goSuperSonic();
		
		avion6.land();
		System.out.println("Avion6 : " + avion6.getPlaneID());
		((Mig) avion6).highSpeedGeometry();
		
		avion7.fly();
		((ALupta) avion7).launchMissile();
		System.out.println("Avion7 TEP: "+avion7.getTotalEnginePower());
	}

}
