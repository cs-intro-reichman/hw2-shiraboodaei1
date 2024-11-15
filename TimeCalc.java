public class TimeCalc {
    public static void main(String[] args) {
        // Get user input
        String userTime = args[0];
        int MinutesToAdd = Integer.parseInt(args[1]);
        // Get hours and minutes from the time input
        char hoursFirstDigit = userTime.charAt(0); 
        char hoursSecondDigit =  userTime.charAt(1); 
        char minutesFirstDigit = userTime.charAt(3);
        char minutesSecondDigit = userTime.charAt(4);
        int hours = Integer.parseInt(hoursFirstDigit + "" + hoursSecondDigit);
        int minutes = Integer.parseInt(minutesFirstDigit + "" + minutesSecondDigit);
        // Calc Time 
        int TotalMinutes = (hours * 60) + minutes + MinutesToAdd;
        int totalHours = TotalMinutes / 60;
        int newHours = totalHours % 24;
        if (newHours < 10){
            System.out.print("0" + newHours + ":");
        } else { 
            System.out.print(newHours + ":");
        }
        int newMinutes = TotalMinutes - (totalHours * 60);
        if (newMinutes < 10){
            System.out.print("0" + newMinutes);
        } else {
            System.out.print(newMinutes);
        }     
    }
}
