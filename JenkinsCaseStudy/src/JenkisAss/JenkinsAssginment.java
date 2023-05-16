package JenkisAss;

import org.testng.annotations.Test;

public class JenkinsAssginment {
	
	
	@Test(priority = 0)
public void startEngine() {
	System.out.println("Engine Started!..");
}

	@Test(priority = 1)
public void PutInFirstGear() {
	System.out.println("car is running in First Gear");
}

	@Test(priority = 2)
public void PutInsecondGear() {
	System.out.println("car is running in Second Gear");
}

	@Test(priority = 3)
public void PutInThredGear() {
	System.out.println("car is running in Thred Gear");
}

	@Test(priority = 4)
public void PutInFourthGear() {
	System.out.println("car is running in Fourth Gear");
}

}
