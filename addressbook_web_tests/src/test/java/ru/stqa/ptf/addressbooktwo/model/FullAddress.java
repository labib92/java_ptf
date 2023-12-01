package ru.stqa.ptf.addressbooktwo.model;

public class FullAddress {
    private String company;
    private String address;
    private String mobile;
    private String email;

    public FullAddress(String company, String address, String mobile, String email) {
        this.company = company;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
