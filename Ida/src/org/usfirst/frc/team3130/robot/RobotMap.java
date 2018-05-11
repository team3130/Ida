/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3130.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//CAN
	public static final int CAN_DRIVE_RIGHTFRONT=2;
	public static final int CAN_DRIVE_RIGHTREAR=4;
	public static final int CAN_DRIVE_LEFTFRONT=3;
	public static final int CAN_DRIVE_LEFTREAR=5;
	
	//JOYSTICKS
	public static final int stickL = 0;
	public static final int stickR = 1;
	
	//BUTTON LIST
	//Gamepad Button List
		public static final int LST_BTN_A = 1;
		public static final int LST_BTN_B = 2;
		public static final int LST_BTN_X = 3;
		public static final int LST_BTN_Y = 4;
		public static final int LST_BTN_LBUMPER = 5;
		public static final int LST_BTN_RBUMPER = 6;
		public static final int LST_BTN_BACK = 7;
		public static final int LST_BTN_START = 8;
		public static final int LST_BTN_RJOYSTICKPRESS = 9;
		public static final int LST_BTN_LJOYSTICKPRESS = 10;

		//Gamepad Axis List
		public static final int LST_AXS_LJOYSTICKX = 0;
		public static final int LST_AXS_LJOYSTICKY = 1;
		public static final int LST_AXS_LTRIGGER = 2;
		public static final int LST_AXS_RTRIGGER = 3;
		public static final int LST_AXS_RJOYSTICKX = 4;
		public static final int LST_AXS_RJOYSTICKY = 5;

		//POV Degress List
		public static final int LST_POV_UNPRESSED = -1;
		public static final int LST_POV_N = 0;
		public static final int LST_POV_NE = 45;
		public static final int LST_POV_E = 90;
		public static final int LST_POV_SE = 135;
		public static final int LST_POV_S = 180;
		public static final int LST_POV_SW = 225;
		public static final int LST_POV_W = 270;
		public static final int LST_POV_NW = 315;
}
