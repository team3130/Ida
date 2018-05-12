/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3130.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3130.robot.OI;
import org.usfirst.frc.team3130.robot.Toggle;
import org.usfirst.frc.team3130.robot.Toggle.edgeType;
import org.usfirst.frc.team3130.robot.subsystems.Chassis;

/**
 * An example command.  You can replace me with your own command.
 */
public class DefaultDrive extends Command {
	Toggle<Boolean> t = new Toggle<>(true, false);
	public DefaultDrive() {
		// Use requires() here to declare subsystem dependencies
		requires(Chassis.getInstance());
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Chassis.driveArcade(0, 0, false);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		t.toggleStatusOnEdgeChange(OI.stickL.getRawButton(6), edgeType.kRisingEdge);
		double speed = -OI.stickL.getY();
		double speedR = -OI.stickR.getY();
		double turn = OI.stickR.getX();
		
		speed*=(OI.stickL.getZ()+1)/2;
		turn*=(OI.stickR.getZ()+1)/2;
		speedR*=(OI.stickR.getZ()+1)/2;
		//System.out.println(speed+" "+turn);
		
		if(t.getStatus()){
			Chassis.driveArcade(speed, turn, true);
		}else{
			Chassis.driveTank(speed, speedR, true);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Chassis.driveArcade(0, 0, false);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
