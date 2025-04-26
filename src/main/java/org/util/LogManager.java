package org.util;

import org.apache.logging.log4j.Logger;

public class LogManager {

  private static final Logger logger =
      org.apache.logging.log4j.LogManager.getLogger(LogManager.class);

  public static Logger getLogger() {
    return logger;
  }
}
