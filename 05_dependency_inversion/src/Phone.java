public class Phone implements Notifier{

    private final String RAINY = "rainy";

    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }

    @Override
    public void notifyWeather(String weatherConditions) {
        if (RAINY.equalsIgnoreCase(weatherConditions)) {
            System.out.print(generateWeatherAlert(weatherConditions));
        }
    }
}
