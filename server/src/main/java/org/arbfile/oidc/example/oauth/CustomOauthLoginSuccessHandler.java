package org.arbfile.oidc.example.oauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomOauthLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler
{
    private Logger logger = LoggerFactory.getLogger(CustomOauthLoginSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
        throws ServletException, IOException
    {
        logger.info("OAUTH custom success handler");
        logger.info("Authentication class impl = " + authentication.getClass().getCanonicalName());
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
