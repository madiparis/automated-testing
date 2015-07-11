package HomePageFeaturesTests;
import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import HomepageFeatures.Homepage;

/*
* @author Anjali
*/

/*
 * Checks the navigation by clicking Contact on homepage by validating against Url and title on that page
 */
public class ContactTest extends CommonTests
{

	@Test
	public void test() 
	{
		Assert.assertEquals(true, Homepage.IsAtContact());
	}

}
