package excel.alibaba;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;


//对应excel的每一列
public class MapData  extends BaseRowModel {



    @ExcelProperty(index = 0)
    private String hotelId;  //tuniu酒店id


    @ExcelProperty(index = 1)
    private String vendorHotelId;

    @ExcelProperty(index = 2)
    private String vendorId;

    @ExcelProperty(index = 3)
    private String vendorName;

    @ExcelProperty(index = 5)
    private String status;

    @ExcelProperty(index = 6)
    private String score;

    @ExcelProperty(index = 7)
    private String onlineFlag;

    @ExcelProperty(index = 8)
    private String vendorCityName;

    @ExcelProperty(index = 9)
    private String vendorHotelName;

    @ExcelProperty(index = 10)
    private String vendorHotelNameEn;

    @ExcelProperty(index = 11)
    private String vendorAddress;

    @ExcelProperty(index = 12)
    private String vendorLat;

    @ExcelProperty(index = 13)
    private String vendorLot;

    @ExcelProperty(index = 14)
    private String vendorTel;

    @ExcelProperty(index = 15)
    private String vendorFax;

    @ExcelProperty(index = 16)
    private String vendorWebsite;

    @ExcelProperty(index = 17)
    private String cityCode;

    @ExcelProperty(index = 18)
    private String cityName;

    @ExcelProperty(index = 19)
    private String cityNameEn;

    @ExcelProperty(index = 20)
    private String provinceCode;

    @ExcelProperty(index = 21)
    private String provinceName;

    @ExcelProperty(index = 22)
    private String provinceNameEn;

    @ExcelProperty(index = 23)
    private String countryCode;

    @ExcelProperty(index = 24)
    private String countryName;

    @ExcelProperty(index = 25)
    private String countryNameEn;

    @ExcelProperty(index = 26)
    private String continentCode;

    @ExcelProperty(index = 27)
    private String continentName;

    @ExcelProperty(index = 28)
    private String continentNameEn;

    @ExcelProperty(index = 29)
    private String 	hotelName;

    @ExcelProperty(index = 30)
    private String hotelNameEn;

    @ExcelProperty(index = 31)
    private String delFlag;

    @ExcelProperty(index = 32)
    private String synFlag;

    @ExcelProperty(index = 33)
    private String createTime;

    @ExcelProperty(index = 34)
    private String updateTime;

    @ExcelProperty(index = 35)
    private String updateUid;

    @ExcelProperty(index = 36)
    private String updateName;

    @ExcelProperty(index = 37)
    private String vendorCityCode;

    @ExcelProperty(index = 38)
    private String pushFlag;

    @ExcelProperty(index = 39)
    private String pushTime;

    @ExcelProperty(index = 40)
    private String offlineType;

    private String newVendorCityCode;
    private String newVendorCityName;
    private String newVendorCityNameEn;
    private String newVendorHotelId;



    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorHotelId() {
        return vendorHotelId;
    }

    public void setVendorHotelId(String vendorHotelId) {
        this.vendorHotelId = vendorHotelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getOnlineFlag() {
        return onlineFlag;
    }

    public void setOnlineFlag(String onlineFlag) {
        this.onlineFlag = onlineFlag;
    }

    public String getVendorCityName() {
        return vendorCityName;
    }

    public void setVendorCityName(String vendorCityName) {
        this.vendorCityName = vendorCityName;
    }

    public String getVendorHotelName() {
        return vendorHotelName;
    }

    public void setVendorHotelName(String vendorHotelName) {
        this.vendorHotelName = vendorHotelName;
    }

    public String getVendorHotelNameEn() {
        return vendorHotelNameEn;
    }

    public void setVendorHotelNameEn(String vendorHotelNameEn) {
        this.vendorHotelNameEn = vendorHotelNameEn;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorLat() {
        return vendorLat;
    }

    public void setVendorLat(String vendorLat) {
        this.vendorLat = vendorLat;
    }

    public String getVendorLot() {
        return vendorLot;
    }

    public void setVendorLot(String vendorLot) {
        this.vendorLot = vendorLot;
    }

    public String getVendorTel() {
        return vendorTel;
    }

    public void setVendorTel(String vendorTel) {
        this.vendorTel = vendorTel;
    }

    public String getVendorFax() {
        return vendorFax;
    }

    public void setVendorFax(String vendorFax) {
        this.vendorFax = vendorFax;
    }

    public String getVendorWebsite() {
        return vendorWebsite;
    }

    public void setVendorWebsite(String vendorWebsite) {
        this.vendorWebsite = vendorWebsite;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityNameEn() {
        return cityNameEn;
    }

    public void setCityNameEn(String cityNameEn) {
        this.cityNameEn = cityNameEn;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceNameEn() {
        return provinceNameEn;
    }

    public void setProvinceNameEn(String provinceNameEn) {
        this.provinceNameEn = provinceNameEn;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryNameEn() {
        return countryNameEn;
    }

    public void setCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentNameEn() {
        return continentNameEn;
    }

    public void setContinentNameEn(String continentNameEn) {
        this.continentNameEn = continentNameEn;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelNameEn() {
        return hotelNameEn;
    }

    public void setHotelNameEn(String hotelNameEn) {
        this.hotelNameEn = hotelNameEn;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getSynFlag() {
        return synFlag;
    }

    public void setSynFlag(String synFlag) {
        this.synFlag = synFlag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getVendorCityCode() {
        return vendorCityCode;
    }

    public void setVendorCityCode(String vendorCityCode) {
        this.vendorCityCode = vendorCityCode;
    }

    public String getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(String pushFlag) {
        this.pushFlag = pushFlag;
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime;
    }

    public String getOfflineType() {
        return offlineType;
    }

    public void setOfflineType(String offlineType) {
        this.offlineType = offlineType;
    }

    public String getNewVendorCityCode() {
        return newVendorCityCode;
    }

    public void setNewVendorCityCode(String newVendorCityCode) {
        this.newVendorCityCode = newVendorCityCode;
    }

    public String getNewVendorCityName() {
        return newVendorCityName;
    }

    public void setNewVendorCityName(String newVendorCityName) {
        this.newVendorCityName = newVendorCityName;
    }

    public String getNewVendorCityNameEn() {
        return newVendorCityNameEn;
    }

    public void setNewVendorCityNameEn(String newVendorCityNameEn) {
        this.newVendorCityNameEn = newVendorCityNameEn;
    }

    public String getNewVendorHotelId() {
        return newVendorHotelId;
    }

    public void setNewVendorHotelId(String newVendorHotelId) {
        this.newVendorHotelId = newVendorHotelId;
    }
}
