package question10;

// BaseService (Original Version)
public class BaseService implements Service {
    @Override
    public void serve() {
        String result = "Base Service: Providing core service functionality.";
        System.out.println(result);
    }
}
