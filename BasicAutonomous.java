package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Autonomous", group="Iterative Opmode")  // @Autonomous(...) is the other common choice
@Disabled
public class Autonomous extends LinearOpMode
{

    private DcMotor fr, fl, br, bl;

    @Override
    public void runOpMode() {
        fr = hardwareMap.dcMotor.get("fr");
        fl = hardwareMap.dcMotor.get("fl");
        br = hardwareMap.dcMotor.get("br");
        bl = hardwareMap.dcMotor.get("bl");            //?declaring variables for the motors ?When did we declare the motors?

        fl.setDirection(DcMotor.Direction.REVERSE);
        bl.setDirection(DcMotor.Direction.REVERSE);    //Moving of the wheels

        fr.setPower(1);
        fl.setPower(1);
        br.setPower(1);
        bl.setPower(1);                       //This is moving the wheels each time gamepad is moved
        sleep(7000);
    }

}


