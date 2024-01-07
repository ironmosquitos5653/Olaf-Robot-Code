// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ServoSubsystem extends SubsystemBase {

  private Servo leftServo;
  private Servo rightServo;
  
  /** Creates a new ServoSubsystem. */
  public ServoSubsystem() {
    leftServo = new Servo(0);
      addChild("Servo", leftServo);
    rightServo = new Servo(1);
      addChild("Servo", rightServo);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setAngleLeft(double angle) {
    leftServo.setPosition(angle);
  }

  public void setAngleRight(double angle) {
    rightServo.setPosition(angle);
  }
}
