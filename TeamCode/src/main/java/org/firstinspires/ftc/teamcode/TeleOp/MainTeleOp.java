package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.DriveTrain;


@TeleOp(name = "Main TeleOp")
public class MainTeleOp extends OpMode
{
    DriveTrain drivetrain = new DriveTrain();
    double forward, strafe, rotate;

    public void init()
    {
        drivetrain.initDrivetrain(hardwareMap);
    }

    public void loop()
    {
        forward = -gamepad1.right_stick_y;
        strafe = gamepad1.right_stick_x;
        rotate = gamepad1.left_stick_x;
        drivetrain.drive(forward, strafe, rotate);
    }
}


