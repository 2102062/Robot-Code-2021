package frc.robot.command.auto.autopaths;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.command.auto.DriveLengthConstantCommand;
import frc.robot.command.auto.RotateConstantCommand;
import frc.robot.subsystem.DriveSubsystem;

public class TrianglePathCommandGroup extends SequentialCommandGroup {
    public TrianglePathCommandGroup(DriveSubsystem drive) {
        addCommands(
                new DriveLengthConstantCommand(48, drive),
                new RotateConstantCommand(120, drive),
                new DriveLengthConstantCommand(48, drive),
                new RotateConstantCommand(120, drive),
                new DriveLengthConstantCommand(48, drive),
                new RotateConstantCommand(120, drive)
        );
    }
}