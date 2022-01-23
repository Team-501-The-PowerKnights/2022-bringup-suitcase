/*-----------------------------------------------------------------------*/
/* Copyright (c) Team 501 - The PowerKnights. All Rights Reserved.       */
/* Open Source Software - may be modified and shared by other FRC teams  */
/* under the terms of the Team501 license. The code must be accompanied  */
/* by the Team 501 - The PowerKnights license file in the root directory */
/* of this project.                                                      */
/*-----------------------------------------------------------------------*/

package frc.robot;


import frc.robot.config.VersionInfo;

import riolog.PKLogger;
import riolog.RioLogger;


/**
 * This class is used to provide a wrapper on the WPILib stuff, and a way to get
 * some personalization and configuration info injected into the dashboard and
 * log files.
 */
public class Team501Robot extends Robot {

   /** Our classes' logger **/
   private static final PKLogger logger = RioLogger.getLogger(Team501Robot.class.getName());

   public Team501Robot() {
      logger.info("constructing");

      logger.info("codeVersion={}", VersionInfo.version);

      logger.info("constructed");
   }

}
