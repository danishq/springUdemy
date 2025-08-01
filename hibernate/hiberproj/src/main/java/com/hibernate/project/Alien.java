package com.hibernate.project;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "alienTable")
public class Alien {
  @Id
  private int aid;
  private String aname;
  private String tech;

  @Embedded
  private Laptop laptop;

  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }

  public String getTech() {
    return tech;
  }

  public void setTech(String tech) {
    this.tech = tech;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  @Override
  public String toString() {
    return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", laptop=" + laptop + "]";
  }

}
