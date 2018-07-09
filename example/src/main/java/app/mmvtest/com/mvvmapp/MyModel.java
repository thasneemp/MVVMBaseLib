package app.mmvtest.com.mvvmapp;

import android.databinding.ObservableField;

import app.mhdthasneemp.mvvmbase.base.BaseViewModel;

public class MyModel extends BaseViewModel<MainNavigator> {

    private final ObservableField<String> textValue = new ObservableField<>();

    public void showToast() {
        getNavigator().showToast(textValue.get());
    }

    public ObservableField<String> getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue.set(textValue);
    }
}
