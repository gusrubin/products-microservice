package com.abinbev.ecommerce.products.web.security;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicCredential {

	private String username;
	private String password;

}
