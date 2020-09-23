package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "template")
public class template extends LinearOpMode {
    Robot robot = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        // when the start button is pressed, this runs
        // whenever the end button
        while(autonomousHasStarted()){

        }
    }

    public boolean autonomousHasStarted(){
        long currTime = System.currentTimeMillis();
        if(opModeIsActive()){
            if(currTime < 30000) {
                return true;
            }
        }
        return false;
    }
}
