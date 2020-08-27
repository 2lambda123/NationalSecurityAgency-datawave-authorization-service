package datawave.microservice.authorization.oauth;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
@ConfigurationProperties(prefix = "spring.security.datawave.oauth")
public class OAuthProperties {
    
    private Map<String,AuthorizedClient> authorizedClients = new LinkedHashMap<>();
    private long authCodeTtl = -1;
    private long idTokenTtl = -1;
    private long refreshTokenTtl = -1;
    
    public Map<String,AuthorizedClient> getAuthorizedClients() {
        return authorizedClients;
    }
    
    public void setAuthorizedClients(List<AuthorizedClient> authorizedClients) {
        this.authorizedClients.clear();
        authorizedClients.forEach(c -> this.authorizedClients.put(c.getClient_id(), c));
    }
    
    public void setAuthCodeTtl(long authCodeTtl) {
        this.authCodeTtl = authCodeTtl;
    }
    
    public long getAuthCodeTtl(TimeUnit timeUnit) {
        return timeUnit.convert(authCodeTtl, TimeUnit.SECONDS);
    }
    
    public void setIdTokenTtl(long idTokenTtl) {
        this.idTokenTtl = idTokenTtl;
    }
    
    public long getIdTokenTtl(TimeUnit timeUnit) {
        return timeUnit.convert(idTokenTtl, TimeUnit.SECONDS);
    }
    
    public void setRefreshTokenTtl(long refreshTokenTtl) {
        this.refreshTokenTtl = refreshTokenTtl;
    }
    
    public long getRefreshTokenTtl(TimeUnit timeUnit) {
        return timeUnit.convert(refreshTokenTtl, TimeUnit.SECONDS);
    }
}
