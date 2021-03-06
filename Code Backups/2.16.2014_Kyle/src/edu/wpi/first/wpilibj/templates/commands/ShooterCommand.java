package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Jackson
 */
public class ShooterCommand extends CommandBase {
    
    public ShooterCommand() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        shooter.shoot();
        Timer.delay(0.25);
        shooter.unshoot();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
