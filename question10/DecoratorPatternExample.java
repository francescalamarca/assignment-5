package question10;

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
