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
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.lucenesearch.model.AbstractLuceneItemModel;
import de.hybris.platform.lucenesearch.model.LuceneIndexModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type LanguageConfiguration first defined at extension lucenesearch.
 */
@SuppressWarnings("all")
public class LanguageConfigurationModel extends AbstractLuceneItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "LanguageConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>LanguageConfiguration.analyzerDefinition</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String ANALYZERDEFINITION = "analyzerDefinition";
	
	/** <i>Generated constant</i> - Attribute key of <code>LanguageConfiguration.indexedLanguage</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String INDEXEDLANGUAGE = "indexedLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>LanguageConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. */
	public static final String LUCENEINDEX = "luceneIndex";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public LanguageConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public LanguageConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexedLanguage initial attribute declared by type <code>LanguageConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _luceneIndex initial attribute declared by type <code>LanguageConfiguration</code> at extension <code>lucenesearch</code>
	 */
	@Deprecated
	public LanguageConfigurationModel(final LanguageModel _indexedLanguage, final LuceneIndexModel _luceneIndex)
	{
		super();
		setIndexedLanguage(_indexedLanguage);
		setLuceneIndex(_luceneIndex);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _indexedLanguage initial attribute declared by type <code>LanguageConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _luceneIndex initial attribute declared by type <code>LanguageConfiguration</code> at extension <code>lucenesearch</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public LanguageConfigurationModel(final LanguageModel _indexedLanguage, final LuceneIndexModel _luceneIndex, final ItemModel _owner)
	{
		super();
		setIndexedLanguage(_indexedLanguage);
		setLuceneIndex(_luceneIndex);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageConfiguration.analyzerDefinition</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the analyzerDefinition - Specifies the analyzer class used to normalize
	 * 						the documents of this LanguageConfiguration. You
	 * 						need to specify a Java statement that returns a
	 * 						org.apache.lucene.analysis.Analyzer instance,
	 * 						such as "return new
	 * 						org.apache.lucene.analysis.snowball.SnowballAnalyzer("German",
	 * 						GermanAnalyzer.GERMAN_STOP_WORDS );"
	 */
	@Accessor(qualifier = "analyzerDefinition", type = Accessor.Type.GETTER)
	public String getAnalyzerDefinition()
	{
		return getPersistenceContext().getPropertyValue(ANALYZERDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageConfiguration.indexedLanguage</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the indexedLanguage - The system language in which the index is to be
	 * 						built.
	 */
	@Accessor(qualifier = "indexedLanguage", type = Accessor.Type.GETTER)
	public LanguageModel getIndexedLanguage()
	{
		return getPersistenceContext().getPropertyValue(INDEXEDLANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. 
	 * @return the luceneIndex - The LuceneIndex to which the
	 * 						LanguageConfiguration belongs.
	 */
	@Accessor(qualifier = "luceneIndex", type = Accessor.Type.GETTER)
	public LuceneIndexModel getLuceneIndex()
	{
		return getPersistenceContext().getPropertyValue(LUCENEINDEX);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LanguageConfiguration.analyzerDefinition</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the analyzerDefinition - Specifies the analyzer class used to normalize
	 * 						the documents of this LanguageConfiguration. You
	 * 						need to specify a Java statement that returns a
	 * 						org.apache.lucene.analysis.Analyzer instance,
	 * 						such as "return new
	 * 						org.apache.lucene.analysis.snowball.SnowballAnalyzer("German",
	 * 						GermanAnalyzer.GERMAN_STOP_WORDS );"
	 */
	@Accessor(qualifier = "analyzerDefinition", type = Accessor.Type.SETTER)
	public void setAnalyzerDefinition(final String value)
	{
		getPersistenceContext().setPropertyValue(ANALYZERDEFINITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>LanguageConfiguration.indexedLanguage</code> attribute defined at extension <code>lucenesearch</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the indexedLanguage - The system language in which the index is to be
	 * 						built.
	 */
	@Accessor(qualifier = "indexedLanguage", type = Accessor.Type.SETTER)
	public void setIndexedLanguage(final LanguageModel value)
	{
		getPersistenceContext().setPropertyValue(INDEXEDLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>LanguageConfiguration.luceneIndex</code> attribute defined at extension <code>lucenesearch</code>. 
	 *  
	 * @param value the luceneIndex - The LuceneIndex to which the
	 * 						LanguageConfiguration belongs.
	 */
	@Accessor(qualifier = "luceneIndex", type = Accessor.Type.SETTER)
	public void setLuceneIndex(final LuceneIndexModel value)
	{
		getPersistenceContext().setPropertyValue(LUCENEINDEX, value);
	}
	
}
