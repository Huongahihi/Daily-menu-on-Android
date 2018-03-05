package com.huongtlu.app_thuc_don;

/**
 * Created by BEHUONG on 3/4/2018.
 */

public class GhiChu_update {
    private  int IdGC;
    private String TenGC;

    public GhiChu_update(int idGC, String tenGC) {
        IdGC = idGC;
        TenGC = tenGC;
    }

    public int getIdGC() {
        return IdGC;
    }

    public void setIdGC(int idGC) {
        IdGC = idGC;
    }

    public String getTenGC() {
        return TenGC;
    }

    public void setTenGC(String tenGC) {
        TenGC = tenGC;
    }
}
