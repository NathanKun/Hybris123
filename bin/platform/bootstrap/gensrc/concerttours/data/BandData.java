/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 27 févr. 2018 14:34:27
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
package concerttours.data;

import java.io.Serializable;
import concerttours.data.TourSummaryData;
import java.util.List;

/**
 * Data object representing a Band
 */
public  class BandData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>BandData.id</code> property defined at extension <code>concerttours</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>BandData.name</code> property defined at extension <code>concerttours</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>BandData.description</code> property defined at extension <code>concerttours</code>. */
		
	private String description;

	/** <i>Generated property</i> for <code>BandData.albumsSold</code> property defined at extension <code>concerttours</code>. */
		
	private Long albumsSold;

	/** <i>Generated property</i> for <code>BandData.genres</code> property defined at extension <code>concerttours</code>. */
		
	private List<String> genres;

	/** <i>Generated property</i> for <code>BandData.tours</code> property defined at extension <code>concerttours</code>. */
		
	private List<TourSummaryData> tours;
	
	public BandData()
	{
		// default constructor
	}
	
		
	
	public void setId(final String id)
	{
		this.id = id;
	}

		
	
	public String getId() 
	{
		return id;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
		
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

		
	
	public String getDescription() 
	{
		return description;
	}
	
		
	
	public void setAlbumsSold(final Long albumsSold)
	{
		this.albumsSold = albumsSold;
	}

		
	
	public Long getAlbumsSold() 
	{
		return albumsSold;
	}
	
		
	
	public void setGenres(final List<String> genres)
	{
		this.genres = genres;
	}

		
	
	public List<String> getGenres() 
	{
		return genres;
	}
	
		
	
	public void setTours(final List<TourSummaryData> tours)
	{
		this.tours = tours;
	}

		
	
	public List<TourSummaryData> getTours() 
	{
		return tours;
	}
	


}
