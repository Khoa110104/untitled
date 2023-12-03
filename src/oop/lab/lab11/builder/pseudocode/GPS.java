package oop.lab.lab11.builder.pseudocode;

public class GPS {
    private String route;

    public GPS() {
        this.route = "GPS: 223b, 37A, Ha Noi, Viet Nam";
    }

    public GPS(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}