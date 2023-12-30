package crc6418e21896c62289ed;


public class VideoCallWebViewDroid_VideoCallWebClient
	extends android.webkit.WebChromeClient
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPermissionRequest:(Landroid/webkit/PermissionRequest;)V:GetOnPermissionRequest_Landroid_webkit_PermissionRequest_Handler\n" +
			"";
		mono.android.Runtime.register ("Signbook.Droid.Renders.VideoCallWebViewDroid+VideoCallWebClient, Signbook.Android", VideoCallWebViewDroid_VideoCallWebClient.class, __md_methods);
	}


	public VideoCallWebViewDroid_VideoCallWebClient ()
	{
		super ();
		if (getClass () == VideoCallWebViewDroid_VideoCallWebClient.class)
			mono.android.TypeManager.Activate ("Signbook.Droid.Renders.VideoCallWebViewDroid+VideoCallWebClient, Signbook.Android", "", this, new java.lang.Object[] {  });
	}

	public VideoCallWebViewDroid_VideoCallWebClient (android.app.Activity p0)
	{
		super ();
		if (getClass () == VideoCallWebViewDroid_VideoCallWebClient.class)
			mono.android.TypeManager.Activate ("Signbook.Droid.Renders.VideoCallWebViewDroid+VideoCallWebClient, Signbook.Android", "Android.App.Activity, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onPermissionRequest (android.webkit.PermissionRequest p0)
	{
		n_onPermissionRequest (p0);
	}

	private native void n_onPermissionRequest (android.webkit.PermissionRequest p0);

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
