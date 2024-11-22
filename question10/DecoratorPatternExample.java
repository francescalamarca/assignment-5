package question10;

interface Service {
    void serve();
}

// BaseService (Original Version)
class BaseService implements Service {
    @Override
    public void serve() {
        String result = "Base Service: Providing core service functionality.";
        System.out.println(result);
    }
}

// Abstract Decorator
abstract class ServiceDecorator implements Service {
    protected Service service;

    public ServiceDecorator(Service service) {
        this.service = service;
    }

    @Override
    public void serve() {
        service.serve(); // Delegates the call
    }
}

// City A Specific Decorator
class CityASpecificDecorator extends ServiceDecorator {
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

// City B Specific Decorator
class CityBSpecificDecorator extends ServiceDecorator {
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

//TESTING

// Client Code
public class DecoratorPatternExample{
    public static void main(String[] args) {
        // Base Service
        Service baseService = new BaseService();
        System.out.println("Base Service:");
        baseService.serve();

        // City A Service
        Service cityAService = new CityASpecificDecorator(baseService);
        System.out.println("\nCity A Service:");
        cityAService.serve();

        // City B Service
        Service cityBService = new CityBSpecificDecorator(baseService);
        System.out.println("\nCity B Service:");
        cityBService.serve();

        // Combined Service
        Service combinedService = new CityBSpecificDecorator(new CityASpecificDecorator(baseService));
        System.out.println("\nCombined City A and City B Service:");
        combinedService.serve();
    }
}
