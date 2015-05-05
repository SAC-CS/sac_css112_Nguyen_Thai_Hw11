package dicegame;

public class dice {
	private int ndice;
private int nthrow;
private int nhistory;
public int throwdice(){
	ndice = (int)(Math.random()*6)+1;
	return ndice;
}
public void history(int lthrow,int lguess)
{
	nthrow = lthrow;
	nhistory = lguess;
}
public void showhistory()
{
	if(nthrow !=0)
	{
	System.out.println("Last dice number is : "+nthrow);
	System.out.println("Last player guess is : "+nhistory);
	}
}
}
