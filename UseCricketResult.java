package trainingday15OOPsINHERIPOLYMOR;

public class UseCricketResult {
	public static void main(String args[]) {
		int bowler1=Integer.parseInt(args[0]);
		int bowler2=Integer.parseInt(args[1]);
		int bowler3=Integer.parseInt(args[2]);
		int bowler4=Integer.parseInt(args[3]);
		int bowler5=Integer.parseInt(args[4]);
		
		int batsman1=Integer.parseInt(args[5]);
		int batsman2=Integer.parseInt(args[6]);
		int batsman3=Integer.parseInt(args[7]);
		int batsman4=Integer.parseInt(args[8]);
		int batsman5=Integer.parseInt(args[9]);
		int batsman6=Integer.parseInt(args[10]);
		
		CricketResult cr=new CricketResult();
		cr.manOfMatch(bowler1, bowler2, bowler3, bowler4, bowler5);
		cr.manOfMatch(batsman1, batsman2, batsman3, batsman4, batsman5, batsman6);
		
		
	}

}

class CricketResult {
	public void manOfMatch(int bowler1,int bowler2,int bowler3,int bowler4,int bowler5) {
		if(bowler1>bowler2 && bowler1>bowler3 && bowler1>bowler4 && bowler1>bowler5) {
			System.out.println(bowler1+" is highest Wicket");
		}
		else if (bowler2>bowler1 && bowler2>bowler3 && bowler2>bowler4 && bowler2>bowler5) {
			System.out.println(bowler2+" is highest Wicket");
		}
		else if (bowler3>bowler1 && bowler3>bowler2 && bowler3>bowler4 && bowler3>bowler5) {
			System.out.println(bowler3+" is highest Wicket");
		}
		else if (bowler4>bowler1 && bowler4>bowler2 && bowler4>bowler3 && bowler4>bowler5) {
			System.out.println(bowler4+" is highest Wicket");
		}
		else if (bowler5>bowler1 && bowler5>bowler2 && bowler5>bowler3 && bowler5>bowler4) {
			System.out.println(bowler5+" is highest Wicket");
		}
		else {
			System.out.println("None of the above");
		}
	}
	
	public void manOfMatch(int batsman1,int batsman2,int batsman3, int batsman4, int batsman5,int batsman6) {
		if(batsman1>batsman2 && batsman1>batsman3 && batsman1>batsman4 && batsman1>batsman5 && batsman1>batsman6) {
			System.out.println(batsman1+" is highest run");
		}
		else if (batsman2>batsman1 && batsman2>batsman3 && batsman2>batsman4 && batsman2>batsman5 && batsman2>batsman6) {
			System.out.println(batsman2+" is highest run");
		}
		else if ( batsman3>batsman1 && batsman3>batsman2 && batsman3>batsman4 && batsman3>batsman5 && batsman3>batsman6) {
			System.out.println(batsman3+" is highest run");
		}
		else if (batsman4>batsman1 && batsman4>batsman2 && batsman4>batsman3 && batsman4>batsman5 && batsman4>batsman6) {
			System.out.println(batsman4+" is highest run");
		}
		else if ( batsman5>batsman1 && batsman5>batsman2 && batsman5>batsman3 && batsman5>batsman4 && batsman1>batsman6) {
			System.out.println(batsman5+" is highest run");
		}
		else if( batsman6>batsman1 && batsman6>batsman2 && batsman6>batsman3 && batsman6>batsman4 && batsman6>batsman5) {
			System.out.println(batsman6+" is highest run");
		}
		else {
			System.out.println("none of the above");
		}
		
		}	
}
