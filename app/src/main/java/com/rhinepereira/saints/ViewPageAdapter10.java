package com.rhinepereira.saints;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.jetbrains.annotations.NotNull;

public class ViewPageAdapter10 extends FragmentStateAdapter {
    public ViewPageAdapter10(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new LitanyFragment();
            case 1:
                return new LitanyMarFragment();
            default:
                return new LitanyFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

