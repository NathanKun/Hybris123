/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28 févr. 2018 15:40:40                      ---
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
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.lucenesearch.model.LanguageConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

/**
 * Generated model class for type LuceneIndex first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class LuceneIndexModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "LuceneIndex";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXCONFIGURATIONS = "indexConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String LANGUAGECONFIGURATIONS = "languageConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.pendingUpdatesCount</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String PENDINGUPDATESCOUNT = "pendingUpdatesCount";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String POSTQUERYFILTERCLASSNAME = "postQueryFilterClassName";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.rebuildEndTimestamp</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String REBUILDENDTIMESTAMP = "rebuildEndTimestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.rebuildStartTimestamp</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String REBUILDSTARTTIMESTAMP = "rebuildStartTimestamp";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String TESTLOC = "testLoc";
	
	/** <i>Generated constant</i> - Attribute key of <code>LuceneIndex.upToDate</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String UPTODATE = "upToDate";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LuceneIndexModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LuceneIndexModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>LuceneIndex</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public LuceneIndexModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>LuceneIndex</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public LuceneIndexModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the code - The identifier of the LuceneIndex.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the indexConfigurations - The IndexConfiguration objects belonging to this
	 * 						LuceneIndex.
	 */
	@Accessor(qualifier = "indexConfigurations", type = Accessor.Type.GETTER)
	public Collection<IndexConfigurationModel> getIndexConfigurations()
	{
		return getPersistenceContext().getPropertyValue(INDEXCONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the languageConfigurations - The LanguageConfiguration objects belonging to
	 * 						this LuceneIndex.
	 */
	@Accessor(qualifier = "languageConfigurations", type = Accessor.Type.GETTER)
	public Collection<LanguageConfigurationModel> getLanguageConfigurations()
	{
		return getPersistenceContext().getPropertyValue(LANGUAGECONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.pendingUpdatesCount</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the pendingUpdatesCount - The number of all IndexUpdate objects belonging
	 * 						to this index.
	 */
	@Accessor(qualifier = "pendingUpdatesCount", type = Accessor.Type.GETTER)
	public Integer getPendingUpdatesCount()
	{
		return getPersistenceContext().getPropertyValue(PENDINGUPDATESCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the postQueryFilterClassName - Optionally, specify a PostQueryFilter
	 * 						implementation here.
	 */
	@Accessor(qualifier = "postQueryFilterClassName", type = Accessor.Type.GETTER)
	public String getPostQueryFilterClassName()
	{
		return getPersistenceContext().getPropertyValue(POSTQUERYFILTERCLASSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.rebuildEndTimestamp</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the rebuildEndTimestamp - When the last rebuild of this LuceneIndex has
	 * 						ended.
	 */
	@Accessor(qualifier = "rebuildEndTimestamp", type = Accessor.Type.GETTER)
	public Date getRebuildEndTimestamp()
	{
		return getPersistenceContext().getPropertyValue(REBUILDENDTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.rebuildStartTimestamp</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the rebuildStartTimestamp - When the last rebuild of this LuceneIndex has
	 * 						started.
	 */
	@Accessor(qualifier = "rebuildStartTimestamp", type = Accessor.Type.GETTER)
	public Date getRebuildStartTimestamp()
	{
		return getPersistenceContext().getPropertyValue(REBUILDSTARTTIMESTAMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the testLoc
	 */
	@Accessor(qualifier = "testLoc", type = Accessor.Type.GETTER)
	public Collection<String> getTestLoc()
	{
		return getTestLoc(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @param loc the value localization key 
	 * @return the testLoc
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "testLoc", type = Accessor.Type.GETTER)
	public Collection<String> getTestLoc(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(TESTLOC, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LuceneIndex.upToDate</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the upToDate - Indicates whether the LuceneIndex needs to be
	 * 						updated or not.
	 */
	@Accessor(qualifier = "upToDate", type = Accessor.Type.GETTER)
	public Boolean getUpToDate()
	{
		return getPersistenceContext().getPropertyValue(UPTODATE);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>LuceneIndex.code</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the code - The identifier of the LuceneIndex.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.indexConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexConfigurations - The IndexConfiguration objects belonging to this
	 * 						LuceneIndex.
	 */
	@Accessor(qualifier = "indexConfigurations", type = Accessor.Type.SETTER)
	public void setIndexConfigurations(final Collection<IndexConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(INDEXCONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.languageConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the languageConfigurations - The LanguageConfiguration objects belonging to
	 * 						this LuceneIndex.
	 */
	@Accessor(qualifier = "languageConfigurations", type = Accessor.Type.SETTER)
	public void setLanguageConfigurations(final Collection<LanguageConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(LANGUAGECONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.postQueryFilterClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the postQueryFilterClassName - Optionally, specify a PostQueryFilter
	 * 						implementation here.
	 */
	@Accessor(qualifier = "postQueryFilterClassName", type = Accessor.Type.SETTER)
	public void setPostQueryFilterClassName(final String value)
	{
		getPersistenceContext().setPropertyValue(POSTQUERYFILTERCLASSNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the testLoc
	 */
	@Accessor(qualifier = "testLoc", type = Accessor.Type.SETTER)
	public void setTestLoc(final Collection<String> value)
	{
		setTestLoc(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>LuceneIndex.testLoc</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the testLoc
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "testLoc", type = Accessor.Type.SETTER)
	public void setTestLoc(final Collection<String> value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(TESTLOC, loc, value);
	}
	
}
