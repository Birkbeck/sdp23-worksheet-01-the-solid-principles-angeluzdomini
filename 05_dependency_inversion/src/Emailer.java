public class Emailer implements Notifier{

    private final String SUNNY = "sunny";
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }

    @Override
    public void notifyWeather(String weatherConditions) {
        if (SUNNY.equalsIgnoreCase(weatherConditions)) {
            System.out.print(generateWeatherAlert(weatherConditions));
        }
    }
}
