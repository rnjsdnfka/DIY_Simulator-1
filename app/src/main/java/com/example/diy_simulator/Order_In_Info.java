package com.example.diy_simulator;


import android.os.Parcel;
import android.os.Parcelable;

public class Order_In_Info implements Parcelable {
    private String name;
    private String price;
    private String preview_img_url;
    private String[] img_url;
    private String width;
    private String height;
    private String depth;
    private String keyword;
    private String stock;
    private String storename;
    private String unique_number;
    private String category;
    private int amount;
    private boolean checkBox;

    public Order_In_Info(String name, String price, String preview_img_url, String[] img_url, String width, String height, String depth,
                                  String keyword, String stock, String storename, String unique_number, String category, int amount) {
        this.name = name;
        this.price = price;
        this.preview_img_url = preview_img_url;
        this.img_url = img_url;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.keyword = keyword;
        this.stock = stock;
        this.storename = storename;
        this.unique_number = unique_number;
        this.category = category;
        this.amount = amount;
        this.checkBox = true;
    }


    protected Order_In_Info(Parcel in) {
        name = in.readString();
        price = in.readString();
        preview_img_url = in.readString();
        img_url = in.createStringArray();
        width = in.readString();
        height = in.readString();
        depth = in.readString();
        keyword = in.readString();
        stock = in.readString();
        storename = in.readString();
        unique_number = in.readString();
        category = in.readString();
        amount = in.readInt();
        checkBox = in.readByte() != 0;
    }

    public static final Creator<Order_In_Info> CREATOR = new Creator<Order_In_Info>() {
        @Override
        public Order_In_Info createFromParcel(Parcel in) {
            return new Order_In_Info(in);
        }

        @Override
        public Order_In_Info[] newArray(int size) {
            return new Order_In_Info[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPreview_img_url() {
        return preview_img_url;
    }

    public void setPreview_img_url(String preview_img_url) {
        this.preview_img_url = preview_img_url;
    }

    public String[] getImg_url() {
        return img_url;
    }

    public void setImg_url(String[] img_url) {
        this.img_url = img_url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getUnique_number() {
        return unique_number;
    }

    public void setUnique_number(String unique_number) {
        this.unique_number = unique_number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(price);
        dest.writeString(preview_img_url);
        dest.writeStringArray(img_url);
        dest.writeString(width);
        dest.writeString(height);
        dest.writeString(depth);
        dest.writeString(keyword);
        dest.writeString(stock);
        dest.writeString(storename);
        dest.writeString(unique_number);
        dest.writeString(category);
        dest.writeInt(amount);
        dest.writeByte((byte) (checkBox ? 1 : 0));
    }
}