package mobappdev.lecture20.badnetwork;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mobappdev.lecture20.Fragtivity;
import mobappdev.lecture20.R;

public class BadNetworkActivity extends Fragtivity {
    public static Intent newIntent(Context c) {
        return new Intent(c, BadNetworkActivity.class);
    }

    @Override
    public Fragment createFragment() {
        return BadNetworkFragment.newInstance();
    }
}
