package com.example.contacts_a2;

public class Contact {
    String name;
    String phone;
    String email;
    String address;
    String url;

    public Contact() {
    }

    public Contact(String name, String phone, String email, String address, String url) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
