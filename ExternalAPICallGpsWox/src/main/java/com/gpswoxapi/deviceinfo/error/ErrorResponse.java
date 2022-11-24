package com.gpswoxapi.deviceinfo.error;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import java.util.Date;


@Getter
@Setter
@Service
public class ErrorResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date timestamp;
    private int status;
    private String error;
    private String message;

}
