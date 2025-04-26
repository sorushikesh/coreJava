package org.java8Features.realWorldExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

  private static final Logger logger = LogManager.getLogger(Application.class);

  public static void main(String[] args) {

    UserService userService = new UserService();

    logger.info("All Users:");
    userService.getAllUsers().forEach(logger::info);

    logger.info("Active Users:");
    userService.getActiveUsers().forEach(logger::info);

    logger.info("Users Grouped by City:");
    userService.groupUsersByCity().forEach((city, users) -> logger.info("{} -> {}", city, users));

    logger.info("Any Invalid Emails?: {}", userService.hasInvalidEmails());

    logger.info("User Names in Uppercase:");
    userService.getUserNamesInUppercase().forEach(logger::info);
  }
}
