package creationaldesignpatterns.builder.impl01;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
    private String fname;
    private String lname;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname=fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname=lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(date, today);
        this.age = String.valueOf(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber()+"\n"+address.getStreet()+"\n"+address.getCity()+"\n"+address.getState();
        return this;
    }

    @Override
    public UserDTO build() {
        userWebDTO = new UserWebDTO(fname+" "+lname, age, address);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.userWebDTO;
    }
}
