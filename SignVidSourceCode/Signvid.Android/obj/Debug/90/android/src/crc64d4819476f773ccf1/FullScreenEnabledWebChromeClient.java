package crc64d4819476f773ccf1;


public class FullScreenEnabledWebChromeClient
	extends crc643f46942d9dd1fff9.FormsWebChromeClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHideCustomView:()V:GetOnHideCustomViewHandler\n" +
			"n_onShowCustomView:(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V:GetOnShowCustomView_Landroid_view_View_Landroid_webkit_WebChromeClient_CustomViewCallback_Handler\n" +
			"";
		mono.android.Runtime.register ("Signbook.Droid.Renders.ExtWebView.FullScreenEnabledWebChromeClient, Signbook.Android", FullScreenEnabledWebChromeClient.class, __md_methods);
	}


	public FullScreenEnabledWebChromeClient ()
	{
		super ();
		if (getClass () == FullScreenEnabledWebChromeClient.class)
			mono.android.TypeManager.Activate ("Signbook.Droid.Renders.ExtWebView.FullScreenEnabledWebChromeClient, Signbook.Android", "", this, new java.lang.Object[] {  });
	}


	public void onHideCustomView ()
	{
		n_onHideCustomView ();
	}

	private native void n_onHideCustomView ();


	public void onShowCustomView (android.view.View p0, android.webkit.WebChromeClient.CustomViewCallback p1)
	{
		n_onShowCustomView (p0, p1);
	}

	private native void n_onShowCustomView (android.view.View p0, android.webkit.WebChromeClient.CustomViewCallback p1);

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
