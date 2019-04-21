package com.hand.ssm.dto;

public class Column {
    private long id;
    private String name;
    private String chinese_name;
    private String ext;
    private byte yn;


    public Column() {

    }

    public Column(long id, String name, String chinese_name, String ext, byte yn) {
        this.id = id;
        this.name = name;
        this.chinese_name = chinese_name;
        this.ext = ext;
        this.yn = yn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChinese_name() {
        return chinese_name;
    }

    public void setChinese_name(String chinese_name) {
        this.chinese_name = chinese_name;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public byte getYn() {
        return yn;
    }

    public void setYn(byte yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "Column [name=" + name + ", chinese_name=" + chinese_name + ", ext=" + ext + "]";
    }
}
