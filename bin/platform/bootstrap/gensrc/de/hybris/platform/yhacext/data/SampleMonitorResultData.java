/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 28 févr. 2018 11:53:22
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.yhacext.data;

import java.io.Serializable;

public  class SampleMonitorResultData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SampleMonitorResultData.name</code> property defined at extension <code>yhacext</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>SampleMonitorResultData.duration</code> property defined at extension <code>yhacext</code>. */
		
	private Long duration;

	/** <i>Generated property</i> for <code>SampleMonitorResultData.message</code> property defined at extension <code>yhacext</code>. */
		
	private String message;
	
	public SampleMonitorResultData()
	{
		// default constructor
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setDuration(final Long duration)
	{
		this.duration = duration;
	}

		
	
	public Long getDuration() 
	{
		return duration;
	}
	
		
	
	public void setMessage(final String message)
	{
		this.message = message;
	}

		
	
	public String getMessage() 
	{
		return message;
	}
	


}
