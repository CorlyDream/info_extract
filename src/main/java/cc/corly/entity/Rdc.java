package cc.corly.entity;

import java.util.Date;

public class Rdc {
    private Integer id;

    private String name;

    private String address;

    private Date addtime;

    private Integer type;

    private Float capacity;

    private Float sqm;

    private String struct;

    private String storagetype;

    private String coldtype;

    private Integer provinceid;

    private Integer cityid;

    private String contact;

    private String position;

    private String cellphone;

    private String phone;

    private Float powerconsume;

    private Integer userid;

    private Byte audit;

    private String mapping;

    private String commit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Float getSqm() {
        return sqm;
    }

    public void setSqm(Float sqm) {
        this.sqm = sqm;
    }

    public String getStruct() {
        return struct;
    }

    public void setStruct(String struct) {
        this.struct = struct == null ? null : struct.trim();
    }

    public String getStoragetype() {
        return storagetype;
    }

    public void setStoragetype(String storagetype) {
        this.storagetype = storagetype == null ? null : storagetype.trim();
    }

    public String getColdtype() {
        return coldtype;
    }

    public void setColdtype(String coldtype) {
        this.coldtype = coldtype == null ? null : coldtype.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Float getPowerconsume() {
        return powerconsume;
    }

    public void setPowerconsume(Float powerconsume) {
        this.powerconsume = powerconsume;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getAudit() {
        return audit;
    }

    public void setAudit(Byte audit) {
        this.audit = audit;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping == null ? null : mapping.trim();
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit == null ? null : commit.trim();
    }
}