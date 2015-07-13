package com.jattcode.fragment;

import android.app.Activity;

/**
 * Created by Javan on 13/7/2015.
 */
public abstract class ScreenFragment extends BaseLoggerFragment implements Screen {

    protected ScreenSwitcher getSwitcher() {
        return ((ScreenCompatActivity)getActivity()).getSwitcher();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof ScreenCompatActivity)) {
            throw new IllegalStateException(
                "Can only attach ScreenFragment to ScreenCompatActivity");
        }
    }

    /**
     * Each fragment should be able to handle their own backpress
     *
     * @return true to all allow caller to continue handling backpress
     * @return false to interrupt and handle the backpress
     */
    @Override
    public boolean onBackPressed() {
        return true;
    }
}
