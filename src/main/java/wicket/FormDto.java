package wicket;

/**
 * Created by Ashot Karakhanyan on 05-10-2014
 */
public class FormDto {

    private String myFirstName;
    private String myLastName;

    private String hisFirstName;
    private String hisLastName;

    public String getMyFirstName() {
        return myFirstName;
    }

    public void setMyFirstName(String myFirstName) {
        this.myFirstName = myFirstName;
    }

    public String getMyLastName() {
        return myLastName;
    }

    public void setMyLastName(String myLastName) {
        this.myLastName = myLastName;
    }

    public String getHisFirstName() {
        return hisFirstName;
    }

    public void setHisFirstName(String hisFirstName) {
        this.hisFirstName = hisFirstName;
    }

    public String getHisLastName() {
        return hisLastName;
    }

    public void setHisLastName(String hisLastName) {
        this.hisLastName = hisLastName;
    }
}
