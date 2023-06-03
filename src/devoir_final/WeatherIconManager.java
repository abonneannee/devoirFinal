package devoir_final;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

public class WeatherIconManager {
    private Map<String, ImageIcon> weatherIcons;

    public WeatherIconManager() {
        weatherIcons = new HashMap<>();

        //On  Charge les icônes météorologiques correspondantes
        //weatherIcons.put("clear", createImageIcon("sun.png"));
        weatherIcons.put("clouds", createImageIcon("slightly-cloudy.png"));
        weatherIcons.put("rain", createImageIcon("rainclound.png"));
        weatherIcons.put("snow", createImageIcon("snow.png"));
        weatherIcons.put("Windy", createImageIcon("windy.png"));

    }

    public ImageIcon getWeatherIcon(String weatherCondition) {
        ImageIcon icon = weatherIcons.get(weatherCondition);
        if (icon != null) {
            return icon;
        } else {
            // Condition pour si aucune icône n'est trouvée
            return new ImageIcon();
        }
    }

    private ImageIcon createImageIcon(String path) {
        Image image = new ImageIcon(this.getClass().getResource(path)).getImage();
        return new ImageIcon(image);
    }

}