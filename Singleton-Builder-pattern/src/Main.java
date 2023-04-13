import com.knoldus.singleton_builder.Configuration;
import com.knoldus.singleton_builder.ConfigurationBuilder;

public class Main { 
    public static void main(String[] args) {

        Configuration firstConfig = Configuration.getConfigurationInstance();
        Configuration secondConfig = Configuration.getConfigurationInstance();
        System.out.println("Are the both objects equal ? "+ (firstConfig == secondConfig));

        Configuration config = new ConfigurationBuilder().setProperty1("Rishika").setProperty2(1852).build();
        System.out.println(config);

    }
}