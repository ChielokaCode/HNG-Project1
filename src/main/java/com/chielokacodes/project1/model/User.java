package com.chielokacodes.project1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    public String client_ip;
    public String location;
    public String greeting;
}
