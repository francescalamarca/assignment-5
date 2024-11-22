package question11;

public class RiderService {
    public Rider getRiderDetails(String riderId) {
        // Simulating service logic (no real DB or external API)
        return new Rider(riderId, "John Doe", "New York");
    }

    public static class Rider {
        private String riderId;
        private String name;
        private String city;

        public Rider(String riderId, String name, String city) {
            this.riderId = riderId;
            this.name = name;
            this.city = city;
        }

        public String getRiderId() {
            return riderId;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }
    }
}

