package com.njdp.njdp_farmer.MyClass;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Administrator on 2016/4/26.
 * 农田信息类
 */
public class FarmlandInfo implements Serializable {
    private final DateFormat yyyymmdd_DateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
    private int id;                   //农田ID
    private String fm_token;         //用户登录后的token
    private float area;              //农田面积
    private String crops_kind;       //作物（耕作）类型
    private String operation_kind;  //作业类型
    private float unit_price;       //单价
    private String block_type;       //地块类型，规则/不规则
    private String province;         //省
    private String city;              //市
    private String county;            //县
    private String town;              //乡
    private String village;           //村
    private String longitude;         //经度
    private String latitude;          //纬度
    private String street_view;      //街景图片
    private Date start_time;          //最早作业时间
    private Date end_time;            //最晚作业时间
    private String status;            //作业状态
    private String remark;            //备注信息
    private String createtime;       //创建时间
    private String updatetime;       //修改时间
    private String PingJia; //评价
    private String StartCount;     //评价星级


    public FarmlandInfo()
    {
        id = 0;
        fm_token = "";
        area = 0;
        unit_price = 0;
        crops_kind = "";
        operation_kind = "";
        block_type = "";
        province = "";
        city= "";
        county = "";
        town = "";
        village = "";
        longitude = "";
        latitude = "";
        street_view = "";
        try {
            start_time = yyyymmdd_DateFormat.parse("1900-01-01");
            end_time = yyyymmdd_DateFormat.parse("1900-01-01");
        }
        catch (Exception ex)
        {
            start_time = null;
            end_time = null;
        }
        status = "";
        remark = "";
        createtime = "";
        updatetime = "";
        PingJia = "";
        StartCount="0";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFm_token() {
        return fm_token;
    }

    public void setFm_token(String fm_token) {
        this.fm_token = fm_token;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getCrops_kind() {
        return crops_kind;
    }

    public void setCrops_kind(String crops_kind) {
        this.crops_kind = crops_kind;
    }

    public String getOperation_kind() {
        return operation_kind;
    }

    public void setOperation_kind(String operation_kind) {
        this.operation_kind = operation_kind;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public String getBlock_type() {
        return block_type;
    }

    public void setBlock_type(String block_type) {
        this.block_type = block_type;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getStreet_view() {
        return street_view;
    }

    public void setStreet_view(String street_view) {
        this.street_view = street_view;
    }

    public String getStart_time_String() {
        return DateFormatString(start_time);
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public void setStart_time(String start_time) {
        try {
            this.start_time = yyyymmdd_DateFormat.parse(start_time);
        }catch (Exception ex){

        }
    }

    public String getEnd_time_String() {
        return DateFormatString(end_time);
    }

    public Date getEnd_time() {
        end_time.setHours(23);
        end_time.setMinutes(59);
        end_time.setSeconds(59);
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public void setEnd_time(String end_time) {
        try {
            this.end_time = yyyymmdd_DateFormat.parse(end_time);
        }catch (Exception ex){

        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String DateFormatString(Date date){
        try{
            return yyyymmdd_DateFormat.format(date);
        }
        catch (Exception e){
            return "";
        }
    }

    public Date StringFormatDate(String date){
        try{
            return yyyymmdd_DateFormat.parse(date);
        }
        catch (Exception e){
            return null;
        }
    }

    public String getPingJia() {
        return PingJia;
    }

    public void setPingJia(String pingJia) {
        PingJia = pingJia;
    }

    public String getStartCount() {
        return StartCount;
    }

    public void setStartCount(String startCount) {
        StartCount = startCount;
    }
}
