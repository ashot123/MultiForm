package wicket;

import org.apache.wicket.protocol.http.WebApplication;
import wicket.MainPage;

public class WicketApplication extends WebApplication {

	@Override
	public Class<MainPage> getHomePage() {

		return MainPage.class; // return default page
	}

}
