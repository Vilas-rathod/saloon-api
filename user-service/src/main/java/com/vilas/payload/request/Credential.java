package com.vilas.payload.request;

import lombok.Data;

@Data
public class Credential {

        private String type;
        private String value;
        private boolean temporary;

}
