package google.weather;

import android.app.Activity;
import android.sax.*;
import android.os.Bundle;
/**
 * Tutorial on how to use the Google Weather API, all credits goes to plusprime on anddev.org
 * 
 * @see http://www.anddev.org/android_weather_forecast_-_google_weather_api_-_description-t337.html
 * @author Cedric Deschênes
 *
 */
public class TestGoogleWeatherAPI extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}