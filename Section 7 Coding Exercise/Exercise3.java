public class Exercise3 {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if(hours>=0)
        return hours*60;
        else 
        return -1;
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if (days>=0)
        return days*24*60;
        else 
        return -1;
    }
  public static void main(String[] args){
int hrToMin = Exercise3.convertHoursToMinutes(24);
int dayToMin = Exercise3.convertDaysToMinutes(24);
System.out.println("24 hrs into min is equla to "+hrToMin+" mins");
System.out.println("24 days into min is equal to "dayToMin+" mins");
  }

}
