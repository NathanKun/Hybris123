/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 28 févr. 2018 16:18:51
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
import de.hybris.platform.yhacext.data.SampleMonitorResultData;
import java.util.List;

public  class SampleMonitorData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SampleMonitorData.results</code> property defined at extension <code>yhacext</code>. */
		
	private List<SampleMonitorResultData> results;
	
	public SampleMonitorData()
	{
		// default constructor
	}
	
		
	
	public void setResults(final List<SampleMonitorResultData> results)
	{
		this.results = results;
	}

		
	
	public List<SampleMonitorResultData> getResults() 
	{
		return results;
	}
	


}
