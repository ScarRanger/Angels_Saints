package com.rhinepereira.saints;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.jetbrains.annotations.NotNull;

public class ViewPageAdapter5 extends FragmentStateAdapter {
    public ViewPageAdapter5(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HailFragment();
            case 1:
                return new HailMarFragment();
            default:
                return new HailFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

