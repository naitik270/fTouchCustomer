package com.ftouchcustomer.OTP;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClsSendOtpResponse {

    @SerializedName("success")
    @Expose
    private String success;

    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
