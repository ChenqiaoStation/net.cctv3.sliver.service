package net.cctv3.sliver.entity;

public class FundIndustry {
    private int id;
    private String name;
    private String description;
    private int deleted;
    private String create_time;
    private String delete_time;

    public FundIndustry() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getDelete_time() {
        return delete_time;
    }

    public void setDelete_time(String delete_time) {
        this.delete_time = delete_time;
    }
}