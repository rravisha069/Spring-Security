package in.ravi.SpringbootSpringSecurityJWTFromScratch;

public class AuthenticationResponse {

    private String JwtToken;

    public AuthenticationResponse(String jwtToken) {
        JwtToken = jwtToken;
    }

    public String getJwtToken() {
        return JwtToken;
    }

    public void setJwtToken(String jwtToken) {
        JwtToken = jwtToken;
    }
}
