package cz.muni.fi.pa165.monsterslayers.frontend.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Custom auth entry point returning 200 OK.
 *
 * @author Ondrej Budai
 */
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.sendError( HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized" );
    }
}
