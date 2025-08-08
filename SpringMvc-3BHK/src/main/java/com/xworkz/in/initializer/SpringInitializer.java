package com.xworkz.in.initializer;

import com.xworkz.in.Runner.Runner;
import com.xworkz.in.configure.Configure;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    //mvc
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Runner.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Configure.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
