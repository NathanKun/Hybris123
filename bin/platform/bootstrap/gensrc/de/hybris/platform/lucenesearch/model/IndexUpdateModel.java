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
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.IndexConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type IndexUpdate first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class IndexUpdateModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "IndexUpdate";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXCONFIGURATION = "indexConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INPROGRESS = "inProgress";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.item</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ITEM = "item";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ITEMPK = "itemPK";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String REMOVE = "remove";
	
	/** <i>Generated constant</i> - Attribute key of <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String UPDATEINDEXCRONJOB = "updateIndexCronJob";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public IndexUpdateModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public IndexUpdateModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexConfiguration initial attribute declared by type <code>IndexUpdate</code> at extension <code>lucenesearch</code>
	 * @param _itemPK initial attribute declared by type <code>IndexUpdate</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _updateIndexCronJob initial attribute declared by type <code>IndexUpdate</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public IndexUpdateModel(final IndexConfigurationModel _indexConfiguration, final PK _itemPK, final ItemModel _owner, final CronJobModel _updateIndexCronJob)
	{
		super();
		setIndexConfiguration(_indexConfiguration);
		setItemPK(_itemPK);
		setOwner(_owner);
		setUpdateIndexCronJob(_updateIndexCronJob);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexConfiguration - The IndexConfiguration this IndexUpdate belongs
	 * 						to.
	 */
	@Accessor(qualifier = "indexConfiguration", type = Accessor.Type.GETTER)
	public IndexConfigurationModel getIndexConfiguration()
	{
		return getPersistenceContext().getPropertyValue(INDEXCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the inProgress
	 */
	@Accessor(qualifier = "inProgress", type = Accessor.Type.GETTER)
	public Boolean getInProgress()
	{
		return getPersistenceContext().getPropertyValue(INPROGRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.item</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the item
	 */
	@Accessor(qualifier = "item", type = Accessor.Type.GETTER)
	public ItemModel getItem()
	{
		return getPersistenceContext().getPropertyValue(ITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the itemPK
	 */
	@Accessor(qualifier = "itemPK", type = Accessor.Type.GETTER)
	public PK getItemPK()
	{
		return getPersistenceContext().getPropertyValue(ITEMPK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the remove
	 */
	@Accessor(qualifier = "remove", type = Accessor.Type.GETTER)
	public Boolean getRemove()
	{
		return getPersistenceContext().getPropertyValue(REMOVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the updateIndexCronJob
	 */
	@Accessor(qualifier = "updateIndexCronJob", type = Accessor.Type.GETTER)
	public CronJobModel getUpdateIndexCronJob()
	{
		return getPersistenceContext().getPropertyValue(UPDATEINDEXCRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexUpdate.indexConfiguration</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexConfiguration - The IndexConfiguration this IndexUpdate belongs
	 * 						to.
	 */
	@Accessor(qualifier = "indexConfiguration", type = Accessor.Type.SETTER)
	public void setIndexConfiguration(final IndexConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(INDEXCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexUpdate.inProgress</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the inProgress
	 */
	@Accessor(qualifier = "inProgress", type = Accessor.Type.SETTER)
	public void setInProgress(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(INPROGRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexUpdate.itemPK</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the itemPK
	 */
	@Accessor(qualifier = "itemPK", type = Accessor.Type.SETTER)
	public void setItemPK(final PK value)
	{
		getPersistenceContext().setPropertyValue(ITEMPK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IndexUpdate.remove</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the remove
	 */
	@Accessor(qualifier = "remove", type = Accessor.Type.SETTER)
	public void setRemove(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(REMOVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>IndexUpdate.updateIndexCronJob</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the updateIndexCronJob
	 */
	@Accessor(qualifier = "updateIndexCronJob", type = Accessor.Type.SETTER)
	public void setUpdateIndexCronJob(final CronJobModel value)
	{
		getPersistenceContext().setPropertyValue(UPDATEINDEXCRONJOB, value);
	}
	
}
