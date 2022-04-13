package com.app.oda_user;

public class organRequestModel {

    private String name;
    private String requestedOrgan;

    private organRequestModel() {}

    private organRequestModel(String name, String province) {
        this.name = name;
        this.requestedOrgan = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestedOrgan() {
        return requestedOrgan;
    }

    public void setRequestedOrgan(String requestedOrgan) {
        this.requestedOrgan = requestedOrgan;
    }
}
