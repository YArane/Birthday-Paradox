public class Date{
	//ATTRIBUTES
	private int month, day;

	//CONSTRUCTOR
	public Date(int month, int day){
		//check month
		if(month < 1 || month > 12)
			throw new Exception(); // System.err.println("invalid");
		//check date
		if(day < 1 || day > Comp202FinalCode.getNumDaysInMonth(month))
			throw new Exception();

		this.month = month;
		this.day = day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

	public String toString(){
		return this.day + " of " + this.month;
	}

	public static boolean compare(Date d1, Date d2){
		if(d1.getMonth() == d2.getMonth()){

		}
	}
	public boolean compare(Date d2){
		if(this.month == d2.getMonth()){

		}
	}
}
