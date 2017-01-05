        controller2_motorL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
         controller2_motorR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
         
-        //Start of the Autonomous Code
+        
         motor1.setDirection(DcMotorSimple.Direction.REVERSE);
         motor3.setDirection(DcMotorSimple.Direction.REVERSE);
 
+        //Start of the Autonomous Code
         waitForStart();
         /* This is where the autonomous code will start...
          */
 
         MoveForward(0.5, 1000/*milliseconds*/);
+        TurnRight(.5,1000);
     }
 
     public void MoveForward(double power, long time)throws InterruptedException{
         motor1.setPower(power);
         motor2.setPower(power);
         motor3.setPower(power);
         motor4.setPower(power);
 
         Thread.sleep(time);
 
     }
-}
+    
+
+    public void TurnRight(double power, long time)throws InterruptedException{
+        motor1.setPowwer(-power);
+        motor2.setPower(power);
+        motor3.setPoewr(-power);
+        motor4.setPower(power);
+ 
+         Thread.sleep(time);
+    }
      
 
 
 
 /* Notes about Autonomous
  
  
  RED: 
  
  Goes to the first beacon
  Goes to the second beacon
  Goes to the triangle of the red color with enough speed when stopping to push the cap ball off of the triangle
 
 BLUE: 
  Do the same for the BLUE but direction of movement will change
 
  
  Also, we'll need to be able to set the color before going (some mechanism to do that)
      
  Also, Color sensor is connected to port 5
         
         
