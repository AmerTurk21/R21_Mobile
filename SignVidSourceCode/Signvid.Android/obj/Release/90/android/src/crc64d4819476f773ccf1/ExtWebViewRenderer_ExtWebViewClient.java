package crc64d4819476f773ccf1;


public class ExtWebViewRenderer_ExtWebViewClient
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageFinished:(Landroid/webkit/WebView;Ljava/lang/String;)V:GetOnPageFinished_Landroid_webkit_WebView_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Signbook.Droid.Renders.ExtWebView.ExtWebViewRenderer+ExtWebViewClient, Signbook.Android", ExtWebViewRenderer_ExtWebViewClient.class, __md_methods);
	}


	public ExtWebViewRenderer_ExtWebViewClient ()
	{
		super ();
		if (getClass () == ExtWebViewRenderer_ExtWebViewClient.class)
			mono.android.TypeManager.Activate ("Signbook.Droid.Renders.ExtWebView.ExtWebViewRenderer+ExtWebViewClient, Signbook.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPageFinished (android.webkit.WebView p0, java.lang.String p1)
	{
		n_onPageFinished (p0, p1);
	}

	private native void n_onPageFinished (android.webkit.WebView p0, java.lang.String p1);

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
