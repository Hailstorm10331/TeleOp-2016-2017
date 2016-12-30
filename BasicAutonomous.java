package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

//package org.firstinspires.ftc.robotcontroller.external.samples;


@TeleOp(name="Basic Autonomous", group="Autonomous")

//@Disabled
/**The "@Disabled" in the line above this comment indicates whether or not the opmode will be
 * shown in the opmode list inside the Driver Station app.
 * */

public class Basic Autonomous extends LinearOpMode {
    /* Note:
     * When you extend OpMode, you must declare the methods init() and loop()
     */


    /** Declaring electronics
     * This can be done with a separate class and can make creating code much easier / simpler. */
    private DcMotorController motorControllerP1;    // Motor Controller in port 1 of Core
    private DcMotorController motorControllerP2;    // Motor Controller in port 2 of Core

    private DcMotor controller1_motorR;                         // port 1 in Motor Controller 1
    private DcMotor controller1_motorL;                         // port 2 in Motor Controller 1
    private DcMotor controller2_motorR;                         // port 1 in Motor Controller 2
    private DcMotor controller2_motorL;                         // port 2 in Motor Controller 2

    
    @Override
    public void runOpMode throws InterruptedException() {
        /** Initializing and mapping electronics (motors, motor controllers, servos, etc.) */
        motorControllerP1 = hardwareMap.dcMotorController.get("MCP0");
        motorControllerP2 = hardwareMap.dcMotorController.get("MCP1");

        controller1_motorR = hardwareMap.dcMotor.get("motorFrontR");
        controller1_motorL = hardwareMap.dcMotor.get("motorFrontL");
        controller2_motorL = hardwareMap.dcMotor.get("motorBack2");       
        controller2_motorR = hardwareMap.dcMotor.get("motorBack1");

        //Setting channel modes
       
        controller1_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller1_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        //Start of the Autonomous Code
        motor1.setDirection(DcMotorSimple.Direction.REVERSE);
        motor3.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        /* This is where the autonomous code will start
         */

        MoveForward(0.5, 1000/*milliseconds*/);
    }

    public void MoveForward(double power, long time)throws InterruptedException{
        motor1.setPower(power);
        motor2.setPower(power);
        motor3.setPower(power);
        motor4.setPower(power);

        Thread.sleep(time);

    }
}
     



/* Notes about Autonomous
 
 
 RED: 
 
 Goes to the first beacon
 Goes to the second beacon
 Goes to the triangle of the red color with enough speed when stopping to push the cap ball off of the triangle

BLUE: 
 Do the same for the BLUE but direction of movement will change

 
 Also, we'll need to be able to set the color before going (some mechanism to do that)
     
 Also, Color sensor is connected to port 5
        
        
*/

    


