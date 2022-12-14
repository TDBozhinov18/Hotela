public class Guests {

    String name;
    String egn;
    int maritalStatus;
    int nights;
    double beds;
    String city;

    public Guests(String name, String egn, int maritalStatus, int nights, double beds, String city) {
        this.name = name;
        this.egn = egn;
        this.maritalStatus = maritalStatus;
        this.nights = nights;
        this.beds = beds;
        this.city = city;
    }

    public Guests() {

    }

    @Override
    public String toString() {
        return "Guests{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", nights=" + nights +
                ", beds=" + beds +
                ", city='" + city + '\'' +
                '}';
    }
}