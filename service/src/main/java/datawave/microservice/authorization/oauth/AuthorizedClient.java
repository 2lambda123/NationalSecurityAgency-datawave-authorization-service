package datawave.microservice.authorization.oauth;

public class AuthorizedClient {
    
    private String client_id;
    private String client_name;
    private String client_secret;
    
    public String getClient_id() {
        return client_id;
    }
    
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }
    
    public String getClient_name() {
        return client_name;
    }
    
    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }
    
    public String getClient_secret() {
        return client_secret;
    }
    
    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }
}
