package com.rhinepereira.saints;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.jetbrains.annotations.NotNull;

public class ViewPageAdapter6 extends FragmentStateAdapter {
    public ViewPageAdapter6(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FatimaFragment();
            case 1:
                return new FatimaMarFragment();
            default:
                return new FatimaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

