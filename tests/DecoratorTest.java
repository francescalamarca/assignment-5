//question 10
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import question10.BaseService;
import question10.CityASpecificDecorator;
import question10.CityBSpecificDecorator;
import question10.Service;

public class DecoratorTest {
        public void main(String[] args) {
                this.test();
        }

        @Test
        public void test() {
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
                System.out.println(cityAOutput);
                assert cityAOutput.equals("Base Service: Providing core service functionality.\nCity A Service: Adding features specific to City A.")
                        : "CityASpecificDecorator test failed";
                outputStream.reset();

                // Test City B Decorator
                Service cityBService = new CityBSpecificDecorator(baseService);
                cityBService.serve();
                String cityBOutput = outputStream.toString().trim();
                System.out.println(cityBOutput);
                assert cityBOutput.equals("Base Service: Providing core service functionality.\nCity B Service: Adding features specific to City B.")
                        : "CityBSpecificDecorator test failed";
                outputStream.reset();

                // Test Combined Decorators
                Service combinedService = new CityBSpecificDecorator(new CityASpecificDecorator(baseService));
                combinedService.serve();
                String combinedOutput = outputStream.toString().trim();
                System.out.println(combinedOutput);
                assert combinedOutput.equals("Base Service: Providing core service functionality.\nCity A Service: Adding features specific to City A.\nCity B Service: Adding features specific to City B.")
                        : "CombinedDecorator test failed";
                outputStream.reset();

                // Restore original System.out
                System.setOut(originalOut);
                System.out.println("All tests passed!");
        }
}



