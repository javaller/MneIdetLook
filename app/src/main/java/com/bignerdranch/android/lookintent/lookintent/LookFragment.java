package com.bignerdranch.android.lookintent.lookintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by Home on 06.08.2016.
 */
public class LookFragment extends Fragment {
    private Look mLook;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mValuingCheckBox;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLook = new Look();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_look, parent, false);     //явно заполняем представление фрагмента без включения в родителя
        mTitleField = (EditText)v.findViewById(R.id.look_title);
        mTitleField.addTextChangedListener(new TextWatcher() { // анонимный класс, который реализует интерфейс слушател TextWatcher
            public void onTextChanged(   //
                    CharSequence c, int start, int before, int count) {
                mLook.setTitle(c.toString());
            }
            public void beforeTextChanged(
                    CharSequence c, int start, int count, int after) {
                    // Здесь намеренно оставлено пустое место
            }
            public void afterTextChanged(Editable c) {
                    // И здесь тоже
            }
        });

        mDateButton = (Button)v.findViewById(R.id.look_date); // получение ссылки на новую кнопку
        mDateButton.setText(mLook.getDate().toString());
        mDateButton.setEnabled(false);   //блокировка кнопки

        mValuingCheckBox = (CheckBox)v.findViewById(R.id.look_valuing); // получение ссылки
        mValuingCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Назначение флага оценки лука
                mLook.setValuing(isChecked);
            }
        });
        return v; // объект View возвращает активность хосту
    }
}