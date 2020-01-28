/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import frc.robot.Constants.DriveConstants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  Spark leftDrive = new Spark(DriveConstants.LEFT_DRIVE_MOTOR);
  Spark rightDrive = new Spark(DriveConstants.RIGHT_DRIVE_MOTOR);

  // init drivetrain
  DifferentialDrive driveTrain = new DifferentialDrive(leftDrive, rightDrive);
  
  public DriveTrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double x, double y) {
		driveTrain.arcadeDrive(y, x);
  }
  
}
