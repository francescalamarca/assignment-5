package question10;

// City B Specific Decorator
public class CityBSpecificDecorator extends ServiceDecorator {
    public CityBSpecificDecorator(Service service) {
        super(service);
    }

    @Override
    public void serve() {
        super.serve();
        addCityBFeatures();
    }

    private void addCityBFeatures() {
        System.out.println("City B Service: Adding features specific to City B.");
    }
}