package org.firstinspires.ftc.teamcode.OpModes;

import com.pedropathing.follower.Follower;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.pedro.Constants;

@TeleOp
public class TeleOpTest extends OpMode {

    // Definindo Objetos
    Follower follower;

    @Override
    public void init()
    {
        // Objeto ponteiro do Pedro
        // Constants são outros ponteiros porém de configuração (sim desnecessáriamente complexo)
        follower = new Follower(Constants.localizer, Constants.drivetrain, Constants.algorithm);
    }

    @Override
    public void loop()
    {
        double forward = -gamepad1.left_stick_y;
        double strafe = gamepad1.left_stick_x;
        double rotation = gamepad1.right_stick_x;

        follower.manual(forward, strafe, rotation);
        follower.update();
    }
}
