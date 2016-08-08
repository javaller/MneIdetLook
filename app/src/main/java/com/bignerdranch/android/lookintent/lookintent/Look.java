package com.bignerdranch.android.lookintent.lookintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Home on 06.08.2016.
 */
public class Look {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mValuing;


    public Look() {
        // Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isValuing() {
        return mValuing;
    }

    public void setValuing(boolean mValuing) {
        this.mValuing = mValuing;
    }
}