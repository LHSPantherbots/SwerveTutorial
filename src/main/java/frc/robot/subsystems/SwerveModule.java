// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SwerveModule extends SubsystemBase {
  /** Creates a new SwerveModule. */
  private final CANSparkMax m_driveMotor;
  private final CANSparkMax m_turnMotor;
  private final CANCoder m_turningEncoder;

  public SwerveModule() {
    m_driveMotor = new CANSparkMax(2, MotorType.kBrushless);
    m_turnMotor = new CANSparkMax(22, MotorType.kBrushless);
    m_turningEncoder = new CANCoder(12);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Encoder Abs Angle", m_turningEncoder.getAbsolutePosition());    
  }

  public void manualDrive(double move, double turn){
    SmartDashboard.putNumber("move value", move);
    
    m_driveMotor.set(move);
    m_turnMotor.set(turn);
  }
}
