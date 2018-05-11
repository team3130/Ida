/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3130.robot.subsystems;

import org.usfirst.frc.team3130.robot.RobotMap;
import org.usfirst.frc.team3130.robot.commands.DefaultDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Chassis extends Subsystem {
	private static Chassis m_instance;
	
	public static Chassis getInstance(){
		if(m_instance==null){
			m_instance=new Chassis();
		}
		return m_instance;
	}
	
	private static WPI_TalonSRX srx_leftFront;
	private static WPI_TalonSRX srx_leftRear;
	private static WPI_TalonSRX srx_rightFront;
	private static WPI_TalonSRX srx_rightRear;
	private static DifferentialDrive m_drive;
	
	private Chassis(){
		srx_leftFront= new WPI_TalonSRX(RobotMap.CAN_DRIVE_LEFTFRONT);
		srx_leftRear = new WPI_TalonSRX(RobotMap.CAN_DRIVE_LEFTREAR);
		srx_rightFront = new WPI_TalonSRX(RobotMap.CAN_DRIVE_RIGHTFRONT);
		srx_rightRear = new WPI_TalonSRX(RobotMap.CAN_DRIVE_RIGHTREAR);
		
		/*
		srx_leftRear.set(ControlMode.Follower, RobotMap.CAN_DRIVE_LEFTFRONT);
		srx_rightRear.set(ControlMode.Follower, RobotMap.CAN_DRIVE_RIGHTFRONT);
		srx_leftFront.set(ControlMode.PercentOutput,0);
		srx_rightFront.set(ControlMode.PercentOutput,0);
		*/
		
		SpeedControllerGroup l = new SpeedControllerGroup(srx_leftFront, srx_leftRear);
		SpeedControllerGroup r = new SpeedControllerGroup(srx_rightFront, srx_rightRear);
		
		//m_drive=new DifferentialDrive(srx_leftFront, srx_rightFront);
		m_drive=new DifferentialDrive(l, r);
		m_drive.setSafetyEnabled(false);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new DefaultDrive());
	}
	
	public static void driveArcade(double speed, double turn, boolean squaredInputs){
		//System.out.println(srx_leftFront);
		m_drive.arcadeDrive(speed, turn, squaredInputs);
		/*srx_leftFront.set(1);
		srx_leftRear.set(1);
	*/}
}
