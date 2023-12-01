package ru.stqa.ptf.addressbooktwo.model;

public class FullName {
    private String firstname;
    private String middlename;
    private String lastname;
    private String nickname;

    private String tittle;

    public FullName(String firstname, String middlename, String lastname, String nickname, String tittle) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.tittle = tittle;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTittle(){
        return tittle;
    }
}
