package com.example.seri.hackathon20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.braintreepayments.api.BraintreeFragment;
import com.braintreepayments.api.exceptions.InvalidArgumentException;

public class CreatePaymentMethod extends AppCompatActivity {

    private BraintreeFragment mBraintreeFragment;

    final String AUTHORIZATION_FROM_SERVER = "sandbox_z56khzyw_gqngz2by639stypk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_payment_method);

        try {
            mBraintreeFragment = BraintreeFragment.newInstance(this, AUTHORIZATION_FROM_SERVER);
        } catch (InvalidArgumentException e) {
            // the authorization provided was of an invalid form
        }
    }
}
