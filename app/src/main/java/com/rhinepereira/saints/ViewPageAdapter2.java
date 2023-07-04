package com.rhinepereira.saints;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.jetbrains.annotations.NotNull;

public class ViewPageAdapter2 extends FragmentStateAdapter {
    public ViewPageAdapter2(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CreedFragment();
            case 1:
                return new CreedMarFragment();
            default:
                return new CreedFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
