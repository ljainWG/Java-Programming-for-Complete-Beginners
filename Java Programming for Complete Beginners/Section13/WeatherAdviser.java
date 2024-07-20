import java.util.Scanner;

public class WeatherAdviser {

    public String provideWeatherAdvisory(int temperature) {
        // TODO: Provide a weather advisory message based on the temperature.
        if(temperature<0)
        return "It's freezing! Wear a heavy coat.";
        else if(temperature>=0 && temperature <11)
        return "It's cold! Bundle up.";
        else if(temperature>=11 &&  temperature <21)
        return "It's cool! A light jacket will do.";
        else if(temperature>=21)
        return "It's warm! Enjoy the day.";
        
        return "";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature");
        int temprature=sc.nextInt();     
        WeatherAdviser obj = new WeatherAdviser();
        String result = obj.provideWeatherAdvisory(temprature);
        System.out.println(result);
        sc.close();
    }
}