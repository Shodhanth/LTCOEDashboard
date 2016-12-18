package net.ltjss.ltce.ltcoedashborard.Utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import net.ltjss.ltce.ltcoedashborard.R;

/**
 * Created by a0_ on 18/12/16.
 */
public class FloatingTextWatcher implements TextWatcher {

    private View mView;

    public FloatingTextWatcher(View mView) {
        this.mView = mView;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        switch (mView.getId()){
        }
    }
}
