/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 févr. 2018 16:18:49                      ---
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
 *  
 */
package de.hybris.platform.lucenesearch.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type AttributeConfiguration first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class AttributeConfigurationModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "AttributeConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEINDEXABLEATTRIBUTES = "availableIndexableAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String EXACT = "exact";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String FIELDNAME = "fieldName";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXCONFIGURATION = "indexConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDATTRIBUTE = "indexedAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String STOREDATA = "storeData";
	
	/** <i>Generated constant</i> - Attribute key of <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String WEIGHT = "weight";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AttributeConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AttributeConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexConfiguration initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _indexedAttribute initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public AttributeConfigurationModel(final IndexConfigurationModel _indexConfiguration, final AttributeDescriptorModel _indexedAttribute)
	{
		super();
		setIndexConfiguration(_indexConfiguration);
		setIndexedAttribute(_indexedAttribute);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexConfiguration initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _indexedAttribute initial attribute declared by type <code>AttributeConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public AttributeConfigurationModel(final IndexConfigurationModel _indexConfiguration, final AttributeDescriptorModel _indexedAttribute, final ItemModel _owner)
	{
		super();
		setIndexConfiguration(_indexConfiguration);
		setIndexedAttribute(_indexedAttribute);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableIndexableAttributes - Direct mapping of the
	 * 						availableIndexableAttribute attribute of the
	 * 						IndexConfiguration to which the
	 * 						AttributeConfiguration is assigned. Jalo-only
	 * 						attribute.
	 */
	@Accessor(qualifier = "availableIndexableAttributes", type = Accessor.Type.GETTER)
	public Collection<AttributeDescriptorModel> getAvailableIndexableAttributes()
	{
		return getPersistenceContext().getPropertyValue(AVAILABLEINDEXABLEATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the exact - Indicates whether this attribute text must be indexed
	 * 						exactly (for example, without any stemming
	 * 						mechanism), such as codes or identification
	 * 						numbers. Defaults to Boolean.FALSE.
	 */
	@Accessor(qualifier = "exact", type = Accessor.Type.GETTER)
	public Boolean getExact()
	{
		return getPersistenceContext().getPropertyValue(EXACT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the fieldName - Field name within the lucene index where the
	 * 						attribute will be stored.
	 */
	@Accessor(qualifier = "fieldName", type = Accessor.Type.GETTER)
	public String getFieldName()
	{
		return getPersistenceContext().getPropertyValue(FIELDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexConfiguration - The IndexConfiguration to which this
	 * 						configuration belongs.
	 */
	@Accessor(qualifier = "indexConfiguration", type = Accessor.Type.GETTER)
	public IndexConfigurationModel getIndexConfiguration()
	{
		return getPersistenceContext().getPropertyValue(INDEXCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedAttribute - Gets the attribute definition this configuration
	 * 						represents. Is limited to the values of the
	 * 						availableIndexableAttributes attribute.
	 */
	@Accessor(qualifier = "indexedAttribute", type = Accessor.Type.GETTER)
	public AttributeDescriptorModel getIndexedAttribute()
	{
		return getPersistenceContext().getPropertyValue(INDEXEDATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the storeData - Specifies whether the original text has to be stored
	 * 						inside the lucene index as well. Defaults to
	 * 						Boolean.TRUE.
	 */
	@Accessor(qualifier = "storeData", type = Accessor.Type.GETTER)
	public Boolean getStoreData()
	{
		return getPersistenceContext().getPropertyValue(STOREDATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the weight - The weighting of the attribute within the Lucene
	 * 						index. Must be greater than 0. Defaults to new
	 * 						Double(1.0).
	 */
	@Accessor(qualifier = "weight", type = Accessor.Type.GETTER)
	public Double getWeight()
	{
		return getPersistenceContext().getPropertyValue(WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.exact</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the exact - Indicates whether this attribute text must be indexed
	 * 						exactly (for example, without any stemming
	 * 						mechanism), such as codes or identification
	 * 						numbers. Defaults to Boolean.FALSE.
	 */
	@Accessor(qualifier = "exact", type = Accessor.Type.SETTER)
	public void setExact(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(EXACT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.fieldName</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the fieldName - Field name within the lucene index where the
	 * 						attribute will be stored.
	 */
	@Accessor(qualifier = "fieldName", type = Accessor.Type.SETTER)
	public void setFieldName(final String value)
	{
		getPersistenceContext().setPropertyValue(FIELDNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AttributeConfiguration.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexConfiguration - The IndexConfiguration to which this
	 * 						configuration belongs.
	 */
	@Accessor(qualifier = "indexConfiguration", type = Accessor.Type.SETTER)
	public void setIndexConfiguration(final IndexConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(INDEXCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.indexedAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexedAttribute - Gets the attribute definition this configuration
	 * 						represents. Is limited to the values of the
	 * 						availableIndexableAttributes attribute.
	 */
	@Accessor(qualifier = "indexedAttribute", type = Accessor.Type.SETTER)
	public void setIndexedAttribute(final AttributeDescriptorModel value)
	{
		getPersistenceContext().setPropertyValue(INDEXEDATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.storeData</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the storeData - Specifies whether the original text has to be stored
	 * 						inside the lucene index as well. Defaults to
	 * 						Boolean.TRUE.
	 */
	@Accessor(qualifier = "storeData", type = Accessor.Type.SETTER)
	public void setStoreData(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(STOREDATA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AttributeConfiguration.weight</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the weight - The weighting of the attribute within the Lucene
	 * 						index. Must be greater than 0. Defaults to new
	 * 						Double(1.0).
	 */
	@Accessor(qualifier = "weight", type = Accessor.Type.SETTER)
	public void setWeight(final Double value)
	{
		getPersistenceContext().setPropertyValue(WEIGHT, value);
	}
	
}
