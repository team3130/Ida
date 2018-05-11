/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3130.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static OI m_instance;
	public static OI getInstance(){
		if(m_instance==null) m_instance = new OI();
		return m_instance;
	}
	
	public static Joystick stickL;
	public static Joystick stickR;
	
	private OI(){
		stickL = new Joystick(RobotMap.stickL);
		stickR = new Joystick(RobotMap.stickR);
	}
}
