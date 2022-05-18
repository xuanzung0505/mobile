package com.example.mobile.view.UserActivity.main.activities;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mobile.view.UserActivity.main.fragments.CartFragment;
import com.example.mobile.view.UserActivity.main.fragments.HomeFragment;
import com.example.mobile.view.UserActivity.main.fragments.UserProfileFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private HomeFragment homeFragment;
    private CartFragment cartFragment;
    private UserProfileFragment userProfileFragment;
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, HomeFragment homeFragment, CartFragment cartFragment, UserProfileFragment userProfileFragment) {
        super(fragmentActivity);
        this.homeFragment = homeFragment;
        this.cartFragment = cartFragment;
        this.userProfileFragment = userProfileFragment;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return homeFragment;
            case 1:
                return cartFragment;
            case 2:
                return userProfileFragment;
            default:
                return homeFragment;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public CartFragment getCartFragment() {
        return cartFragment;
    }
}