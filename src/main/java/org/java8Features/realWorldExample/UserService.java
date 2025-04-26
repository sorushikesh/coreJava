package org.java8Features.realWorldExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

  private final List<User> users;

  public UserService() {
    users = Arrays.asList(new User("1", "Alice", "alice@gmail.com", UserStatus.ACTIVE.name(), "Mumbai"),
        new User("2", "Bob", "bob@gmail.com", UserStatus.INACTIVE.name(), "Pune"),
        new User("3", "Charlie", "charlie@gmail.com", UserStatus.ACTIVE.name(), "Delhi"),
        new User("4", "David", "david@gmail.com", UserStatus.ACTIVE.name(), "Mumbai"),
        new User("5", "Eva", "eva@gmail.com", UserStatus.INACTIVE.name(), "Pune"));
  }

  public List<User> getAllUsers() {
    return users;
  }

  public List<User> getActiveUsers() {
    return users.stream().filter(user -> UserStatus.ACTIVE.name().equalsIgnoreCase(user.status()))
        .collect(Collectors.toList());
  }

  public Map<String, List<User>> groupUsersByCity() {
    return users.stream().collect(Collectors.groupingBy(User::city));
  }

  public boolean hasInvalidEmails() {
    return users.stream().anyMatch(user -> user.email() == null || user.email().isEmpty());
  }

  public List<String> getUserNamesInUppercase() {
    return users.stream().map(user -> user.name().toUpperCase()).collect(Collectors.toList());
  }
}

