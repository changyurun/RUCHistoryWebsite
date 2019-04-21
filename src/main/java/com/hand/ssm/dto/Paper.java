package com.hand.ssm.dto;

import java.util.Date;

public class Paper {
    private long id;
    private String title;
    private long colunm_id;
    private String content;
    private String file_list;
    private String video;
    private Date create_time;
    private Date update_time;
    private byte yn;

    public Paper() {
    }

    public Paper(long id, String title, long colunm_id, String content, String file_list, String video, Date create_time, Date update_time, byte yn) {
        this.id = id;
        this.title = title;
        this.colunm_id = colunm_id;
        this.content = content;
        this.file_list = file_list;
        this.video = video;
        this.create_time = create_time;
        this.update_time = update_time;
        this.yn = yn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getColunm_id() {
        return colunm_id;
    }

    public void setColunm_id(long colunm_id) {
        this.colunm_id = colunm_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFile_list() {
        return file_list;
    }

    public void setFile_list(String file_list) {
        this.file_list = file_list;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public byte getYn() {
        return yn;
    }

    public void setYn(byte yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "Paper [title=" + title + "]";
    }

}
