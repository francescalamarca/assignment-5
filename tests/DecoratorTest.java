//question 10
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecoratorTest {

    public static void main(String[] args) {
        // Prepare to capture System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save the original System.out
        System.setOut(new PrintStream(outputStream)); // Redirect System.out to capture it

        // Test BaseService
        Service baseService = new BaseService();
        baseService.serve();
        String baseOutput = outputStream.toString().trim();
        assert baseOutput.equals("Base Service: Providing core service functionality.")
                : "BaseService test failed";
        outputStream.reset(); // Clear captured output

        // Test City A Decorator
        Service cityAService = new CityASpecificDecorator(baseService);
        cityAService.serve();
        String cityAOutput = outputStream.toString().trim();
        assert cityAOutput.equals("Base Service: Providing core service functionality.\nAdding features specific to City A.")
                : "CityASpecificDecorator test failed";
        outputStream.reset();

        // Test City B Decorator
        Service cityBService = new CityBSpecificDecorator(baseService);
        cityBService.serve();
        String cityBOutput = outputStream.toString().trim();
        assert cityBOutput.equals("Base Service: Providing core service functionality.\nAdding features specific to City B.")
                : "CityBSpecificDecorator test failed";
        outputStream.reset();

        // Test Combined Decorators
        Service combinedService = new CityBSpecificDecorator(new CityASpecificDecorator(baseService));
        combinedService.serve();
        String combinedOutput = outputStream.toString().trim();
        assert combinedOutput.equals("Base Service: Providing core service functionality.\nAdding features specific to City A.\nAdding features specific to City B.")
                : "CombinedDecorator test failed";
        outputStream.reset();

        // Restore original System.out
        System.setOut(originalOut);
        System.out.println("All tests passed!");
    }
}



