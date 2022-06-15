package model;

public class StudentModel {

    private int id;
    private String username;
    private String name;
    private String address;
    private int year;
    private String departement;
    private double jpa;

    public StudentModel(){}

    public StudentModel(int id, String username, String name, String address, int year, String departement, float jpa) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.address = address;
        this.year = year;
        this.departement = departement;
        this.jpa = jpa;
    }

    public void print(){
        System.out.println(this.getId()+" "+this.getUsername()+" "+this.getName()+" "+
                this.getAddress()+" "+this.getYear()+" "+this.getDepartement()+" "+ this.getJpa());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getJpa() {
        return jpa;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }


}
