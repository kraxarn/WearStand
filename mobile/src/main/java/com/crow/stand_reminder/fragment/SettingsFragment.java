package com.crow.stand_reminder.fragment;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.crow.stand_reminder.R;

public class SettingsFragment extends PreferenceFragmentCompat
{
	@Override
	public void onCreatePreferences(Bundle savedInstanceState, String rootKey)
	{
		addPreferencesFromResource(R.xml.preferences);
	}
}