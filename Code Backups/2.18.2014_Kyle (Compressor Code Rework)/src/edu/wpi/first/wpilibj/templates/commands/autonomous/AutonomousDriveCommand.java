/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.autonomous;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Kyle Flynn
 */
public class AutonomousDriveCommand extends CommandBase {
    
    private float speed, curve;
    
    public AutonomousDriveCommand(float speed, float curve) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.speed = speed;
        this.curve = curve;
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        chassis.drive(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        chassis.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        chassis.stop();
    }
}
