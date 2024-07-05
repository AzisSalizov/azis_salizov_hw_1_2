public class Address {
    private String street;
    private String city;
    private int buildingNumber;

    public Address(String street, String city, int buildingNumber) {
        this.street = street;
        this.city = city;
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    @Override
    public String toString() {
        return   "street='" + street + '\'' + ", city='" + city + '\'' + ", buildingNumber=" + buildingNumber;
    }
}
