// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Vocab
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject vocabMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Vocab";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Eng("Eng"),
		MeaningEng("MeaningEng"),
		MeaningThai("MeaningThai"),
		Sentences("Sentences"),
		Synonyms("Synonyms"),
		VocabPhoto_Vocab("MyFirstModule.VocabPhoto_Vocab"),
		Vocab_Mode("MyFirstModule.Vocab_Mode"),
		Vocab_PartofSpeech("MyFirstModule.Vocab_PartofSpeech");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Vocab(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Vocab(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vocabMendixObject)
	{
		if (vocabMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, vocabMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.vocabMendixObject = vocabMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Vocab.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Vocab initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Vocab.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Vocab initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Vocab(context, mendixObject);
	}

	public static myfirstmodule.proxies.Vocab load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Vocab.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Vocab> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Vocab.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Eng
	 */
	public final java.lang.String getEng()
	{
		return getEng(getContext());
	}

	/**
	 * @param context
	 * @return value of Eng
	 */
	public final java.lang.String getEng(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Eng.toString());
	}

	/**
	 * Set value of Eng
	 * @param eng
	 */
	public final void setEng(java.lang.String eng)
	{
		setEng(getContext(), eng);
	}

	/**
	 * Set value of Eng
	 * @param context
	 * @param eng
	 */
	public final void setEng(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String eng)
	{
		getMendixObject().setValue(context, MemberNames.Eng.toString(), eng);
	}

	/**
	 * @return value of MeaningEng
	 */
	public final java.lang.String getMeaningEng()
	{
		return getMeaningEng(getContext());
	}

	/**
	 * @param context
	 * @return value of MeaningEng
	 */
	public final java.lang.String getMeaningEng(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MeaningEng.toString());
	}

	/**
	 * Set value of MeaningEng
	 * @param meaningeng
	 */
	public final void setMeaningEng(java.lang.String meaningeng)
	{
		setMeaningEng(getContext(), meaningeng);
	}

	/**
	 * Set value of MeaningEng
	 * @param context
	 * @param meaningeng
	 */
	public final void setMeaningEng(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String meaningeng)
	{
		getMendixObject().setValue(context, MemberNames.MeaningEng.toString(), meaningeng);
	}

	/**
	 * @return value of MeaningThai
	 */
	public final java.lang.String getMeaningThai()
	{
		return getMeaningThai(getContext());
	}

	/**
	 * @param context
	 * @return value of MeaningThai
	 */
	public final java.lang.String getMeaningThai(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MeaningThai.toString());
	}

	/**
	 * Set value of MeaningThai
	 * @param meaningthai
	 */
	public final void setMeaningThai(java.lang.String meaningthai)
	{
		setMeaningThai(getContext(), meaningthai);
	}

	/**
	 * Set value of MeaningThai
	 * @param context
	 * @param meaningthai
	 */
	public final void setMeaningThai(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String meaningthai)
	{
		getMendixObject().setValue(context, MemberNames.MeaningThai.toString(), meaningthai);
	}

	/**
	 * @return value of Sentences
	 */
	public final java.lang.String getSentences()
	{
		return getSentences(getContext());
	}

	/**
	 * @param context
	 * @return value of Sentences
	 */
	public final java.lang.String getSentences(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sentences.toString());
	}

	/**
	 * Set value of Sentences
	 * @param sentences
	 */
	public final void setSentences(java.lang.String sentences)
	{
		setSentences(getContext(), sentences);
	}

	/**
	 * Set value of Sentences
	 * @param context
	 * @param sentences
	 */
	public final void setSentences(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sentences)
	{
		getMendixObject().setValue(context, MemberNames.Sentences.toString(), sentences);
	}

	/**
	 * @return value of Synonyms
	 */
	public final java.lang.String getSynonyms()
	{
		return getSynonyms(getContext());
	}

	/**
	 * @param context
	 * @return value of Synonyms
	 */
	public final java.lang.String getSynonyms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Synonyms.toString());
	}

	/**
	 * Set value of Synonyms
	 * @param synonyms
	 */
	public final void setSynonyms(java.lang.String synonyms)
	{
		setSynonyms(getContext(), synonyms);
	}

	/**
	 * Set value of Synonyms
	 * @param context
	 * @param synonyms
	 */
	public final void setSynonyms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String synonyms)
	{
		getMendixObject().setValue(context, MemberNames.Synonyms.toString(), synonyms);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of VocabPhoto_Vocab
	 */
	public final myfirstmodule.proxies.VocabPhoto getVocabPhoto_Vocab() throws com.mendix.core.CoreException
	{
		return getVocabPhoto_Vocab(getContext());
	}

	/**
	 * @param context
	 * @return value of VocabPhoto_Vocab
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.VocabPhoto getVocabPhoto_Vocab(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.VocabPhoto result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.VocabPhoto_Vocab.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.VocabPhoto.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of VocabPhoto_Vocab
	 * @param vocabphoto_vocab
	 */
	public final void setVocabPhoto_Vocab(myfirstmodule.proxies.VocabPhoto vocabphoto_vocab)
	{
		setVocabPhoto_Vocab(getContext(), vocabphoto_vocab);
	}

	/**
	 * Set value of VocabPhoto_Vocab
	 * @param context
	 * @param vocabphoto_vocab
	 */
	public final void setVocabPhoto_Vocab(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.VocabPhoto vocabphoto_vocab)
	{
		if (vocabphoto_vocab == null) {
			getMendixObject().setValue(context, MemberNames.VocabPhoto_Vocab.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.VocabPhoto_Vocab.toString(), vocabphoto_vocab.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Vocab_Mode
	 */
	public final myfirstmodule.proxies.Mode getVocab_Mode() throws com.mendix.core.CoreException
	{
		return getVocab_Mode(getContext());
	}

	/**
	 * @param context
	 * @return value of Vocab_Mode
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Mode getVocab_Mode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Mode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Vocab_Mode.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Mode.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Vocab_Mode
	 * @param vocab_mode
	 */
	public final void setVocab_Mode(myfirstmodule.proxies.Mode vocab_mode)
	{
		setVocab_Mode(getContext(), vocab_mode);
	}

	/**
	 * Set value of Vocab_Mode
	 * @param context
	 * @param vocab_mode
	 */
	public final void setVocab_Mode(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Mode vocab_mode)
	{
		if (vocab_mode == null) {
			getMendixObject().setValue(context, MemberNames.Vocab_Mode.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Vocab_Mode.toString(), vocab_mode.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Vocab_PartofSpeech
	 */
	public final myfirstmodule.proxies.PartofSpeech getVocab_PartofSpeech() throws com.mendix.core.CoreException
	{
		return getVocab_PartofSpeech(getContext());
	}

	/**
	 * @param context
	 * @return value of Vocab_PartofSpeech
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.PartofSpeech getVocab_PartofSpeech(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.PartofSpeech result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Vocab_PartofSpeech.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.PartofSpeech.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Vocab_PartofSpeech
	 * @param vocab_partofspeech
	 */
	public final void setVocab_PartofSpeech(myfirstmodule.proxies.PartofSpeech vocab_partofspeech)
	{
		setVocab_PartofSpeech(getContext(), vocab_partofspeech);
	}

	/**
	 * Set value of Vocab_PartofSpeech
	 * @param context
	 * @param vocab_partofspeech
	 */
	public final void setVocab_PartofSpeech(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.PartofSpeech vocab_partofspeech)
	{
		if (vocab_partofspeech == null) {
			getMendixObject().setValue(context, MemberNames.Vocab_PartofSpeech.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Vocab_PartofSpeech.toString(), vocab_partofspeech.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return vocabMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Vocab that = (myfirstmodule.proxies.Vocab) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
