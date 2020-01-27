package com.hello.chat;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

interface ViewPagerAdapter {
    Fragment getItem(int position);

    int getCount();

    @Nullable
    CharSequence getPageTitle(int position);
}
