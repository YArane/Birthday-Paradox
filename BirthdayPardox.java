public class BirthdayParadox{
	public boolean hasDuplicates(ArrayList<Date> dates){
		Comp202FinalCode.sort(dates);
		// sorted in ascending order, Jan 1st < Dec 31st
		for(int i=0;i<dates.size()-1;i++){
			if(dates.get(i).getMonth() == dates.get(i+1).getMonth() &&
							dates.get(i).getDay() == dates.get(i+1).getDay()){
				return true;
			}
		}
		return false;
			
		}	
	}

	public void testTheory(){
		Scanner sc = new Scanner();
		//Array list
		ArrayList<Date> dates = new ArrayList<Date>();
		int i = 0;
		while(i++ < 23){
			int day1 = sc.nextInt();
			int month1 = sc.nextInt();
			Date date1 = new Date(month1, day1);
			dates.add(date1);
		}
		if(hasDuplicates(dates))
			System.out.println("Theory is correct!");
		else
			System.out.println("incorrect :(");
	}
}
