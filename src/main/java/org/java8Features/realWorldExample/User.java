package org.java8Features.realWorldExample;

public record User(String id, String name, String email, String status, String city) {

  @Override
  public String toString() {
    return "User{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + ", status='" + status + '\'' + ", city='" + city + '\'' + '}';
  }
}
