package crc64e4933cde1256a1ef;


public class MainApplication
	extends android.app.Application
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getResources:()Landroid/content/res/Resources;:GetGetResourcesHandler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"n_onCreate:()V:GetOnCreateHandler\n" +
			"";
	}

	public MainApplication ()
	{
		mono.MonoPackageManager.setContext (this);
	}


	public android.content.res.Resources getResources ()
	{
		return n_getResources ();
	}

	private native android.content.res.Resources n_getResources ();


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);


	public void onCreate ()
	{
		n_onCreate ();
	}

	private native void n_onCreate ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
