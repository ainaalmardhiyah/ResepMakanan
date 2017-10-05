package com.example.aina.resepmakanan;

import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by ASUS on 04/10/2017.
 */

public class ListResep {
    private String judulResep;
    private int gambarResep;
    private String deskripsiResep;
    private int GambarDetail;
    private String DeskripsiDetail;
    private String JudulDetail;

    public ListResep(String judulResep, int gambarResep, String deskripsiResep, int gambarDetail, String deskripsiDetail, String judulDetail) {
        this.judulResep = judulResep;
        this.gambarResep = gambarResep;
        this.deskripsiResep = deskripsiResep;
        GambarDetail = gambarDetail;
        DeskripsiDetail = deskripsiDetail;
        JudulDetail = judulDetail;
    }

    public String getJudulResep() {
        return judulResep;
    }

    public int getGambarResep() {
        return gambarResep;
    }

    public String getDeskripsiResep() {
        return deskripsiResep;
    }

    public int getGambarDetail() {
        return GambarDetail;
    }

    public String getDeskripsiDetail() {
        return DeskripsiDetail;
    }

    public String getJudulDetail() {
        return JudulDetail;
    }
}
