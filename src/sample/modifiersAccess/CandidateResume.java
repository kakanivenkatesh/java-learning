package sample.modifiersAccess;


public class CandidateResume {
	
		public String candidateNames(){
			System.out.println("default modifier");
			return "default modifier";
		} 
	public static void main(String[] args) {
		new CandidateResume().candidateNames();

		}
	
	
}
