package lemuel.lemubit.com.biometricattendance.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lemuel.lemubit.com.biometricattendance.R;
import lemuel.lemubit.com.biometricattendance.view.fragment.RegistrationInfoFragment;
import lemuel.lemubit.com.biometricattendance.view.fragment.RegistrationLeftHandFragment;
import lemuel.lemubit.com.biometricattendance.view.fragment.RegistrationRightHandFragment;
import lemuel.lemubit.com.biometricattendance.view.fragment.RegistrationTakePicFragment;

public class NewCaptureActivity extends AppCompatActivity implements
        RegistrationInfoFragment.RegistrationInfoListener,
        RegistrationTakePicFragment.RegistrationTakePicListener,
        RegistrationLeftHandFragment.RegistrationLeftHandListener,
        RegistrationRightHandFragment.RegistrationRightHandListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_capture);
    }

    @Override
    public void onUserInfoGotten() {

    }

    @Override
    public void onUserPicGotten() {

    }

    @Override
    public void onLeftHandRegistered() {

    }

    @Override
    public void onRightHandRegistered() {

    }
}