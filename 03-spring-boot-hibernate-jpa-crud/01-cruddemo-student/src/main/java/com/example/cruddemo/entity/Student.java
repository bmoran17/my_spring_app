package com.example.cruddemo.entity;
import jakarta.persistence.*;

// maps class to database table with @Entity and @Table annotations
@Entity
@Table(name="student")
public class Student {

  // define fields
  
  @Id // marks primary key
  // auto-incremented by database, generated value for primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column(name="id")
  private int id;

  @Column(name="first_name")
  private int firstName;

  @Column(name="last_name")
  private int lastName;

  @Column(name="email")
  private int email;

  // define constructors=> no argument constructor & constructor that accepts arguments

  public Student() {

  }

  public Student(int firstName, int lastName, int email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  // define getters/setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getFirstName() {
    return firstName;
  }

  public void setFirstName(int firstName) {
    this.firstName = firstName;
  }

  public int getLastName() {
    return lastName;
  }

  public void setLastName(int lastName) {
    this.lastName = lastName;
  }

  public int getEmail() {
    return email;
  }

  public void setEmail(int email) {
    this.email = email;
  }

  // define toString() method

  @Override
  public String toString() {
    return "Student [id=" + id + 
           ", firstName=" + firstName + 
           ", lastName=" + lastName + 
           ", email=" + email + "]";
  }

}
