package app.mmvtest.com.mvvmapp;

import android.os.Bundle;
import android.widget.Toast;

import app.mhdthasneemp.mvvmbase.base.BaseActivity;
import app.mmvtest.com.mvvmapp.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding, MyModel> implements MainNavigator {

    private MyModel myModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MyModel getViewModel() {
        return myModel = new MyModel();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myModel.setNavigator(this);
    }

    @Override
    public void showToast() {
        if (isNetworkAvailable()) {
            Toast.makeText(this, "Network available", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Network not available", Toast.LENGTH_SHORT).show();
        }
    }
}
