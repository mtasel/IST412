package Model.Actors;

public class User {
    /**
     * The Actors.User's first name
     */
    private String firstName;
    /**
     * The Actors.User's last name
     */
    private String lastName;
    /**
     * The Actors.User's address
     */
    private String address;
    /**
     * The Actors.User's phone number
     */
    private String phoneNumber;
    private String userName;
    private String pswd;
    private String position;

    /**
     * Used to establish an Actors.User object
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     */
    public User(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User (String userName, String pswd){
        this.userName = userName;
        this.pswd = pswd;
    }

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }
    public String verifyUser(){
        String position = "";
        if (this.getUserName().equals("Customer1") && this.getPswd().equals("password")){
            position = "Customer";
            return position;
        } else if (this.getUserName().equals("Deliverer1") && this.getPswd().equals("password")){
            position = "Deliverer";
            return position;
        }
        else if(this.getUserName().equals("Restaurant Owner") && this.getPswd().equals("password")){
            position = "Restaurant Owner";
            return position;
        }
        return "";
    }
    /**
     *
     * @return Actors.User's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the Actors.User's first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return Actors.User's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the Actors.User's last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the Actors.User's address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the Actors.User's phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPswd() {
        return pswd;
    }

    public String getPosition() {
        return position;
    }
    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private String address;
        private String phoneNumber;

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder address (String address){
            this.address = address;
            return this;
        }

        public UserBuilder phoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
