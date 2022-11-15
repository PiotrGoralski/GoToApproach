package goralski.piotr.gotoapproach.business.functions;

import goralski.piotr.gotoapproach.business.dto.AddEntityRequest;
import goralski.piotr.gotoapproach.business.dto.AddEntityResponse;
import goralski.piotr.gotoapproach.business.library.GoTo;
import goralski.piotr.gotoapproach.business.library.IGoTo;

public class GetEntity extends GoTo<String> implements IGoTo<String, String> {

    public GetEntity(String data) {
        super.proceed(task(data));
    }

    @Override
    public String task(String data) {
        //PROCEED LOGIC
        System.out.println("GetEntity - proceeding - " + data);

        return "GetEntity result";
    }

}
