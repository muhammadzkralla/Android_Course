package com.zkrallah.fragments.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.zkrallah.fragments.ui.CallsFragment;
import com.zkrallah.fragments.ui.ChatsFragment;
import com.zkrallah.fragments.ui.StoriesFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    // Constructor to pass the Activity that will host our fragments. (Like Context)
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    // Here we switch between the fragment that is shown in the host activity.
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChatsFragment();
            case 1:
                return new StoriesFragment();
            case 2:
                return new CallsFragment();
            default:
                return new ChatsFragment();
        }
    }

    // Total count of fragments we will host.
    @Override
    public int getItemCount() {
        return 3;
    }
}
