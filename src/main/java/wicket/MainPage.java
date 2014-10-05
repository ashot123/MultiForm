package wicket;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxSubmitLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 * Created by Ashot Karakhanyan on 05-10-2014
 */
public class MainPage extends WebPage {

    public MainPage() {

        SubmitForm form = new SubmitForm("form", new CompoundPropertyModel<FormDto>(new FormDto()));
        add(form);
        //form.add(listSites);
    }

    public class SubmitForm extends Form<FormDto> {
        TextField<String> myFirstName = new TextField<String>("myFirstName");
        TextField<String> myLastName = new TextField<String>("myLastName");

        TextField<String> hisFirstName = new TextField<String>("hisFirstName");
        TextField<String> hisLastName = new TextField<String>("hisLastName");

        public SubmitForm(String id, CompoundPropertyModel<FormDto> model) {
            super(id, model);


            myFirstName.setOutputMarkupId(true);
            add(myFirstName);


            myLastName.setOutputMarkupId(true);
            add(myLastName);

            AjaxSubmitLink addMyNameButton = new AjaxSubmitLink("addMyName") {

                @Override
                protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                    FormDto modelObject = (FormDto) form.getDefaultModelObject();

                    String myFirstName = modelObject.getMyFirstName();
                    String myLastName = modelObject.getMyLastName();

                }

                @Override
                protected void onError(AjaxRequestTarget target, Form<?> form) {

                }
            };
            add(addMyNameButton);


            hisFirstName.setOutputMarkupId(true);
            add(hisFirstName);


            hisLastName.setOutputMarkupId(true);
            add(hisLastName);

            AjaxSubmitLink addHisNameButton = new AjaxSubmitLink("addHisName") {


                @Override
                protected void onSubmit(AjaxRequestTarget target, Form<?> form) {

                }

                @Override
                protected void onError(AjaxRequestTarget target, Form<?> form) {

                }
            };
            add(addHisNameButton);

        }


    }


}




