

        package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorController;
        import com.qualcomm.robotcore.hardware.Gamepad;
        import com.qualcomm.robotcore.util.Range;

/**
 * Created by citruseel on 10/14/2016.
 */

@TeleOp(name="Basic TeleOp", group="TeleOp")

public class HailstormBasicTeleOp2016_2017 extends OpMode {

    private DcMotorController motorControllerP1;    // Motor Controller in port 1 of Core
    private DcMotorController motorControllerP2;    // Motor Controller in port 2 of Core

    private DcMotor controller1_motorR;                         // port 1 in Motor Controller 1
    private DcMotor controller1_motorL;                         // port 2 in Motor Controller 1
    private DcMotor controller2_motorR;                         // port 1 in Motor Controller 2
    private DcMotor controller2_motorL;                         // port 2 in Motor Controller 2
    private DcMotor controller2_motorArm;                       // port


    @Override
    public void init() {
        /* Initializing and mapping electronics*/
        motorControllerP1 = hardwareMap.dcMotorController.get("MCP1");
        motorControllerP2 = hardwareMap.dcMotorController.get("MCP2");


        controller1_motorR = hardwareMap.dcMotor.get("motorFrontR");
        controller1_motorL = hardwareMap.dcMotor.get("motorFrontL");
        controller2_motorR = hardwareMap.dcMotor.get("motorBack2");
        controller2_motorL = hardwareMap.dcMotor.get("motorBack1");
        controller2_motorArm = hardwareMap.dcMotor.get("motorArm");

        /*Setting channel modes*/
        controller1_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller1_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorArm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);



    }

    @Override
    public void loop() {                                                                                                     //constant loop that rechecks about every 20ms
        double GearRatio = 1;
        double leftpower = Math.pow(gamepad1.left_stick_y * GearRatio, 3/*The power the value before is raised */);     //sets a value for power equal to the opposite of the value of the joysticks for the left
        double rightpower = Math.pow(gamepad1.right_stick_y * GearRatio, 3);//sets a value for power equal to the value of the joysticks for the right
        double armPower = Math.pow(gamepad2.right_stick_x * GearRatio, 3);

        leftpower = Range.clip(leftpower, -1, 1);//gamepad controllers have a value of 1 when you push it to its maximum foward
        armPower = range.clip(armPower, -1, 1);
        rightpower = Range.clip(rightpower, -1, 1);      //range of power, min first then max
        controller1_motorR.setPower(rightpower);                    //connects the value for power to the actual power of the motors
        controller1_motorL.setPower(leftpower);
        controller2_motorL.setPower(leftpower);
        controller2_motorR.setPower(rightpower);
        controller2_motorArm.setPower(armPower);



        telemetry.addData("LeftMotors", "Left Motor Power:" + leftpower);           //shows the data or text stated onto phone telemetry
        telemetry.addData("RightMotors", "Right Motor Power:" + rightpower);
        telemetry.addData("ArmMotor", "Arm Motor Power" + armPower);
    }

}

