package sg.rp.edu.c346.id20040896.democustomcontactlist;

public class Contact {
    private String name;
    private int countryCode;
    private int contact;
    private char gender;

    public Contact(String name, int countryCode, int contact, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.contact = contact;
        this.gender = gender;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public char getGender() {
        return gender;
    }
}
