// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SwerveModule extends SubsystemBase {
  /** Creates a new SwerveModule. */
  private final CANSparkMax m_driveMotor;

  public SwerveModule() {
    m_driveMotor = new CANSparkMax(2, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void manualDrive(double move){
    SmartDashboard.putNumber("move value", move);
    m_driveMotor.set(move);
  }
}
