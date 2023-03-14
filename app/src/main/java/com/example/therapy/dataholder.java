package com.example.therapy;

public class dataholder {
    String name;
    String phone;
    String age;
    String gender;
    String marital;
    String domicile;
    String edu;
    String occ;
    String concern;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public dataholder(String name, String phone, String age, String gender, String marital, String domicile, String edu, String occ, String concern) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.marital = marital;
        this.domicile = domicile;
        this.edu = edu;
        this.occ = occ;
        this.concern = concern;
    }

}
