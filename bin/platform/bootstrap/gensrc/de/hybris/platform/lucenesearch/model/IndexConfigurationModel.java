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
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.AttributeConfigurationModel;
import de.hybris.platform.lucenesearch.model.IndexUpdateModel;
import de.hybris.platform.lucenesearch.model.LuceneIndexModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type IndexConfiguration first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class IndexConfigurationModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "IndexConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ACTIVATIONATTRIBUTE = "activationAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.allAvailableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ALLAVAILABLEATTRIBUTES = "allAvailableAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ATTRIBUTECONFIGURATIONS = "attributeConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.availableActivationAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEACTIVATIONATTRIBUTES = "availableActivationAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.availableGroupingAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEGROUPINGATTRIBUTES = "availableGroupingAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String AVAILABLEINDEXABLEATTRIBUTES = "availableIndexableAttributes";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String GROUPINGATTRIBUTE = "groupingAttribute";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDDATAFACTORYCLASSNAME = "indexedDataFactoryClassName";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDDATAPARAMS = "indexedDataParams";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDTYPE = "indexedType";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String LUCENEINDEX = "luceneIndex";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String PENDINGUPDATES = "pendingUpdates";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INCLUDEDTYPES = "includedTypes";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public IndexConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public IndexConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexedType initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _luceneIndex initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public IndexConfigurationModel(final ComposedTypeModel _indexedType, final LuceneIndexModel _luceneIndex)
	{
		super();
		setIndexedType(_indexedType);
		setLuceneIndex(_luceneIndex);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexedType initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _luceneIndex initial attribute declared by type <code>IndexConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public IndexConfigurationModel(final ComposedTypeModel _indexedType, final LuceneIndexModel _luceneIndex, final ItemModel _owner)
	{
		super();
		setIndexedType(_indexedType);
		setLuceneIndex(_luceneIndex);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the activationAttribute - Optional descriptor of boolean attribute.
	 * 						Instances must have the value true in this
	 * 						attribute to be indexed. Is limited to the
	 * 						values of the availableActivationAttributes
	 * 						attribute.
	 */
	@Accessor(qualifier = "activationAttribute", type = Accessor.Type.GETTER)
	public AttributeDescriptorModel getActivationAttribute()
	{
		return getPersistenceContext().getPropertyValue(ACTIVATIONATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.allAvailableAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allAvailableAttributes - Returns all attributes of the type specified by
	 * 						the indexedType attribute. Jalo-only attribute.
	 */
	@Accessor(qualifier = "allAvailableAttributes", type = Accessor.Type.GETTER)
	public Collection<AttributeDescriptorModel> getAllAvailableAttributes()
	{
		return getPersistenceContext().getPropertyValue(ALLAVAILABLEATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the attributeConfigurations - All AttributeConfiguration objects that belong
	 * 						to this IndexConfiguration. Jalo-only attribute.
	 */
	@Accessor(qualifier = "attributeConfigurations", type = Accessor.Type.GETTER)
	public Collection<AttributeConfigurationModel> getAttributeConfigurations()
	{
		return getPersistenceContext().getPropertyValue(ATTRIBUTECONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.availableActivationAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableActivationAttributes - all AttributeDescriptors of the indexed type.
	 * 						Jalo-only attribute. Deprecated.
	 */
	@Accessor(qualifier = "availableActivationAttributes", type = Accessor.Type.GETTER)
	public Collection<AttributeDescriptorModel> getAvailableActivationAttributes()
	{
		return getPersistenceContext().getPropertyValue(AVAILABLEACTIVATIONATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.availableGroupingAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableGroupingAttributes - all groupable AttributeDescriptors of the
	 * 						indexed type. Jalo-only attribute. Deprecated.
	 */
	@Accessor(qualifier = "availableGroupingAttributes", type = Accessor.Type.GETTER)
	public Collection<AttributeDescriptorModel> getAvailableGroupingAttributes()
	{
		return getPersistenceContext().getPropertyValue(AVAILABLEGROUPINGATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.availableIndexableAttributes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the availableIndexableAttributes - Gets all available attributes of the specified
	 * 						type which are indexable. Jalo-only attribute.
	 */
	@Accessor(qualifier = "availableIndexableAttributes", type = Accessor.Type.GETTER)
	public Collection<AttributeDescriptorModel> getAvailableIndexableAttributes()
	{
		return getPersistenceContext().getPropertyValue(AVAILABLEINDEXABLEATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the groupingAttribute - Optional descriptor of an attribute that puts
	 * 						the indexed item into one or more groups; see
	 * 						the documentation of LucenesearchManager
	 * 						for a description of grouping. Is limited to the
	 * 						values of the availableGroupingAttributes
	 * 						attribute.
	 */
	@Accessor(qualifier = "groupingAttribute", type = Accessor.Type.GETTER)
	public AttributeDescriptorModel getGroupingAttribute()
	{
		return getPersistenceContext().getPropertyValue(GROUPINGATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the includedTypes - Only types specified here will be used within the
	 * 					index. Types not specified will not be indexed.
	 * 					Attribute created via the IndexTypeRelation
	 * 					relation.
	 */
	@Accessor(qualifier = "includedTypes", type = Accessor.Type.GETTER)
	public Collection<ComposedTypeModel> getIncludedTypes()
	{
		return getPersistenceContext().getPropertyValue(INCLUDEDTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedDataFactoryClassName - Optionally, you can specify an IndexedDataFactory 
	 * 						Uses the DefaultIndexedDataFactory by default.
	 */
	@Accessor(qualifier = "indexedDataFactoryClassName", type = Accessor.Type.GETTER)
	public String getIndexedDataFactoryClassName()
	{
		return getPersistenceContext().getPropertyValue(INDEXEDDATAFACTORYCLASSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedDataParams - Additional parameters which may be evaluated by
	 * 						the associated IndexedDataFactory.
	 */
	@Accessor(qualifier = "indexedDataParams", type = Accessor.Type.GETTER)
	public String getIndexedDataParams()
	{
		return getPersistenceContext().getPropertyValue(INDEXEDDATAPARAMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedType - The item type whose instances will be indexed.
	 * 						Initial attribute, cannot be edited after the
	 * 						IndexConfiguration has been created.
	 */
	@Accessor(qualifier = "indexedType", type = Accessor.Type.GETTER)
	public ComposedTypeModel getIndexedType()
	{
		return getPersistenceContext().getPropertyValue(INDEXEDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the luceneIndex - The LuceneIndex to which this IndexConfiguration
	 * 						belongs.
	 */
	@Accessor(qualifier = "luceneIndex", type = Accessor.Type.GETTER)
	public LuceneIndexModel getLuceneIndex()
	{
		return getPersistenceContext().getPropertyValue(LUCENEINDEX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the pendingUpdates - A collection of all IndexUpdate objects that
	 * 						refer to objects of the given type which
	 * 						currently exist and which have to be updated.
	 * 						Jalo-only attribute. Entries are retrieved via a
	 * 						FlexibleSearch statement.
	 */
	@Accessor(qualifier = "pendingUpdates", type = Accessor.Type.GETTER)
	public Collection<IndexUpdateModel> getPendingUpdates()
	{
		return getPersistenceContext().getPropertyValue(PENDINGUPDATES);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.activationAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the activationAttribute - Optional descriptor of boolean attribute.
	 * 						Instances must have the value true in this
	 * 						attribute to be indexed. Is limited to the
	 * 						values of the availableActivationAttributes
	 * 						attribute.
	 */
	@Accessor(qualifier = "activationAttribute", type = Accessor.Type.SETTER)
	public void setActivationAttribute(final AttributeDescriptorModel value)
	{
		getPersistenceContext().setPropertyValue(ACTIVATIONATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.attributeConfigurations</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the attributeConfigurations - All AttributeConfiguration objects that belong
	 * 						to this IndexConfiguration. Jalo-only attribute.
	 */
	@Accessor(qualifier = "attributeConfigurations", type = Accessor.Type.SETTER)
	public void setAttributeConfigurations(final Collection<AttributeConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(ATTRIBUTECONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.groupingAttribute</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the groupingAttribute - Optional descriptor of an attribute that puts
	 * 						the indexed item into one or more groups; see
	 * 						the documentation of LucenesearchManager
	 * 						for a description of grouping. Is limited to the
	 * 						values of the availableGroupingAttributes
	 * 						attribute.
	 */
	@Accessor(qualifier = "groupingAttribute", type = Accessor.Type.SETTER)
	public void setGroupingAttribute(final AttributeDescriptorModel value)
	{
		getPersistenceContext().setPropertyValue(GROUPINGATTRIBUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.includedTypes</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the includedTypes - Only types specified here will be used within the
	 * 					index. Types not specified will not be indexed.
	 * 					Attribute created via the IndexTypeRelation
	 * 					relation.
	 */
	@Accessor(qualifier = "includedTypes", type = Accessor.Type.SETTER)
	public void setIncludedTypes(final Collection<ComposedTypeModel> value)
	{
		getPersistenceContext().setPropertyValue(INCLUDEDTYPES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.indexedDataFactoryClassName</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexedDataFactoryClassName - Optionally, you can specify an IndexedDataFactory 
	 * 						Uses the DefaultIndexedDataFactory by default.
	 */
	@Accessor(qualifier = "indexedDataFactoryClassName", type = Accessor.Type.SETTER)
	public void setIndexedDataFactoryClassName(final String value)
	{
		getPersistenceContext().setPropertyValue(INDEXEDDATAFACTORYCLASSNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.indexedDataParams</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the indexedDataParams - Additional parameters which may be evaluated by
	 * 						the associated IndexedDataFactory.
	 */
	@Accessor(qualifier = "indexedDataParams", type = Accessor.Type.SETTER)
	public void setIndexedDataParams(final String value)
	{
		getPersistenceContext().setPropertyValue(INDEXEDDATAPARAMS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexConfiguration.indexedType</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexedType - The item type whose instances will be indexed.
	 * 						Initial attribute, cannot be edited after the
	 * 						IndexConfiguration has been created.
	 */
	@Accessor(qualifier = "indexedType", type = Accessor.Type.SETTER)
	public void setIndexedType(final ComposedTypeModel value)
	{
		getPersistenceContext().setPropertyValue(INDEXEDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the luceneIndex - The LuceneIndex to which this IndexConfiguration
	 * 						belongs.
	 */
	@Accessor(qualifier = "luceneIndex", type = Accessor.Type.SETTER)
	public void setLuceneIndex(final LuceneIndexModel value)
	{
		getPersistenceContext().setPropertyValue(LUCENEINDEX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexConfiguration.pendingUpdates</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the pendingUpdates - A collection of all IndexUpdate objects that
	 * 						refer to objects of the given type which
	 * 						currently exist and which have to be updated.
	 * 						Jalo-only attribute. Entries are retrieved via a
	 * 						FlexibleSearch statement.
	 */
	@Accessor(qualifier = "pendingUpdates", type = Accessor.Type.SETTER)
	public void setPendingUpdates(final Collection<IndexUpdateModel> value)
	{
		getPersistenceContext().setPropertyValue(PENDINGUPDATES, value);
	}
	
}
