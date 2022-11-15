package goralski.piotr.gotoapproach.business.dto;

public class AddEntityResponse {

    private String response;

    public AddEntityResponse(String response) {
        setResponse(response);
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
