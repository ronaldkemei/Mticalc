package com.app.mticalc.helper;

import java.util.LinkedList;

import com.app.mticalc.R;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

public class UIHelper {	
	
	public static void setDefaultText(TextView mInfoText) {
	    mInfoText.setText(R.string.input_prompt);
	}
	public static void avg_volume(TextView avg_volume) {
	    avg_volume.setText(R.string.input_prompt2);
	}
	
	public static void setErrorText(TextView mInfoText) {
		mInfoText.setText(R.string.input_not_complete);
	}
	
	// Remember: TextView is super class of EditText
	public static boolean isEmpty (TextView... args ) {
		for (int i = 0 ; i < args.length; i++) {
			if (args[i].getText().toString().equals("")) {
				return true;
			} 
		}
		return false;
	}
	
	public static boolean isEmpty (LinkedList<EditText> editTextList) {
		for (int i = 0 ; i < editTextList.size(); i++) {
			if (editTextList.get(i).getText().toString().equals("")) {
				return true;
			} 
		}
		return false;
	}
	
	public static void setEditTextAlert(Context context, EditText... args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].getText().toString().equals("")) {
				args[i].setError(context.getResources().getString(R.string.enter_value));
			}
		}
	}
	
	public static void setEditTextAlert(Context context, LinkedList<EditText> editTextList) {
		for (int i = 0; i < editTextList.size(); i++) {
			if (editTextList.get(i).getText().toString().equals("")) {
				editTextList.get(i).setError(context.getResources().getString(R.string.enter_value));
			}
		}
	}
}


