package question10;

// City A Specific Decorator
public class CityASpecificDecorator extends ServiceDecorator {
    public CityASpecificDecorator(Service service) {
        super(service);
    }

    @Override
    public void serve() {
        super.serve();
        addCityAFeatures();
    }

    private void addCityAFeatures() {
        System.out.println("City A Service: Adding features specific to City A.");
    }
}