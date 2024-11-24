package nov17;

public class Address {
    private int houseNo;
    private String state;
    private String city;

    public Address(int houseNo, String city, String state) {
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
