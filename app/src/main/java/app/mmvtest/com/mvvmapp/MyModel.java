package app.mmvtest.com.mvvmapp;

import app.mhdthasneemp.mvvmbase.base.BaseViewModel;

public class MyModel extends BaseViewModel<MainNavigator> {

    public void showToast() {
        getNavigator().showToast();
    }
}
