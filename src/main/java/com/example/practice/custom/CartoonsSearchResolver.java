package com.example.practice.custom;

import com.example.practice.model.CartoonsSearch;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CartoonsSearchResolver implements HandlerMethodArgumentResolver {


    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType() == CartoonsSearch.class;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {

        CartoonsSearch cartoonsSearch = new CartoonsSearch();

        String date = nativeWebRequest.getParameter("date");
        String genre = nativeWebRequest.getParameter("genre");
        String finished = nativeWebRequest.getParameter("finished");

        if (date==null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.format(new Date());
        }
        //null일 경우 분기처리
        System.out.println(date);
        System.out.println(genre);
        System.out.println(finished);


        return cartoonsSearch;
    }
}
