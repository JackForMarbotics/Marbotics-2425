package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name="AutoBlueFar2425", group="Auto")

public class AutoBlueFar2425 extends LinearOpMode {

    DcMotor leftFrontMotor;
    DcMotor rightFrontMotor;
    DcMotor leftRearMotor;
    DcMotor rightRearMotor;
    //Servo Crunches;
    //Servo Crunches2;    
    Double turnPower = .6;


 public void stopMotors() {
            leftFrontMotor.setPower(0);
            rightFrontMotor.setPower(0);
            leftRearMotor.setPower(0);
            rightRearMotor.setPower(0);
        }

    public void runOpMode() {

        telemetry.addData("status", "ready to run");
        telemetry.update();

        leftFrontMotor = hardwareMap.dcMotor.get("left_motorFront");
        rightFrontMotor = hardwareMap.dcMotor.get("right_motorFront");
        leftRearMotor = hardwareMap.dcMotor.get("left_motorRear");
        rightRearMotor = hardwareMap.dcMotor.get("right_motorRear");
      //  claw1 = hardwareMap.servo.get("claw1");
      // claw2 = hardwareMap.servo.get("claw2");

        
        leftFrontMotor.setDirection(DcMotor.Direction.REVERSE);
        leftRearMotor.setDirection(DcMotor.Direction.REVERSE);
        
        waitForStart();
        
       /* claw1.setPosition(0.5);
       claw2.setPosition(0.4); */
        
        sleep (9550);

        //this is when the robot starts to move
        leftFrontMotor.setPower(0.5);
        rightFrontMotor.setPower(0.5);
        leftRearMotor.setPower(0.5);
        rightRearMotor.setPower(0.5);

        sleep(100);

        stopMotors();

        sleep(50);

        leftFrontMotor.setPower(turnPower);
        rightFrontMotor.setPower(-turnPower);
        leftRearMotor.setPower(turnPower);
        rightRearMotor.setPower(-turnPower);

        sleep(850);

        stopMotors();
        
        sleep(100);
 
        leftFrontMotor.setPower(0.7);
        rightFrontMotor.setPower(0.7);
        leftRearMotor.setPower(0.7);
        rightRearMotor.setPower(0.7);
        
        sleep(4100);

        leftFrontMotor.setPower(turnPower);
        rightFrontMotor.setPower(-turnPower);
        leftRearMotor.setPower(turnPower);
        rightRearMotor.setPower(-turnPower);

        sleep(500);

        leftFrontMotor.setPower(0.7);
        rightFrontMotor.setPower(0.7);
        leftRearMotor.setPower(0.7);
        rightRearMotor.setPower(0.7);

        sleep(1000);

        leftFrontMotor.setPower(turnPower);
        rightFrontMotor.setPower(-turnPower);
        leftRearMotor.setPower(turnPower);
        rightRearMotor.setPower(-turnPower);

        leftFrontMotor.setPower(0.7);
        rightFrontMotor.setPower(0.7);
        leftRearMotor.setPower(0.7);
        rightRearMotor.setPower(0.7);
        
        sleep(7000);

        leftFrontMotor.setPower(turnPower);
        rightFrontMotor.setPower(-turnPower);
        leftRearMotor.setPower(turnPower);
        rightRearMotor.setPower(-turnPower);

        sleep(1000);

        leftFrontMotor.setPower(0.5);
        rightFrontMotor.setPower(0.5);
        leftRearMotor.setPower(0.5);
        rightRearMotor.setPower(0.5);

        sleep(1000);

    }

} 

