package com;

import javax.jws.WebService;

@WebService
public interface Party {

	String display(String name);
}
