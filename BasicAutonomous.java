package org.firstinspires.ftc.teamcode;

/**
Robot starts --> Robot turns right --> Robot goes straight until it hits the wall using the rouch sensor in the front
--> once it hits the wall, turn left



/**
 * Created by Alex on 10/12/2016.
 */

/**
 *
 * NOTE: THIS IS NOT INTENDED TO BE USED AS A FULLY FUNCTIONING AUTONOMOUS. THIS CLASS IS INTENDED
 *       TO BE USED FOR DEMONSTRATIVE / EDUCATIONAL PURPOSES.
 *
 * Some things that I have noticed that are different / better:
 *
 * - Hardware classes can be created so that multiple other classes can use the same hardware
 *   without needing to retype it everytime.
 * - Different alternate way to register op modes.
 * -
 *
 *
 * */
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

//package org.firstinspires.ftc.robotcontroller.external.samples;


@TeleOp(name="Basic Autonomous", group="Autonomous")
/**The line above demonstrates the new way to register opmodes inside the code. This method cannot
 * be used in FTC apps prior to version 2. (Update your phones to have matching version numbers
 * and version 2 of the FTC apps.)
 */
//@Disabled
/**The "@Disabled" in the line above this comment indicates whether or not the opmode will be
 * shown in the opmode list inside the Driver Station app.
 * */

public class ThunderBasicAuto2016_2017 extends OpMode {
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

    /* Declaring variables */

    @Override
    public void init() {
        /** Initializing and mapping electronics (motors, motor controllers, servos, etc.) */
        motorControllerP1 = hardwareMap.dcMotorController.get("MCP0");
        motorControllerP2 = hardwareMap.dcMotorController.get("MCP1");

        controller1_motorR = hardwareMap.dcMotor.get("motorFrontR");
        controller1_motorL = hardwareMap.dcMotor.get("motorFrontL");
        controller2_motorL = hardwareMap.dcMotor.get("motorBack2");       //Don't have the wiring to access Controller 2
        controller2_motorR = hardwareMap.dcMotor.get("motorBack1");

        /**Setting channel modes
         *  When setting channel modes,  use the names that are declared to the motors. */
        controller1_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller1_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        controller2_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }
    @Override
    public void loop() {
        /*
        To do:
        1. Set Color
        2. Move forward
        3. Turn right(blue) left(red)
        4. Activate color sensor to find the white line
        5. Move forward
        6. When white line is found, follow for a certain distance. 
        7. Activate color sensor in front
        8. Sensing right side first. If color matches Team color, move forward, pressing the button.
           If not, move left then move forward. 
        
        ==>
            - Turn on the color sensor
            - Detect the button
     
        
        ** Color sensor is connected to port 5
        
        
        */

    }

}
