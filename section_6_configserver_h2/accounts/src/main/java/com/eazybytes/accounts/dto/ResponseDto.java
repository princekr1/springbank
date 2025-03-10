package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        name = "Response",
        description = "Schema to hold Successful response Information"
)
public class ResponseDto {

    @Schema(
            description = "Status code in the response", example = "200"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the response", example = "Request processed successfully"
    )
    private String statusMsg;

    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "statusCode='" + statusCode + '\'' +
                ", statusMsg='" + statusMsg + '\'' +
                '}';
    }
}
