package com.barclays.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Offers {
    private String oid;
    private String name;
    private String desc;
    private String expDate;
    private String imgUrl;
}
