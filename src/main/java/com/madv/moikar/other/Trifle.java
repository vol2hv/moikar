package com.madv.moikar.other;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class Trifle {
    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return  word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    /**
     * Returns the viewName to return for coming back to the sender url
     *
     * @param request Instance of {@link HttpServletRequest} or use an injected instance
     * @return Optional with the view name. Recomended to use an alternativa url with
     * {@link Optional#orElse(Object)}
     */

}
