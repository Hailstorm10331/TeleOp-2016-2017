package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Template: Iterative OpMode", group="Iterative Opmode")
@Disabled
public class HailstormTele extends OpMode {

    private DcMotor fr, fl, br, bl, arm;
    private double leftPower, rightPower, armPower;

    @Override
    public void init() {
        fr = hardwareMap.dcMotor.get("fr");
        fl = hardwareMap.dcMotor.get("fl");
        br = hardwareMap.dcMotor.get("br");
        bl = hardwareMap.dcMotor.get("bl");
        arm = hardwareMap.dcMotor.get("arm");

        fr.setDirection(DcMotor.Direction.REVERSE);
        br.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftPower = gamepad1.left_stick_y;
        rightPower = gamepad1.right_stick_y;
        armPower = gamepad2.left_stick_x;

        fr.setPower(rightPower);
        fl.setPower(leftPower);
        br.setPower(rightPower);
        bl.setPower(leftPower);
        arm.setPower(armPower);
    }

}
