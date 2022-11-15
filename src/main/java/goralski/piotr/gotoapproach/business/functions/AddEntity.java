package goralski.piotr.gotoapproach.business.functions;

import goralski.piotr.gotoapproach.business.dto.AddEntityRequest;
import goralski.piotr.gotoapproach.business.dto.AddEntityResponse;
import goralski.piotr.gotoapproach.business.library.GoTo;
import goralski.piotr.gotoapproach.business.library.IGoTo;

public class AddEntity extends GoTo<AddEntityResponse> implements IGoTo<AddEntityRequest, AddEntityResponse> {

    public AddEntity(AddEntityRequest data) {
        super.proceed(task(data));
    }

    @Override
    public AddEntityResponse task(AddEntityRequest data) {
        //PROCEED LOGIC
        System.out.println("AddEntity - proceeding - " + data.getRequest());

        return new AddEntityResponse("AddEntity result");
    }

}
