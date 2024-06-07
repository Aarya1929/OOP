//Simple counter increase
package Assignment_1;

class Participant{
	static int counter;
	static 
	{
		counter=1001;
	}	
	String registrationId;
	String name;
	long contactNumber;
	String branch;

	public Participant(String name,long contactNumber,String branch) {
		this.name=name;
		this.contactNumber=contactNumber;
		this.branch=branch;
		
		registrationId="D"+(counter);
		counter++;
	}
		
	public String getName() {
			    return name;
	}
	
	public String getRegistrationId() {
	    return registrationId;
	}
}

class tester {
	public static void main(String[] args) {
		 Participant participant1 = new Participant("Rohit", 1234567889, "Computer");
		 Participant participant2 = new Participant("Sayli", 1988612300, "Mechanical");
		 Participant participant3 = new Participant("Aarya", 1388612304, "Entc");
		 Participant participant4 = new Participant("Aarav", 1048612300, "Chemical");
								
		 Participant[] participants = { participant1, participant2, participant3, participant4 };
				
		 for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		 }
	}
}