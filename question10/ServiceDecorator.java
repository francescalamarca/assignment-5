// Abstract Decorator
package question10;

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