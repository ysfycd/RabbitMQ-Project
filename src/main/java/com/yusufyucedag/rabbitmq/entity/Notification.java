package com.yusufyucedag.rabbitmq.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 
 * @author Yusuf Yucedag
 * @since 1.0
 * @date Dec 2, 2020
 */

@Data
public class Notification implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private Date date;
	
	private String message;
	
	private Boolean seen;
}
